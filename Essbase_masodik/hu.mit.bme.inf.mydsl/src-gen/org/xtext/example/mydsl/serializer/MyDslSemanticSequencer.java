/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Child;
import org.xtext.example.mydsl.myDsl.Column;
import org.xtext.example.mydsl.myDsl.Descendants;
import org.xtext.example.mydsl.myDsl.DimensionDeclaration;
import org.xtext.example.mydsl.myDsl.GroupDeclaration;
import org.xtext.example.mydsl.myDsl.MemberDeclaration;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Reference;
import org.xtext.example.mydsl.myDsl.Row;
import org.xtext.example.mydsl.myDsl.StringReference;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CHILD:
				sequence_Child(context, (Child) semanticObject); 
				return; 
			case MyDslPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case MyDslPackage.DESCENDANTS:
				sequence_Descendants(context, (Descendants) semanticObject); 
				return; 
			case MyDslPackage.DIMENSION_DECLARATION:
				sequence_DimensionDeclaration(context, (DimensionDeclaration) semanticObject); 
				return; 
			case MyDslPackage.GROUP_DECLARATION:
				sequence_GroupDeclaration(context, (GroupDeclaration) semanticObject); 
				return; 
			case MyDslPackage.MEMBER_DECLARATION:
				sequence_MemberDeclaration(context, (MemberDeclaration) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case MyDslPackage.ROW:
				sequence_Row(context, (Row) semanticObject); 
				return; 
			case MyDslPackage.STRING_REFERENCE:
				sequence_StringReference(context, (StringReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Child
	 *     Child returns Child
	 *
	 * Constraint:
	 *     (dimensions+=Reference dimensions+=Reference*)
	 */
	protected void sequence_Child(ISerializationContext context, Child semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Column
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (dimensions+=Reference dimensions+=Reference*)
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Descendants
	 *     Descendants returns Descendants
	 *
	 * Constraint:
	 *     (group=ID dimension=Reference)
	 */
	protected void sequence_Descendants(ISerializationContext context, Descendants semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DESCENDANTS__GROUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DESCENDANTS__GROUP));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DESCENDANTS__DIMENSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DESCENDANTS__DIMENSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescendantsAccess().getGroupIDTerminalRuleCall_1_0(), semanticObject.getGroup());
		feeder.accept(grammarAccess.getDescendantsAccess().getDimensionReferenceParserRuleCall_3_0(), semanticObject.getDimension());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DimensionDeclaration
	 *     Declaration returns DimensionDeclaration
	 *     DimensionDeclaration returns DimensionDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_DimensionDeclaration(ISerializationContext context, DimensionDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDimensionDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDimensionDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns GroupDeclaration
	 *     Declaration returns GroupDeclaration
	 *     GroupDeclaration returns GroupDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_GroupDeclaration(ISerializationContext context, GroupDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGroupDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGroupDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MemberDeclaration
	 *     Declaration returns MemberDeclaration
	 *     MemberDeclaration returns MemberDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_MemberDeclaration(ISerializationContext context, MemberDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMemberDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     Statements+=Statement+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Reference
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     referred=[Declaration|ID]
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.REFERENCE__REFERRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.REFERENCE__REFERRED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceAccess().getReferredDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.getReferred());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Row
	 *     Row returns Row
	 *
	 * Constraint:
	 *     (dimensions+=Reference dimensions+=Reference*)
	 */
	protected void sequence_Row(ISerializationContext context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns StringReference
	 *     Reference returns StringReference
	 *     StringReference returns StringReference
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringReference(ISerializationContext context, StringReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STRING_REFERENCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STRING_REFERENCE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringReferenceAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
