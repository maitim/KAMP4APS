package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import fieldofactivityannotations.ComponentDocumentationFiles;
import fieldofactivityannotations.ComponentDrawing;
import fieldofactivityannotations.DocumentationFiles;
import fieldofactivityannotations.Drawing;
import fieldofactivityannotations.InterfaceDocumentationFiles;
import fieldofactivityannotations.InterfaceDrawing;
import fieldofactivityannotations.ModuleDocumentationFiles;
import fieldofactivityannotations.ModuleDrawing;
import fieldofactivityannotations.StructureDocumentationFiles;
import fieldofactivityannotations.StructureDrawing;
import fieldofactivityannotations.SystemTest;
import xPPU.Plant;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public class ArchitectureAnnotationLookup {
	
	public static List<?> lookUpSystemTestsForPlant(ArchitectureVersion version,
			Plant plant){
		List<SystemTest> systemTests = new ArrayList<SystemTest>();
		
		if(version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for(SystemTest sysTest : version.getFieldOfActivityRepository().getTestSpecification().getSystemTests()){
				if (sysTest.getSystemUnderTest() == plant){
					systemTests.add(sysTest);
				}
			}
		}
		return systemTests;
	}

	public static List<ComponentDrawing> lookUpDrawingsForComponent(ArchitectureVersion version, Component component) {
		List<ComponentDrawing> drawings = new ArrayList<ComponentDrawing>();
		
		if(version.getFieldOfActivityRepository().getEcadSpecification() != null){
			for(Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()){
				if(drawing instanceof ComponentDrawing){
					ComponentDrawing comDrawing = (ComponentDrawing) drawing;
					if(comDrawing.getDrawn_component() == component){
						drawings.add(comDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<ModuleDrawing> lookUpDrawingsForModules(ArchitectureVersion version, Module module) {
		List<ModuleDrawing> drawings = new ArrayList<ModuleDrawing>();
		
		if(version.getFieldOfActivityRepository().getEcadSpecification() != null){
			for(Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()){
				if(drawing instanceof ModuleDrawing){
					ModuleDrawing modDrawing = (ModuleDrawing) drawing;
					if(modDrawing.getDrawn_module() == module){
						drawings.add(modDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<InterfaceDrawing> lookUpDrawingsForInterfaces(ArchitectureVersion version,
			Interface interfacemodule) {
		List<InterfaceDrawing> drawings = new ArrayList<InterfaceDrawing>();
		
		if(version.getFieldOfActivityRepository().getEcadSpecification() != null){
			for(Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()){
				if(drawing instanceof InterfaceDrawing){
					InterfaceDrawing interfaceDrawing = (InterfaceDrawing) drawing;
					if(interfaceDrawing.getDrawn_interface() == interfacemodule){
						drawings.add(interfaceDrawing);
					}
				}
			}
		}
		
		return drawings;
	}

	public static List<StructureDrawing> lookUpDrawingsForStructures(ArchitectureVersion version, Structure structure) {
		List<StructureDrawing> drawings = new ArrayList<StructureDrawing>();
		
		if(version.getFieldOfActivityRepository().getEcadSpecification() != null){
			for(Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()){
				if(drawing instanceof StructureDrawing){
					StructureDrawing structureDrawing = (StructureDrawing) drawing;
					if(structureDrawing.getDrawn_structure() == structure){
						drawings.add(structureDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<ComponentDocumentationFiles> lookUpDocumentationForComponents(ArchitectureVersion version, Component component) {
		List<ComponentDocumentationFiles> doc = new ArrayList<ComponentDocumentationFiles>();
		if( version.getFieldOfActivityRepository().getDocumentationSpecification() != null){
			return version.getFieldOfActivityRepository().getDocumentationSpecification().getComponentDocumentation();
		}
		return doc;
	}

	public static List<ModuleDocumentationFiles> lookUpDocumentationForModules(ArchitectureVersion version,
			Module module) {
		List<ModuleDocumentationFiles> doc = new ArrayList<ModuleDocumentationFiles>();
		if( version.getFieldOfActivityRepository().getDocumentationSpecification() != null){
			return version.getFieldOfActivityRepository().getDocumentationSpecification().getModuleDocumentation();
		}
		return doc;
	}

	public static List<? extends DocumentationFiles> lookUpDocumentationForInterfaces(ArchitectureVersion version,
			Interface interfaceElement) {
		List<InterfaceDocumentationFiles> doc = new ArrayList<InterfaceDocumentationFiles>();
		if( version.getFieldOfActivityRepository().getDocumentationSpecification() != null){
			return version.getFieldOfActivityRepository().getDocumentationSpecification().getInterfaceDocumentation();
		}
		return doc;
	}

	public static List<? extends DocumentationFiles> lookUpDocumentationForStructures(ArchitectureVersion version,
			Structure structure) {
		List<StructureDocumentationFiles> doc = new ArrayList<StructureDocumentationFiles>();
		if( version.getFieldOfActivityRepository().getDocumentationSpecification() != null){
			return version.getFieldOfActivityRepository().getDocumentationSpecification().getStructureDocumentation();
		}
		return doc;
	}
}
