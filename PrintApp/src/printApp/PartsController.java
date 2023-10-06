package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.Part;

public class PartsController {

	private List<Part> parts;

	public PartsController() {
		parts = new ArrayList<>();

	}

	public void showMenu() {
		System.out.println("*** Print Parts ***");
		System.out.println("1. Show existing Parts");
		System.out.println("2. Add new Part");
		System.out.println("3. Edit an existing Part");
		System.out.println("4. Delete Part");
		System.out.println("5. Return to previous menu");
		inputMenuItem();
	}

	private void inputMenuItem() {

		switch (Helper.inputNumberRange("Choose a number: ", "\n *** Must be in range 1 - 5 ***\n", 1, 5)) {

		case 1:
			showParts();
			showMenu();
			break;

		case 2:
			addParts();
			showMenu();
			break;

		case 5:
			break;

		}

	}

	private void showParts() {
		System.out.println("List of existing parts");
		
		parts.forEach(p->{System.out.println(p);});
		
	}

	private void addParts() {

		var p = new Part();
		
		p.setId(Helper.inputNumberRange("Input part ID", "Must be positive number", 1, Integer.MAX_VALUE));
		p.setPartName(Helper.inputString("Input part name", "Name required"));
		
		parts.add(p);
	}

}
