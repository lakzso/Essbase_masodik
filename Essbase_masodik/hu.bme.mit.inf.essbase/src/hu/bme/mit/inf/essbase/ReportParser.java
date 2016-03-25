package hu.bme.mit.inf.essbase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Child;
import org.xtext.example.mydsl.myDsl.Column;
import org.xtext.example.mydsl.myDsl.DimensionDeclaration;
import org.xtext.example.mydsl.myDsl.Link;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Reference;
import org.xtext.example.mydsl.myDsl.Row;
import org.xtext.example.mydsl.myDsl.Statement;

public class ReportParser {
    public  String Parser(String url){
		  
    	MyDslStandaloneSetup.doSetup();
		ResourceSet resSet = new ResourceSetImpl();
		Resource res = resSet.getResource(URI.createFileURI(url), true);

		Model m = (Model) res.getContents().get(0);
		String Report = "{SUPEMPTYROWS}";
		Report+= "{DECIMAL 10}";
		Report+= "{TABDELIMIT}";
		Report+= "{ROWREPEAT}";
		Report+= "{SUPBRACKETS}";
		Report+= "{SUPCOMMAS}";
		Report+= "{NOINDENTGEN} ";
		DimensionDeclaration dim = null;
		Column col = null;
		Row row = null;
		Child child;
	    Link link;
		
		for (Statement statement : m.getStatements()) {
			if (statement instanceof Column) {
				col = (Column) statement;
				Report += " <Column (";
				for (Reference ref : col.getDimensions()) {
					Report += "\""+ref.getReferred().getValue() + "\",";	
				}
				Report = Report.substring(0, Report.length() - 1);
				Report += ")";
			} else if (statement instanceof Row) {
				row = (Row) statement;
				Report += " <Row (";
				for (Reference ref : row.getDimensions()) {
					Report += "\""+ref.getReferred().getValue() + "\",";	
				}
				Report = Report.substring(0, Report.length() - 1);
				Report += ")";
			} else if (statement instanceof Child) {
				child = (Child) statement;
				Report += " <Ichild ";
				for (Reference ref : child.getDimensions()) {
					Report += "\""+ref.getReferred().getValue() + "\",";	
				}
				Report = Report.substring(0, Report.length() - 1);
				
			}
			else if (statement instanceof Link) {
				link = (Link) statement;
				Report += " <LINK(<DESCENDANTS(\""+link.getDesc().getReferred().getValue()+"\") AND <LEV (\""+ link.getLev().getReferred().getValue() +"\",  0))";
			}
		}
		Report+=" !";
    	
    	
    	
    	return Report;  
      }
}
