package hu.bme.mit.inf.essbase.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.essbase.api.dataquery.IEssGridView;

import hu.bme.mit.inf.essbase.DataQuery;
import hu.bme.mit.inf.essbase.ReportCreation;
import hu.bme.mit.inf.essbase.ReportParser;
import net.sourceforge.texlipse.TexlipsePlugin;
import net.sourceforge.texlipse.builder.TexlipseBuilder;

import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class LatexHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public LatexHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActivePart();
		IFile file = (IFile) workbenchPart.getSite().getPage().getActiveEditor().getEditorInput()
				.getAdapter(IFile.class);
		String content = file.getName();
		ReportParser rp = new ReportParser();
		String rawReport = rp.Parser(file.getLocation().toString());
		DataQuery query = new DataQuery();
		IEssGridView grid=query.query(rawReport);
		ReportCreation cr = new ReportCreation();
		String dir = "Temp";
		
		try {
			IProject lproject = cr.createProject("teszt");
			cr.createDir(lproject, null, dir, true);
			StringBuilder latexReport = cr.getLatexContent(grid);
			IFile mainFile = lproject.getFile("/tesztelo.tex");
			cr.createMainFile(mainFile, false, latexReport);
			
			lproject.open(null);
			lproject.build(IncrementalProjectBuilder.AUTO_BUILD, null);
            
			
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(window.getShell(), "Latex", rawReport);
		return null;

	}
}
