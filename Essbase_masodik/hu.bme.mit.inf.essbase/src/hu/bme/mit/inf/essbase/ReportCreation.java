package hu.bme.mit.inf.essbase;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;

import com.essbase.api.base.EssException;
import com.essbase.api.dataquery.IEssGridView;

import net.sourceforge.texlipse.builder.TexlipseNature;
import net.sourceforge.texlipse.properties.TexlipseProperties;
import net.sourceforge.texlipse.wizards.TexlipseProjectAttributes;
import net.sourceforge.texlipse.wizards.TexlipseProjectCreationOperation;

public class ReportCreation {
	public static String reportOut;

	public IProject createProject(String name) throws CoreException {
		// Referring a project in the workspace by it's name
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);

		// If the project is not exist it will be created.
		IProgressMonitor monitor = new NullProgressMonitor();
		if (!project.exists())
			project.create(monitor);

		// The project should be opened.
		project.open(IResource.BACKGROUND_REFRESH, monitor);

		// Setting natures of the project
		IProjectDescription desc = project.getDescription();
		desc.setNatureIds(new String[] { "net.sourceforge.texlipse.builder.TexlipseNature" }
		/* ,"org.eclipse.pde.PluginNature" } */);
		project.setDescription(desc, monitor);
		project.setDefaultCharset("Cp1250", new NullProgressMonitor());
		// project.getFolder("src");
		return project;
	}

	public void createDir(IProject project, IProgressMonitor monitor, String dir, boolean derivedAsDefault)
			throws CoreException {
		if (dir != null && dir.length() > 0) {
			IFolder folder = project.getFolder(dir);
			folder.create(true, true, monitor);
			if (derivedAsDefault) {
				folder.setDerived(true);
			}
		}
	}

	public IFile createMainFile(IFile file, boolean derived, CharSequence content) throws CoreException {
		// If the file existed before, and it is not editable, it should be
		// deleted
		IProgressMonitor monitor = new NullProgressMonitor();
		if (file.exists() && file.isDerived())
			file.delete(true, monitor);

		// Create the file if it is to exists.
		if (!file.exists()) {
			file.create(new ByteArrayInputStream(content.toString().getBytes()), true, monitor);

			// Setting the properties of the file.
			if (derived)
				file.setDerived(true, monitor);
		}

		// Return with the file.
		return file;
	}

	public IFile createProject2(String name) throws InvocationTargetException, InterruptedException {

		TexlipseProjectAttributes attr = new TexlipseProjectAttributes();
		attr.setProjectName(name);
		attr.setLanguageCode("hu");
		attr.setTemplate("Article");
		attr.setOutputFormat(TexlipseProperties.OUTPUT_FORMAT_PDF);
		attr.setBuilder(2);
		TexlipseProjectCreationOperation2 pr = new TexlipseProjectCreationOperation2(attr);
		pr.run(null);

		return pr.getMainFile();
	}

	@SuppressWarnings("deprecation")
	public void setLatexContent(IFile mainFile, IEssGridView grid, String projectName,String repUrl) throws EssException, FileNotFoundException {

		Template t = new Template();
		int cntRows = 0, cntCols = 0;
		cntRows = grid.getCountRows();
		cntCols = grid.getCountColumns();
		Double ktgh = 0.0, szolg = 0.0, gepj = 0.0, ugyf = 0.0, sum = 0.0;

		Hashtable<String, String> objectNumber = new Hashtable<String, String>();
		Hashtable<String, String> costNumber = new Hashtable<String, String>();
		Integer clnumber = 0, conumber = 0;

		StringConcatenation objectData = new StringConcatenation();
		objectData.append(" l_0 l_1 l_2");
		objectData.newLine();

		for (int i = 0; i < cntRows; i++) {
			for (int j = 0; j < cntCols; j++) {
				if (grid.getValue(i, j).toString().contains("KH")) {
					ktgh += Double.valueOf(grid.getValue(i, j + 2).toString().replace("E", ""));
				} else if (grid.getValue(i, j).toString().contains("SZOL")) {
					szolg += Double.valueOf(grid.getValue(i, j + 2).toString().replace("E", ""));
				} else if (grid.getValue(i, j).toString().contains("GEPJ")
						|| grid.getValue(i, j).toString().contains("SZGK")) {
					gepj += Double.valueOf(grid.getValue(i, j + 2).toString().replace("E", ""));
				} else if (grid.getValue(i, j).toString().contains("UGYF")) {
					ugyf += Double.valueOf(grid.getValue(i, j + 2).toString().replace("E", ""));
				}

				if (grid.getValue(i, j).toString().contains(reportOut)) {
					if (!objectNumber.contains(grid.getValue(i, j).toString())) {
						clnumber++;
						objectNumber.put(grid.getValue(i, j).toString(), clnumber.toString());
					}
					if (!costNumber.contains(grid.getValue(i, j + 1).toString())) {
						conumber++;
						costNumber.put(grid.getValue(i, j + 1).toString(), conumber.toString());
					}

					objectData
							.append(" " + objectNumber.get(grid.getValue(i, j).toString()) + " "
									+ costNumber.get(grid.getValue(i, j + 1).toString()) + " "
									+ new Double(
											Double.valueOf(grid.getValue(i, j + 2).toString().replace("E", "")) % 29)
													.toString());
					objectData.newLine();
				}
			}
		}
		sum = ktgh + szolg + gepj + ugyf;
		ktgh /= sum;
		ktgh *= 100;
		szolg /= sum;
		szolg *= 100;
		gepj /= sum;
		gepj *= 100;
		ugyf /= sum;
		ugyf *= 100;
		InputStream str = new StringBufferInputStream(
				t.getLatexContent(Math.round(ktgh), Math.round(szolg), Math.round(gepj), Math.round(ugyf)).toString());

		IProject latexProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFolder plotFolder = latexProject.getFolder("plotdata");
		try {
			plotFolder.create(true, true, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IFile dataFile = plotFolder.getFile("data.dat");
		try {
			dataFile.create(new StringBufferInputStream(objectData.toString()), 0, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		
		IFolder rawFolder = latexProject.getFolder("raw");
		try {
			rawFolder.create(true, true, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IFile rawFile = rawFolder.getFile("raw_rep.pl");
		try {
			rawFile.create(new FileInputStream(repUrl), 0, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		try {
			mainFile.setContents(str, 1, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
