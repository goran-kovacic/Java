package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.Part;
import printApp.model.Project;

public class PartsController {

	private List<Part> parts;
	private Menu menu;
	
	
	

	public PartsController() {
		parts = new ArrayList<>();
		
		if(Helper.DEV) {
			testData();
		}

	}
	
	public PartsController(Menu menu) {
		this();
		this.menu=menu;
	}
	
	private void testData() {
		parts.add(new Part(1, "test part 1", "original1.stl", null, null, 1, null));
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

		switch (Helper.inputNumberRange("Choose a number: ", 
				"\n *** Must be in range 1 - 5 ***\n",
				1, 5)) {

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
		
		p.setId(Helper.inputNumberRange("Input part ID", "Must be positive number",
				1, Integer.MAX_VALUE));
		p.setPartName(Helper.inputString("Input part name", "Name required"));
		
		p.setProject(inputProject());
		
		
		
		parts.add(p);
	}

	private Project inputProject() {
		menu.getProjectsController().showProjects();
		int number = Helper.inputNumberRange("Choose a project for this part", "Error",
				1, menu.getProjectsController().getProjects().size());
		return menu.getProjectsController().getProjects().get(number-1);
	}

}
