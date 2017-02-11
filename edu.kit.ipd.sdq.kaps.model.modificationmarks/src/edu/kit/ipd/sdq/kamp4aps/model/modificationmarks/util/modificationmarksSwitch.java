/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.util;

import edu.kit.ipd.sdq.amp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.amp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.amp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.amp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.amp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import xPPU.ComponentRepository.Component;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage
 * @generated
 */
public class modificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static modificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = modificationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case modificationmarksPackage.ABSTRACT_KAPS_MODIFICATION_REPOSITORY: {
				AbstractKAPSModificationRepository<?> abstractKAPSModificationRepository = (AbstractKAPSModificationRepository<?>)theEObject;
				T1 result = caseAbstractKAPSModificationRepository(abstractKAPSModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractKAPSModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.KAPS_MODIFICATION_REPOSITORY: {
				KAPSModificationRepository kapsModificationRepository = (KAPSModificationRepository)theEObject;
				T1 result = caseKAPSModificationRepository(kapsModificationRepository);
				if (result == null) result = caseAbstractKAPSModificationRepository(kapsModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(kapsModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS: {
				KAPSSeedModifications kapsSeedModifications = (KAPSSeedModifications)theEObject;
				T1 result = caseKAPSSeedModifications(kapsSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(kapsSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE: {
				ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange = (ChangePropagationDueToHardwareChange)theEObject;
				T1 result = caseChangePropagationDueToHardwareChange(changePropagationDueToHardwareChange);
				if (result == null) result = caseChangePropagationStep(changePropagationDueToHardwareChange);
				if (result == null) result = caseAbstractChangePropagationStep(changePropagationDueToHardwareChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_COMPONENT: {
				ModifyComponent<?> modifyComponent = (ModifyComponent<?>)theEObject;
				T1 result = caseModifyComponent(modifyComponent);
				if (result == null) result = caseAbstractModification(modifyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_MODULE: {
				ModifyModule<?> modifyModule = (ModifyModule<?>)theEObject;
				T1 result = caseModifyModule(modifyModule);
				if (result == null) result = caseAbstractModification(modifyModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_STUCTURE: {
				ModifyStucture<?> modifyStucture = (ModifyStucture<?>)theEObject;
				T1 result = caseModifyStucture(modifyStucture);
				if (result == null) result = caseAbstractModification(modifyStucture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_INTERFACE: {
				ModifyInterface<?> modifyInterface = (ModifyInterface<?>)theEObject;
				T1 result = caseModifyInterface(modifyInterface);
				if (result == null) result = caseAbstractModification(modifyInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_POWER_SUPPLY: {
				ModifyPowerSupply modifyPowerSupply = (ModifyPowerSupply)theEObject;
				T1 result = caseModifyPowerSupply(modifyPowerSupply);
				if (result == null) result = caseModifyComponent(modifyPowerSupply);
				if (result == null) result = caseModifyInterface(modifyPowerSupply);
				if (result == null) result = caseAbstractModification(modifyPowerSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_SIGNALINTERFACE: {
				ModifySignalinterface modifySignalinterface = (ModifySignalinterface)theEObject;
				T1 result = caseModifySignalinterface(modifySignalinterface);
				if (result == null) result = caseModifyInterface(modifySignalinterface);
				if (result == null) result = caseAbstractModification(modifySignalinterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_PHYSICAL_CONNECTION: {
				ModifyPhysicalConnection modifyPhysicalConnection = (ModifyPhysicalConnection)theEObject;
				T1 result = caseModifyPhysicalConnection(modifyPhysicalConnection);
				if (result == null) result = caseModifyInterface(modifyPhysicalConnection);
				if (result == null) result = caseAbstractModification(modifyPhysicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_MICRO_SWITCH_MODULE: {
				ModifyMicroSwitchModule modifyMicroSwitchModule = (ModifyMicroSwitchModule)theEObject;
				T1 result = caseModifyMicroSwitchModule(modifyMicroSwitchModule);
				if (result == null) result = caseModifyComponent(modifyMicroSwitchModule);
				if (result == null) result = caseAbstractModification(modifyMicroSwitchModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_BUS_BOX: {
				ModifyBusBox modifyBusBox = (ModifyBusBox)theEObject;
				T1 result = caseModifyBusBox(modifyBusBox);
				if (result == null) result = caseModifyComponent(modifyBusBox);
				if (result == null) result = caseAbstractModification(modifyBusBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_BUS_MASTER: {
				ModifyBusMaster modifyBusMaster = (ModifyBusMaster)theEObject;
				T1 result = caseModifyBusMaster(modifyBusMaster);
				if (result == null) result = caseModifyComponent(modifyBusMaster);
				if (result == null) result = caseAbstractModification(modifyBusMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_BUS_SLAVE: {
				ModifyBusSlave modifyBusSlave = (ModifyBusSlave)theEObject;
				T1 result = caseModifyBusSlave(modifyBusSlave);
				if (result == null) result = caseModifyComponent(modifyBusSlave);
				if (result == null) result = caseAbstractModification(modifyBusSlave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_BUS_CABLE: {
				ModifyBusCable modifyBusCable = (ModifyBusCable)theEObject;
				T1 result = caseModifyBusCable(modifyBusCable);
				if (result == null) result = caseModifyComponent(modifyBusCable);
				if (result == null) result = caseAbstractModification(modifyBusCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case modificationmarksPackage.MODIFY_SENSOR: {
				ModifySensor modifySensor = (ModifySensor)theEObject;
				T1 result = caseModifySensor(modifySensor);
				if (result == null) result = caseModifyComponent(modifySensor);
				if (result == null) result = caseAbstractModification(modifySensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract KAPS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract KAPS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends KAPSSeedModifications> T1 caseAbstractKAPSModificationRepository(AbstractKAPSModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAPS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAPS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKAPSModificationRepository(KAPSModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAPS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAPS Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKAPSSeedModifications(KAPSSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifySensor(ModifySensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Due To Hardware Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Due To Hardware Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationDueToHardwareChange(ChangePropagationDueToHardwareChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Component> T1 caseModifyComponent(ModifyComponent<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Module> T1 caseModifyModule(ModifyModule<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Stucture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Stucture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Structure> T1 caseModifyStucture(ModifyStucture<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends xPPU.InterfaceRepository.Interface> T1 caseModifyInterface(ModifyInterface<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusBox(ModifyBusBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Power Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyPowerSupply(ModifyPowerSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Signalinterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Signalinterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifySignalinterface(ModifySignalinterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Physical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyPhysicalConnection(ModifyPhysicalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Micro Switch Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Micro Switch Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyMicroSwitchModule(ModifyMicroSwitchModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusMaster(ModifyBusMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusSlave(ModifyBusSlave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusCable(ModifyBusCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //modificationmarksSwitch
