package hu.bme.mit.inf.essbase;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.essbase.api.base.EssException;
import com.essbase.api.dataquery.IEssGridView;

import net.sourceforge.texlipse.builder.TexlipseNature;
import net.sourceforge.texlipse.properties.TexlipseProperties;
import net.sourceforge.texlipse.wizards.TexlipseProjectAttributes;
import net.sourceforge.texlipse.wizards.TexlipseProjectCreationOperation;

public class ReportCreation {

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

	public void setLatexContent(IFile mainFile, IEssGridView grid,String projectName) throws EssException {

		Template t = new Template();
		int cntRows = 0, cntCols = 0;
		cntRows = grid.getCountRows();
		cntCols = grid.getCountColumns();
		Double ktgh = 0.0, szolg = 0.0, gepj = 0.0, ugyf = 0.0,sum=0.0;

		for (int i = 0; i < cntRows; i++) {
			for (int j = 0; j < cntCols; j++)
				if (grid.getValue(i, j).toString().contains("KH")) {
					ktgh+=Double.valueOf(grid.getValue(i, j+2).toString().replace("E", ""));
				}
				else if (grid.getValue(i, j).toString().contains("SZOL")) {
					szolg+=Double.valueOf(grid.getValue(i, j+2).toString().replace("E", ""));
				}
				else if (grid.getValue(i, j).toString().contains("GEPJ") ||
						grid.getValue(i, j).toString().contains("SZGK") ) {
					gepj+=Double.valueOf(grid.getValue(i, j+2).toString().replace("E", ""));
				}
				else if (grid.getValue(i, j).toString().contains("UGYF")) {
					ugyf+=Double.valueOf(grid.getValue(i, j+2).toString().replace("E", ""));
				}
		}
        sum=ktgh+szolg+gepj+ugyf;
        ktgh/=sum;
        ktgh*=100;
        szolg/=sum;
        szolg*=100;
        gepj/=sum;
        gepj*=100;
        ugyf/=sum;
        ugyf*=100;
		@SuppressWarnings("deprecation")
		InputStream str = new StringBufferInputStream(t.getLatexContent( Math.round(ktgh), Math.round(szolg), Math.round(gepj), Math.round(ugyf)).toString());
        
	
		
		
		IProject latexProject=ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFolder plotFolder=latexProject.getFolder("plotdata");
		try {
			plotFolder.create(true, true, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IFile dataFile=plotFolder.getFile("data.dat");
		try {
			dataFile.create(null, 0, null);
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
