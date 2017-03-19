/**
 */
package xPPU.ComponentRepository.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import xPPU.ComponentRepository.util.ComponentRepositoryAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentRepositoryItemProviderAdapterFactory extends ComponentRepositoryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositoryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.OperationPanel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationPanelItemProvider operationPanelItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.OperationPanel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationPanelAdapter() {
		if (operationPanelItemProvider == null) {
			operationPanelItemProvider = new OperationPanelItemProvider(this);
		}

		return operationPanelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.SimpleMotor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleMotorItemProvider simpleMotorItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.SimpleMotor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleMotorAdapter() {
		if (simpleMotorItemProvider == null) {
			simpleMotorItemProvider = new SimpleMotorItemProvider(this);
		}

		return simpleMotorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.RegularRamp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularRampItemProvider regularRampItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.RegularRamp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegularRampAdapter() {
		if (regularRampItemProvider == null) {
			regularRampItemProvider = new RegularRampItemProvider(this);
		}

		return regularRampItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Sensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorItemProvider sensorItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorAdapter() {
		if (sensorItemProvider == null) {
			sensorItemProvider = new SensorItemProvider(this);
		}

		return sensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.OpticalSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpticalSensorItemProvider opticalSensorItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.OpticalSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpticalSensorAdapter() {
		if (opticalSensorItemProvider == null) {
			opticalSensorItemProvider = new OpticalSensorItemProvider(this);
		}

		return opticalSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.InductiveSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InductiveSensorItemProvider inductiveSensorItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.InductiveSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInductiveSensorAdapter() {
		if (inductiveSensorItemProvider == null) {
			inductiveSensorItemProvider = new InductiveSensorItemProvider(this);
		}

		return inductiveSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.PresenceSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresenceSensorItemProvider presenceSensorItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.PresenceSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresenceSensorAdapter() {
		if (presenceSensorItemProvider == null) {
			presenceSensorItemProvider = new PresenceSensorItemProvider(this);
		}

		return presenceSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.PneumaticPipe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PneumaticPipeItemProvider pneumaticPipeItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.PneumaticPipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPneumaticPipeAdapter() {
		if (pneumaticPipeItemProvider == null) {
			pneumaticPipeItemProvider = new PneumaticPipeItemProvider(this);
		}

		return pneumaticPipeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Compressor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompressorItemProvider compressorItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Compressor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompressorAdapter() {
		if (compressorItemProvider == null) {
			compressorItemProvider = new CompressorItemProvider(this);
		}

		return compressorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.PowerCable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerCableItemProvider powerCableItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.PowerCable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerCableAdapter() {
		if (powerCableItemProvider == null) {
			powerCableItemProvider = new PowerCableItemProvider(this);
		}

		return powerCableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.ProportionalCylinder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProportionalCylinderItemProvider proportionalCylinderItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.ProportionalCylinder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProportionalCylinderAdapter() {
		if (proportionalCylinderItemProvider == null) {
			proportionalCylinderItemProvider = new ProportionalCylinderItemProvider(this);
		}

		return proportionalCylinderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.BistableCylinder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BistableCylinderItemProvider bistableCylinderItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.BistableCylinder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBistableCylinderAdapter() {
		if (bistableCylinderItemProvider == null) {
			bistableCylinderItemProvider = new BistableCylinderItemProvider(this);
		}

		return bistableCylinderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Rack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackItemProvider rackItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Rack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRackAdapter() {
		if (rackItemProvider == null) {
			rackItemProvider = new RackItemProvider(this);
		}

		return rackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Corner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CornerItemProvider cornerItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Corner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCornerAdapter() {
		if (cornerItemProvider == null) {
			cornerItemProvider = new CornerItemProvider(this);
		}

		return cornerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.RegularValve} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularValveItemProvider regularValveItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.RegularValve}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegularValveAdapter() {
		if (regularValveItemProvider == null) {
			regularValveItemProvider = new RegularValveItemProvider(this);
		}

		return regularValveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Tank} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TankItemProvider tankItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Tank}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTankAdapter() {
		if (tankItemProvider == null) {
			tankItemProvider = new TankItemProvider(this);
		}

		return tankItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Dispenser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispenserItemProvider dispenserItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Dispenser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDispenserAdapter() {
		if (dispenserItemProvider == null) {
			dispenserItemProvider = new DispenserItemProvider(this);
		}

		return dispenserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.BottleSeperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BottleSeperatorItemProvider bottleSeperatorItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.BottleSeperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBottleSeperatorAdapter() {
		if (bottleSeperatorItemProvider == null) {
			bottleSeperatorItemProvider = new BottleSeperatorItemProvider(this);
		}

		return bottleSeperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.PowerSupply} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSupplyItemProvider powerSupplyItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.PowerSupply}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerSupplyAdapter() {
		if (powerSupplyItemProvider == null) {
			powerSupplyItemProvider = new PowerSupplyItemProvider(this);
		}

		return powerSupplyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.VacuumGripper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VacuumGripperItemProvider vacuumGripperItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.VacuumGripper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVacuumGripperAdapter() {
		if (vacuumGripperItemProvider == null) {
			vacuumGripperItemProvider = new VacuumGripperItemProvider(this);
		}

		return vacuumGripperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.ConveyorBelt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltItemProvider conveyorBeltItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.ConveyorBelt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConveyorBeltAdapter() {
		if (conveyorBeltItemProvider == null) {
			conveyorBeltItemProvider = new ConveyorBeltItemProvider(this);
		}

		return conveyorBeltItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Frame} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameItemProvider frameItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Frame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFrameAdapter() {
		if (frameItemProvider == null) {
			frameItemProvider = new FrameItemProvider(this);
		}

		return frameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.RubberBand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RubberBandItemProvider rubberBandItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.RubberBand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRubberBandAdapter() {
		if (rubberBandItemProvider == null) {
			rubberBandItemProvider = new RubberBandItemProvider(this);
		}

		return rubberBandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Pusher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PusherItemProvider pusherItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Pusher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPusherAdapter() {
		if (pusherItemProvider == null) {
			pusherItemProvider = new PusherItemProvider(this);
		}

		return pusherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.TurningTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurningTableItemProvider turningTableItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.TurningTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTurningTableAdapter() {
		if (turningTableItemProvider == null) {
			turningTableItemProvider = new TurningTableItemProvider(this);
		}

		return turningTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Controller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerItemProvider controllerItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerAdapter() {
		if (controllerItemProvider == null) {
			controllerItemProvider = new ControllerItemProvider(this);
		}

		return controllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.LogicalWiring} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalWiringItemProvider logicalWiringItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.LogicalWiring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalWiringAdapter() {
		if (logicalWiringItemProvider == null) {
			logicalWiringItemProvider = new LogicalWiringItemProvider(this);
		}

		return logicalWiringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Arm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmItemProvider armItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Arm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArmAdapter() {
		if (armItemProvider == null) {
			armItemProvider = new ArmItemProvider(this);
		}

		return armItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.GripperPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GripperPartItemProvider gripperPartItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.GripperPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGripperPartAdapter() {
		if (gripperPartItemProvider == null) {
			gripperPartItemProvider = new GripperPartItemProvider(this);
		}

		return gripperPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.MicroswitchModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroswitchModuleItemProvider microswitchModuleItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.MicroswitchModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMicroswitchModuleAdapter() {
		if (microswitchModuleItemProvider == null) {
			microswitchModuleItemProvider = new MicroswitchModuleItemProvider(this);
		}

		return microswitchModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.Potentiometer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentiometerItemProvider potentiometerItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.Potentiometer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPotentiometerAdapter() {
		if (potentiometerItemProvider == null) {
			potentiometerItemProvider = new PotentiometerItemProvider(this);
		}

		return potentiometerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.VacuumSwitch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VacuumSwitchItemProvider vacuumSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.VacuumSwitch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVacuumSwitchAdapter() {
		if (vacuumSwitchItemProvider == null) {
			vacuumSwitchItemProvider = new VacuumSwitchItemProvider(this);
		}

		return vacuumSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.ReedSwitch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReedSwitchItemProvider reedSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.ReedSwitch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReedSwitchAdapter() {
		if (reedSwitchItemProvider == null) {
			reedSwitchItemProvider = new ReedSwitchItemProvider(this);
		}

		return reedSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.PowerSplitter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSplitterItemProvider powerSplitterItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.PowerSplitter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerSplitterAdapter() {
		if (powerSplitterItemProvider == null) {
			powerSplitterItemProvider = new PowerSplitterItemProvider(this);
		}

		return powerSplitterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.WaterSplitter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterSplitterItemProvider waterSplitterItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.WaterSplitter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaterSplitterAdapter() {
		if (waterSplitterItemProvider == null) {
			waterSplitterItemProvider = new WaterSplitterItemProvider(this);
		}

		return waterSplitterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.PneumaticSplitter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PneumaticSplitterItemProvider pneumaticSplitterItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.PneumaticSplitter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPneumaticSplitterAdapter() {
		if (pneumaticSplitterItemProvider == null) {
			pneumaticSplitterItemProvider = new PneumaticSplitterItemProvider(this);
		}

		return pneumaticSplitterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.CylinderPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CylinderPartItemProvider cylinderPartItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.CylinderPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCylinderPartAdapter() {
		if (cylinderPartItemProvider == null) {
			cylinderPartItemProvider = new CylinderPartItemProvider(this);
		}

		return cylinderPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.MonostableCylinder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonostableCylinderItemProvider monostableCylinderItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.MonostableCylinder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMonostableCylinderAdapter() {
		if (monostableCylinderItemProvider == null) {
			monostableCylinderItemProvider = new MonostableCylinderItemProvider(this);
		}

		return monostableCylinderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link xPPU.ComponentRepository.ComponentRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRepositoryItemProvider componentRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link xPPU.ComponentRepository.ComponentRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentRepositoryAdapter() {
		if (componentRepositoryItemProvider == null) {
			componentRepositoryItemProvider = new ComponentRepositoryItemProvider(this);
		}

		return componentRepositoryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (operationPanelItemProvider != null) operationPanelItemProvider.dispose();
		if (simpleMotorItemProvider != null) simpleMotorItemProvider.dispose();
		if (regularRampItemProvider != null) regularRampItemProvider.dispose();
		if (sensorItemProvider != null) sensorItemProvider.dispose();
		if (opticalSensorItemProvider != null) opticalSensorItemProvider.dispose();
		if (inductiveSensorItemProvider != null) inductiveSensorItemProvider.dispose();
		if (presenceSensorItemProvider != null) presenceSensorItemProvider.dispose();
		if (pneumaticPipeItemProvider != null) pneumaticPipeItemProvider.dispose();
		if (compressorItemProvider != null) compressorItemProvider.dispose();
		if (powerCableItemProvider != null) powerCableItemProvider.dispose();
		if (proportionalCylinderItemProvider != null) proportionalCylinderItemProvider.dispose();
		if (bistableCylinderItemProvider != null) bistableCylinderItemProvider.dispose();
		if (rackItemProvider != null) rackItemProvider.dispose();
		if (cornerItemProvider != null) cornerItemProvider.dispose();
		if (regularValveItemProvider != null) regularValveItemProvider.dispose();
		if (tankItemProvider != null) tankItemProvider.dispose();
		if (dispenserItemProvider != null) dispenserItemProvider.dispose();
		if (bottleSeperatorItemProvider != null) bottleSeperatorItemProvider.dispose();
		if (powerSupplyItemProvider != null) powerSupplyItemProvider.dispose();
		if (vacuumGripperItemProvider != null) vacuumGripperItemProvider.dispose();
		if (conveyorBeltItemProvider != null) conveyorBeltItemProvider.dispose();
		if (frameItemProvider != null) frameItemProvider.dispose();
		if (rubberBandItemProvider != null) rubberBandItemProvider.dispose();
		if (pusherItemProvider != null) pusherItemProvider.dispose();
		if (turningTableItemProvider != null) turningTableItemProvider.dispose();
		if (controllerItemProvider != null) controllerItemProvider.dispose();
		if (logicalWiringItemProvider != null) logicalWiringItemProvider.dispose();
		if (armItemProvider != null) armItemProvider.dispose();
		if (tableItemProvider != null) tableItemProvider.dispose();
		if (gripperPartItemProvider != null) gripperPartItemProvider.dispose();
		if (microswitchModuleItemProvider != null) microswitchModuleItemProvider.dispose();
		if (potentiometerItemProvider != null) potentiometerItemProvider.dispose();
		if (vacuumSwitchItemProvider != null) vacuumSwitchItemProvider.dispose();
		if (reedSwitchItemProvider != null) reedSwitchItemProvider.dispose();
		if (powerSplitterItemProvider != null) powerSplitterItemProvider.dispose();
		if (waterSplitterItemProvider != null) waterSplitterItemProvider.dispose();
		if (pneumaticSplitterItemProvider != null) pneumaticSplitterItemProvider.dispose();
		if (cylinderPartItemProvider != null) cylinderPartItemProvider.dispose();
		if (monostableCylinderItemProvider != null) monostableCylinderItemProvider.dispose();
		if (componentRepositoryItemProvider != null) componentRepositoryItemProvider.dispose();
	}

}
