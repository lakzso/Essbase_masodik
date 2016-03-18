package hu.bme.mit.inf.essbase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.essbase.api.dataquery.IEssGridView;

import net.sourceforge.texlipse.wizards.TexlipseProjectAttributes;
import net.sourceforge.texlipse.wizards.TexlipseProjectCreationOperation;

public class ReportCreation {
	
public IProject createProject(String name, String[] natureIds) throws CoreException {
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
		desc.setNatureIds(natureIds
			/*new String[] { "org.eclipse.jdt.core.javanature"
		     ,"org.eclipse.pde.PluginNature" }*/);
		project.setDescription(desc, monitor);
		project.setDefaultCharset("UTF-8", new NullProgressMonitor());
		//project.getFolder("src");
		return project;
	}
 public void CreateLatexReportAndProject(IEssGridView grid) throws InvocationTargetException, InterruptedException{
	 
	 /*int cntRows = grid.getCountRows(), cntCols = grid.getCountColumns();
	 for (int i = 0; i < cntRows; i++) {
			for (int j = 0; j < cntCols; j++)
				System.out.print(grid.getValue(i, j) + "\t");
			System.out.println();
		}
	 */
	 TexlipseProjectAttributes attr=new TexlipseProjectAttributes();
	 attr.setProjectName("LatexReport2");
	 attr.setLanguageCode("hu");
	 attr.setOutputFormat("pdf");
	 attr.setTemplate("Article");
	 TexlipseProjectCreationOperation pr=new TexlipseProjectCreationOperation (attr);
	 pr.run(null);
	 
  }
}
