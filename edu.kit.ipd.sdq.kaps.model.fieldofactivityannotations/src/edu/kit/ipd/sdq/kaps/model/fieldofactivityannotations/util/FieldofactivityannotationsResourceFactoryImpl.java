/**
 */
package edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.util.FieldofactivityannotationsResourceImpl
 * @generated
 */
public class FieldofactivityannotationsResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofactivityannotationsResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new FieldofactivityannotationsResourceImpl(uri);
		return result;
	}

} //FieldofactivityannotationsResourceFactoryImpl