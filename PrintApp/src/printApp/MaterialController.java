package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.Material;

public class MaterialController {

	private List<Material> materials;

	public List<Material> getMaterials() {
		return materials;
	}
	
	public MaterialController() {

		materials = new ArrayList<>();
		
		if(Helper.DEV) {
			testData();
		}
		
	}

	private void testData() {
		materials.add(new Material(1, "Basic Grey", "Anycubic", 44f, 3.5f, 50f, 30f, 6, 2f, 8, 2f, 6f, 3f, 0.5f));
		materials.add(new Material(1, "ABS-Like", "Anycubic", 60f, 4f, 50f, 30f, 6, 2f, 8, 2f, 6f, 3f, 0.5f));
		
	}
	
	public void showMenu() {
		System.out.println("*** Materials ***");
		System.out.println("1. Show existing Materials");
		System.out.println("2. Add new Materials");
		System.out.println("3. Edit an existing Material");
		System.out.println("4. Delete Material");
		System.out.println("5. Return to previous menu");
		inputMenuItem();
	}

	private void inputMenuItem() {

		switch (Helper.inputNumberRange("Choose a number: ", "\n *** Must be in range 1 - 5 ***\n", 1, 5)) {

		case 1:
			showMaterials();
			showMenu();
			break;

		case 2:
			addMaterial();
			showMenu();
			break;

		case 3:
			editMaterial();
			showMenu();
			break;

		case 4:
			deleteMaterial();
			showMenu();
			break;

		case 5:
			break;
		}

		
	}

	private void deleteMaterial() {
		
		showMaterials();
		
		int number = Helper.inputNumberRange("Select material number to delete: ", "Error", 1, materials.size());

		boolean answer = Helper.yesOrNo("Are you sure you want to delete? y/n");
		
		if(answer) {
			materials.remove(number - 1);
			System.out.println("Material " + number + ". deleted");
		}
		
	}

	private void editMaterial() {
		
		showMaterials();
		
		int number = Helper.inputNumberRange("Select material number: ", "Error", 1, materials.size());
		
		Material m = materials.get(number - 1);
		
		if(Helper.yesOrNo("Do you wish to edit material ID? y/n")) {
			m.setId(Helper.inputNumberRange("Input material ID (" + m.getId() + "): ", "Error", 1, Integer.MAX_VALUE));
		}
		
		if(Helper.yesOrNo("Do you wish to edit material name? y/n")) {
			m.setMaterialName(Helper.inputString("Input material name (" + m.getMaterialName() + "):" + " ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit manufacturer name?")) {
			m.setManufacturer(Helper.inputString("Input manufacturer name: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit cost per unit?")) {
			m.setCostPerUnit(Helper.inputFloat("Input price: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit calibrated exposure?")) {
			m.setCalibratedExposure(Helper.inputFloat("Input exposure: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit layer height?")) {
			m.setLayerHeight(Helper.inputFloat("Input layer height: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit bottom exposure?")) {
			m.setBottomExposure(Helper.inputFloat("Input bottom exposure: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit lift distance?")) {
			m.setLiftDistance(Helper.inputNumberRange("Input lift distance: ", "Error", 1, 1000));
		}
		
		if(Helper.yesOrNo("Do you wish to edit lift speed?")) {
			m.setLiftSpeed(Helper.inputFloat("Input lift speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit bottom lift distance?")) {
			m.setBottomLiftDistance(Helper.inputNumberRange("Input bottom lift distance: ", "Error", 1, 1000));
		}
		
		if(Helper.yesOrNo("Do you wish to edit bottom lift speed?")) {
			m.setBottomLiftSpeed(Helper.inputFloat("Input bottom lift speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit retract speed?")) {
			m.setRetractSpeed(Helper.inputFloat("Input retract speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit bottom lift speed?")) {
			m.setBottomRetractSpeed(Helper.inputFloat("Input bottom lift speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit light off delay?")) {
			m.setLightOffDelay(Helper.inputFloat("Input light off delay: ", "Error"));
		}
		
	}

	private void addMaterial() {
		Material m = new Material();
		
		m.setId(Helper.inputNumberRange("Input material ID: ","Must be positive number", 1, Integer.MAX_VALUE));
		
		m.setMaterialName(Helper.inputString("Input material name: ", "Name required"));
		
		if(Helper.yesOrNo("Do you wish to enter a manufacturer?")) {
			m.setManufacturer(Helper.inputString("Input manufacturer name: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter cost per unit?")) {
			m.setCostPerUnit(Helper.inputFloat("Input price: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter calibrated exposure?")) {
			m.setCalibratedExposure(Helper.inputFloat("Input exposure: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter layer height?")) {
			m.setLayerHeight(Helper.inputFloat("Input layer height: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter bottom exposure?")) {
			m.setBottomExposure(Helper.inputFloat("Input bottom exposure: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter lift distance?")) {
			m.setLiftDistance(Helper.inputNumberRange("Input lift distance: ", "Error", 1, 1000));
		}
		
		if(Helper.yesOrNo("Do you wish to enter lift speed?")) {
			m.setLiftSpeed(Helper.inputFloat("Input lift speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter bottom lift distance?")) {
			m.setBottomLiftDistance(Helper.inputNumberRange("Input bottom lift distance: ", "Error", 1, 1000));
		}
		
		if(Helper.yesOrNo("Do you wish to enter bottom lift speed?")) {
			m.setBottomLiftSpeed(Helper.inputFloat("Input bottom lift speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter retract speed?")) {
			m.setRetractSpeed(Helper.inputFloat("Input retract speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter bottom lift speed?")) {
			m.setBottomRetractSpeed(Helper.inputFloat("Input bottom lift speed: ", "Error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter light off delay?")) {
			m.setLightOffDelay(Helper.inputFloat("Input light off delay: ", "Error"));
		}
		
		
		materials.add(m);
	}

	public void showMaterials() {
		System.out.println("---- List of existing materials: ---- ");
		
		int n=1;
		for(Material m : materials) {
			System.out.println(n++ + ". " + m.getMaterialName() + " (" + m.getManufacturer() + ")");
		}
		System.out.println("-------------------------------------");
	}
	
}
