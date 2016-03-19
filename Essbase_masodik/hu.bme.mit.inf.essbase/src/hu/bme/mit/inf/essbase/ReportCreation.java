package hu.bme.mit.inf.essbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

import com.essbase.api.dataquery.IEssGridView;

import net.sourceforge.texlipse.builder.TexlipseNature;
import net.sourceforge.texlipse.wizards.TexlipseProjectAttributes;
import net.sourceforge.texlipse.wizards.TexlipseProjectCreationOperation;

public class ReportCreation {
	
public IProject CreateProject(String name) throws CoreException {
		// Referring a project in the workspace by it's name
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(name);

		// If the project is not exist it will be created.
		IProgressMonitor monitor = new NullProgressMonitor();
		if (!project.exists())
			project.create(monitor);

		// The project should be opened.
		project.open(IResource.BACKGROUND_REFRESH, monitor);

		// Setting natures of the project
		IProjectDescription desc = project.getDescription();
		desc.setNatureIds(
			new String[] { "net.sourceforge.texlipse.builder.TexlipseNature"}
		     /*,"org.eclipse.pde.PluginNature" }*/);
		project.setDescription(desc, monitor);
		project.setDefaultCharset("Cp1250", new NullProgressMonitor());
		//project.getFolder("src");
		return project;
	}
public void createDir(IProject project, IProgressMonitor monitor, String dir,
        boolean derivedAsDefault) throws CoreException {
    if (dir != null && dir.length() > 0) {
        IFolder folder = project.getFolder(dir);
        folder.create(true, true, monitor);
        if (derivedAsDefault) {
            folder.setDerived(true);
        }
    }
}


public void createMainFile(IProject project, IProgressMonitor monitor)
        throws CoreException {

    
	  IFile mainFile;
     // mainFile.create(stream, true, monitor);
}


 public void CreateLatexReportAndProject2(IEssGridView grid) throws InvocationTargetException, InterruptedException{
	 
	 /*int cntRows = grid.getCountRows(), cntCols = grid.getCountColumns();
	 for (int i = 0; i < cntRows; i++) {
			for (int j = 0; j < cntCols; j++)
				System.out.print(grid.getValue(i, j) + "\t");
			System.out.println();
		}
	 */
	 TexlipseProjectAttributes attr=new TexlipseProjectAttributes();
	 attr.setProjectName("LatexReport3");
	 attr.setLanguageCode("hu");
	 attr.setTemplate("Article");
	 attr.setOutputFormat("pdf");
	 TexlipseProjectCreationOperation pr=new TexlipseProjectCreationOperation (attr);
	 pr.run(null);
	 
	 
  }
}
