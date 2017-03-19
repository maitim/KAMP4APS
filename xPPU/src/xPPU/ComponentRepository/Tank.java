/**
 */
package xPPU.ComponentRepository;

import xPPU.InterfaceRepository.Screwing;
import xPPU.InterfaceRepository.WaterSupply;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ComponentRepository.Tank#getWatersupply <em>Watersupply</em>}</li>
 *   <li>{@link xPPU.ComponentRepository.Tank#getScrewing <em>Screwing</em>}</li>
 * </ul>
 *
 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getTank()
 * @model
 * @generated
 */
public interface Tank extends Component {
	/**
	 * Returns the value of the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watersupply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watersupply</em>' reference.
	 * @see #setWatersupply(WaterSupply)
	 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getTank_Watersupply()
	 * @model required="true"
	 * @generated
	 */
	WaterSupply getWatersupply();

	/**
	 * Sets the value of the '{@link xPPU.ComponentRepository.Tank#getWatersupply <em>Watersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watersupply</em>' reference.
	 * @see #getWatersupply()
	 * @generated
	 */
	void setWatersupply(WaterSupply value);

	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' reference.
	 * @see #setScrewing(Screwing)
	 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getTank_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link xPPU.ComponentRepository.Tank#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

} // Tank
