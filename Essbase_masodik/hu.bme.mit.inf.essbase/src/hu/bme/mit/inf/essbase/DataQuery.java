/*
    File: RunReport.java 1.1, 2006-7-19
    Copyright (c) 1991, 2007 Oracle and / or its affiliates. All rights reserved.
 */
package hu.bme.mit.inf.essbase;

import java.io.File;

import com.essbase.api.base.*;
import com.essbase.api.dataquery.IEssCubeView;
import com.essbase.api.dataquery.IEssGridView;
import com.essbase.api.dataquery.IEssOperation;
import com.essbase.api.session.*;
import com.essbase.api.datasource.*;
//import com.essbase.api.dataquery.*;
import com.essbase.api.domain.*;
//import com.essbase.api.metadata.*;
import com.essbase.api.base.*;
import com.essbase.api.session.*;
//import com.essbase.api.datasource.*;
import com.essbase.api.dataquery.*;
import com.essbase.api.metadata.*;
import com.essbase.api.domain.*;

/**
 * RunReport Example does the following: Signs on to essbase domain, Runs a
 * report and Signs Off.
 * 
 * In order for this sample to work in your environment, make sure to change the
 * s_* variables to suit your environment.
 * 
 * 
 *
 */
public class DataQuery {
	private static String s_userName = "weblogic";
	private static String s_password = "Admin123";

	/*
	 * Possible values for s_provider: "Embedded"
	 * "http://localhost:13080/aps/JAPI"
	 */
	private static String s_provider = "http://192.168.56.101:9001/aps/JAPI"; // Default
	private static String s_analyticSvrName = "192.168.56.101";

	private static String s_olapSvrName = "EssbaseCluster-1";
	private static String s_appName = "Szakdolgozat";
	private static String s_cubeName = "SZKD";

	private static final int FAILURE_CODE = 1;

	public IEssGridView query(String report) {
		int statusCode = 0;
		IEssbase ess = null;
		IEssCubeView cv = null;
		IEssGridView grid=null;
		try {

			// Create JAPI instance.
			ess = IEssbase.Home.create(IEssbase.JAPI_VERSION);

			// Sign on to the provider, and perform data query operations.
			IEssDomain dom = ess.signOn(s_userName, s_password, false, null, s_provider);
			cv = dom.openCubeView("Data Query Example", s_analyticSvrName, s_appName, s_cubeName);

			// Set couple of cube view properties.
			cv.setRepeatMemberNames(false);
			cv.setIncludeSelection(true);
			cv.updatePropertyValues();

			grid = cv.getGridView();
			grid.setSize(3, 12);
			IEssOperation op = null;
			op = cv.createIEssOpRetrieve();
			((IEssOpRetrieve) op).setQuery(
				// Perform the operation.
					report,
					IEssCubeView.EEssQueryGrammar.ESSBASE);

			cv.performOperation(op);

			// Get the result and print the output.
			int cntRows = grid.getCountRows(), cntCols = grid.getCountColumns();

			System.out.print(
					"Query Results for the Operation:  \n" + "-----------------------------------------------------\n");
			for (int i = 0; i < cntRows; i++) {
				for (int j = 0; j < cntCols; j++)
					System.out.print(grid.getValue(i, j) + "\t");
				System.out.println();
			}
		
		} catch (EssException x) {
			System.err.println("ERROR: " + x.getMessage());
			statusCode = FAILURE_CODE;
		}
		return grid;
	}

	public void queryNative(String report) {
		int statusCode = 0;
		IEssbase ess = null;
		IEssOlapServer olapSvr = null;
		try {

			// Create JAPI instance.
			ess = IEssbase.Home.create(IEssbase.JAPI_VERSION);

			// Sign On to the Provider
			IEssDomain dom = ess.signOn(s_userName, s_password, false, null, s_provider);

			// Open connection with OLAP server and get the cube.
			olapSvr = (IEssOlapServer) dom.getOlapServer(s_olapSvrName);
			olapSvr.connect();

			IEssCube cube = olapSvr.getApplication(s_appName).getCube(s_cubeName);
			executeReport(cube);
			System.out.println("\nReport Execution Sample Completed.");
		} catch (EssException x) {
			System.out.println("Error: " + x.getMessage());
			statusCode = FAILURE_CODE;
		} finally {
			// Close OLAP server connection and sign off from the domain.
			try {
				if (olapSvr != null && olapSvr.isConnected() == true)
					olapSvr.disconnect();
			} catch (EssException x) {
				System.err.println("Error: " + x.getMessage());
			}

			try {
				if (ess != null && ess.isSignedOn() == true)
					ess.signOff();
			} catch (EssException x) {
				System.err.println("Error: " + x.getMessage());
			}
		}
		
		// Set status to failure only if exception occurs and do abnormal
		// termination
		// otherwise, it will by default terminate normally
		if (statusCode == FAILURE_CODE)
			System.exit(FAILURE_CODE);
		
	}

	static void executeReport(IEssCube cube) throws EssException {
		try {
			// Execute a report by passing the specification string.
			String testReport = "{SUPEMPTYROWS}" + "{DECIMAL 10}" + "{TABDELIMIT}" + "{ROWREPEAT}" + "{SUPBRACKETS}"
					+ "{SUPCOMMAS}" + "{MISSINGTEXT \"\"}" + "{NOINDENTGEN}"
					+ "<ROW(\"C_Ciklus\", \"Év\", \"Hónap\", \"Verzió\", \"Input_KN_Költségnem\", \"Input_Objektum\", \"Output_KN_Költségnem\", \"Output_Objektum\", \"Partner_KN_Költségnem\", \"Partner_Objektum\", \"ALAP_Tervazonosító\",\"ANYAG_ANYAGSZÁM\")"
					+ "\"C_Input\"" + "\"Év\"" + "\"Hónap\"" + "\"Terv\""
					+ "<LINK(<DESCENDANTS(\"Input_.ZGEPK\") AND <LEV (\"Input_Objektum\",  0))"
					+ "<LINK(<DESCENDANTS(\"Input_KN_Költségnemek\") AND <LEV (\"Input_KN_Költségnem\",  0))"
					+ "<LINK(<DESCENDANTS(\"ALAP_Tervazonosítók\") AND <LEV (\"ALAP_Tervazonosító\",  0))"
					+ "\"ANYAG_Nincs\"" + "\"Partner_KN_Nincs\""

					+ "\"Output_KN_Költségnem\"" + "\"Output_Objektum\"" + "!";
			System.out.println("Executing a report by passing the specification string....");
			System.out.println("\n\nReport Output for spec: " + testReport + "\n----------------"
					+ "------------------------------------------------------------");
			String output = cube.report(testReport, true, false);
			System.out.println(output);

		} catch (EssException x) {
			System.err.println("Error: " + x.getMessage());
		}
	}

	static void acceptArgs(String[] args) throws EssException {
		if (args.length >= 4) {
			s_userName = args[0];
			s_password = args[1];
			s_olapSvrName = args[2];
			s_provider = args[3]; // PROVIDER
		} else if (args.length != 0) {
			System.err.println("ERROR: Incorrect Usage of this sample.");
			System.err.println(
					"Usage: java " + DataQuery.class.getName() + " <user> <password> <analytic server> <provider>");
			System.exit(1); // Simply end
		}
	}
}
