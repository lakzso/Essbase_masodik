package hu.bme.mit.inf.essbase;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import essbase_model.Dimension;
import essbase_model.Essbase_modelFactory;
import essbase_model.Essbase_modelPackage;

public class QueryVerification {
	  public static void main(String[] args) {
          // Initialize the model
		  Essbase_modelPackage.eINSTANCE.eClass();
          // Retrieve the default factory singleton
		  Essbase_modelFactory factory = Essbase_modelFactory.eINSTANCE;

          // create the content of the model via this program
		  Dimension dim = factory.createDimension();
          dim.setName("Teszt");
		  
          // Register the XMI resource factory for the .website extension

          Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
          Map<String, Object> m = reg.getExtensionToFactoryMap();
          m.put("essbase", new XMIResourceFactoryImpl());

          // Obtain a new resource set
          ResourceSet resSet = new ResourceSetImpl();

          // create a resource
          Resource resource = resSet.createResource(URI.createURI("essbase/teszt.essbase_model"));
          // Get the first model element and cast it to the right type, in my
          // example everything is hierarchical included in this first node
          resource.getContents().add(dim);

          // now save the content.
          try {
                  resource.save(Collections.EMPTY_MAP);
          } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
          }
          
          
  }
}