package hu.bme.mit.inf.essbase.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import hu.bme.mit.inf.essbase.DataQuery;
import hu.bme.mit.inf.essbase.ReportCreation;
import hu.bme.mit.inf.essbase.ReportParser;

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

		ReportCreation cr = new ReportCreation();
        String dir="Temp";
		
		try {
			IProject lproject=cr.CreateProject("teszt");
			cr.createDir(lproject, null, dir, true);
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(window.getShell(), "Latex", rawReport);
		return null;

	}
}
