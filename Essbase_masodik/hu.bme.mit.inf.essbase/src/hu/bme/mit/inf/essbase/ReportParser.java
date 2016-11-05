package hu.bme.mit.inf.essbase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

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
import org.xtext.example.mydsl.myDsl.Query;
import org.xtext.example.mydsl.myDsl.QueryMDX;
import org.xtext.example.mydsl.myDsl.QueryReport;
import org.xtext.example.mydsl.myDsl.Reference;
import org.xtext.example.mydsl.myDsl.Report;
import org.xtext.example.mydsl.myDsl.ReportParameter;
import org.xtext.example.mydsl.myDsl.ReportQueryParameters;
import org.xtext.example.mydsl.myDsl.Row;

public class ReportParser {
	public SortedMap<String, String> QueriesReport;
	public SortedMap<String, String> QueriesMDX;
	public List<String> ToQueryReportQueries;
	public List<String> ToQueryMDXQueries;
	
	public void Parser(String url) {

		MyDslStandaloneSetup.doSetup();
		ResourceSet resSet = new ResourceSetImpl();
		Resource res = resSet.getResource(URI.createFileURI(url), true);
		Model m = (Model) res.getContents().get(0);
		String QueryString = null;

		QueriesReport = new TreeMap<String, String>();
		QueriesMDX= new TreeMap<String, String>();

		ToQueryReportQueries = new ArrayList<String>();
		ToQueryMDXQueries= new ArrayList<String>();
		for (Query q : m.getQueries()) {
			if (q instanceof QueryReport) {
				QueryString = "{SUPEMPTYROWS}";
				QueryString += "{DECIMAL 10}";
				QueryString += "{TABDELIMIT}";
				QueryString += "{ROWREPEAT}";
				QueryString += "{SUPBRACKETS}";
				QueryString += "{SUPCOMMAS}";
				QueryString += "{NOINDENTGEN} ";
				DimensionDeclaration dim = null;
				Column col = null;
				Row row = null;
				Child child;
				Link link;
				ReportParameter rep;
				QueryReport qr = (QueryReport) q;
                
				for (ReportQueryParameters RepParam : qr.getQueryReport()) {
					if (RepParam instanceof Column) {
						col = (Column) RepParam;
						QueryString += " <Column (";
						for (Reference ref : col.getDimensions()) {
							QueryString += "\"" + ref.getReferred().getValue() + "\",";
						}
						QueryString = QueryString.substring(0, QueryString.length() - 1);
						QueryString += ")";
					} else if (RepParam instanceof Row) {
						row = (Row) RepParam;
						QueryString += " <Row (";
						for (Reference ref : row.getDimensions()) {
							QueryString += "\"" + ref.getReferred().getValue() + "\",";
						}
						QueryString = QueryString.substring(0, QueryString.length() - 1);
						QueryString += ")";
					} else if (RepParam instanceof Child) {
						child = (Child) RepParam;
						QueryString += " <Ichild ";
						for (Reference ref : child.getDimensions()) {
							QueryString += "\"" + ref.getReferred().getValue() + "\",";
						}
						QueryString = QueryString.substring(0, QueryString.length() - 1);

					} else if (RepParam instanceof Link) {
						link = (Link) RepParam;
						QueryString += " <LINK(<DESCENDANTS(\"" + link.getDesc().getReferred().getValue()
								+ "\") AND <LEV (\"" + link.getLev().getReferred().getValue() + "\",  0))";
					} else if (RepParam instanceof ReportParameter) {
						rep = (ReportParameter) RepParam;
						ReportCreation.reportOut = rep.getReparam().getValue().toString();
					}

				}
				QueryString += " !";
				QueriesReport.put(q.getName().toString(), QueryString);
				for (Report repout : m.getReports()) {
					if (QueriesReport.containsKey(repout.getRepout().getName())) {
						ToQueryReportQueries.add(QueriesReport.get(repout.getRepout().getName()));
					}

				}

			}
		  else if (q instanceof QueryMDX){
			   QueryMDX mdx=(QueryMDX) q;
			   QueryString="SELECT " + mdx.getR()+"."+ mdx.getFr()+  " On Rows " + mdx.getC()+"."+ mdx.getFc()+ " On Columns" ;
			   QueriesMDX.put(q.getName().toString(), QueryString);
			   for (Report repout : m.getReports()) {
					if (QueriesMDX.containsKey(repout.getRepout().getName())) {
						ToQueryMDXQueries.add(QueriesMDX.get(repout.getRepout().getName()));
					}

				}
		   } 

		}
	}
}
