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

import com.essbase.api.dataquery.IEssGridView;

import net.sourceforge.texlipse.builder.TexlipseNature;
import net.sourceforge.texlipse.properties.TexlipseProperties;
import net.sourceforge.texlipse.wizards.TexlipseProjectAttributes;
import net.sourceforge.texlipse.wizards.TexlipseProjectCreationOperation;

public class ReportCreation {
	
public IProject createProject(String name) throws CoreException {
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
public IFile createMainFile(IFile file,
		boolean derived, CharSequence content) throws CoreException
{
	// If the file existed before, and it is not editable, it should be
	// deleted
	IProgressMonitor monitor = new NullProgressMonitor();
	if (file.exists() && file.isDerived())
		file.delete(true, monitor);

	// Create the file if it is to exists.
	if (!file.exists()) {
		file.create(
				new ByteArrayInputStream(content.toString().getBytes()),
				true, monitor);

		// Setting the properties of the file.
		if (derived)
			file.setDerived(true, monitor);
	}

	// Return with the file.
	return file;
}
public StringBuilder getLatexContent(IEssGridView grid) throws CoreException
{ 	  
	StringBuilder sb=new StringBuilder();
	
	  sb.append("\\documentclass{standalone}");
	  sb.append("\\usepackage{pgfplots}");
	  sb.append("\\begin{document}");
	  sb.append("\\begin{tikzpicture}");
	  sb.append("\\begin{axis}[ ");
	  sb.append("xlabel=$x$,");
	  sb.append("ylabel={$f(x) = x^2 - x +4$}");
	  sb.append("] ");
	  sb.append("\\addplot {x^2 - x +4};"); 
	  sb.append("\\end{axis}");
	  sb.append("\\end{tikzpicture}");
	  sb.append("\\end{document}");
	  
	  return sb;
}


 public IFile createProject2(String name) throws InvocationTargetException, InterruptedException{
	 
	 TexlipseProjectAttributes attr=new TexlipseProjectAttributes();
	 attr.setProjectName(name);
	 attr.setLanguageCode("hu");
	 attr.setTemplate("Article");
	 attr.setOutputFormat(TexlipseProperties.OUTPUT_FORMAT_PDF);
	 attr.setBuilder(2);
	 TexlipseProjectCreationOperation2 pr=new TexlipseProjectCreationOperation2 (attr);
	 pr.run(null);
	 
	 return pr.getMainFile();
  }
 public void setLatexContent(IFile mainFile,IEssGridView grid){
	 
	 
	 
	 StringBuilder sb=new StringBuilder();
		
	  sb.append("\\documentclass{standalone}");
	  sb.append("\\usepackage{pgfplots}");
	  sb.append("\\begin{document}");
	  sb.append("\\begin{tikzpicture}");
	  sb.append("\\begin{axis}[ ");
	  sb.append("xlabel=$x$,");
	  sb.append("ylabel={$f(x) = x^2 - x +4$}");
	  sb.append("] ");
	  sb.append("\\addplot {x^2 - x +4};"); 
	  sb.append("\\end{axis}");
	  sb.append("\\end{tikzpicture}");
	  sb.append("\\end{document}");
	 
	  InputStream str=new StringBufferInputStream(sb.toString());
	  
	 try {
		mainFile.setContents(str, 1, null);
	} catch (CoreException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
 
 
}
