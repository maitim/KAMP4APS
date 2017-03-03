/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calibration Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.CalibrationSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.CalibrationSpecification#getRole <em>Role</em>}</li>
 *   <li>{@link fieldofactivityannotations.CalibrationSpecification#getCalibrationConfig <em>Calibration Config</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationSpecification()
 * @model
 * @generated
 */
public interface CalibrationSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationSpecification_Parent()
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification
	 * @model opposite="calibrationSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.CalibrationSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationSpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.CalibrationSpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Calibration Config</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.CalibrationConfiguration}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.CalibrationConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration Config</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationSpecification_CalibrationConfig()
	 * @see fieldofactivityannotations.CalibrationConfiguration#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<CalibrationConfiguration> getCalibrationConfig();

} // CalibrationSpecification