/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.ecore.EReference
import org.xtext.example.mydsl.myDsl.DimensionDeclaration
import org.eclipse.xtext.scoping.Scopes
import essbase_model.Essbase_modelPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry
import java.util.Map
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.example.mydsl.myDsl.Model
import essbase_model.Dimension
import java.util.List
import java.util.ArrayList
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.emf.ecore.EClassifier
import javax.lang.model.type.ReferenceType
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.EObjectDescription
import essbase_model.Essbase_Cube
import org.eclipse.emf.common.util.EList

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MyDslScopeProvider extends AbstractMyDslScopeProvider {
	
	Registry reg
	
	Map<String, Object> m
	ResourceSet resSet
	Resource resource
	Essbase_Cube cube
	Dimension di
	EList<Dimension> dimList
	List<IEObjectDescription> candidates 
	IResourceServiceProvider.Registry rspr
      IQualifiedNameConverter converter
	
	int i
	
	override getScope(EObject context, EReference reference) {
	

        // For example searching for all elements within the root Object's tree
       // val rootElement = EcoreUtil2.getRootContainer(context)
      //  val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Element)
        // Create IEObjectDescriptions and puts them into an IScope instance
      
      if (context instanceof DimensionDeclaration)   {
      	        
      	         // Initialize the model
                Essbase_modelPackage.eINSTANCE.eClass();

                // Register the XMI resource factory for the .website extension

                reg = Resource.Factory.Registry.INSTANCE;
                m = reg.getExtensionToFactoryMap();
                m.put("essbase_model", new XMIResourceFactoryImpl());

                // Obtain a new resource set
                resSet = new ResourceSetImpl();

                // Get the resource
                resource = resSet.getResource(URI.createURI("platform:/resource/RiportTeszteles/src/Teszt.essbase_model"), true);
                // Get the first model element and cast it to the right type, in my
                // example everything is hierarchical included in this first node     

      	        
      	        candidates = new ArrayList<IEObjectDescription>();
      	
      	        cube =  resource.getContents().get(0) as Essbase_Cube;
      	        
      	        
      	         dimList=cube.dimension
      	         
      	        for( i=0; i <=1;i++){
      	         candidates.add(EObjectDescription.create( dimList.get(i).name,dimList.get(i)));
                    
                }
       
            return new SimpleScope(candidates);
      }  
    
    
        
    return super.getScope(context, reference);
}

}
