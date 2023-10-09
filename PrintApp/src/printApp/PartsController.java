package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.Part;
import printApp.model.Project;

public class PartsController {

	private List<Part> parts;
	private Menu menu;
	
	
	

	public List<Part> getParts() {
		return parts;
	}

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
			
		parts.add(new Part(1, "test part 1", "original1.stl", null, null,
				new Project(1, "test project 1", null, null, false, null, 0, 0, null)));
		parts.add(new Part(2, "test part 2", "original2.stl", null, null,
				new Project(1, "test project 1", null, null, false, null, 0, 0, null)));
		parts.add(new Part(3, "test part 3", "original3.stl", null, null, 
				new Project(3, "test project 3", null, null, false, null, 0, 0, null)));
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
			
		case 3:
			editPart();
			showMenu();
			break;

		case 4:
			deletePart();
			showMenu();
			break;
			
		case 5:
			break;

		}

	}

	private void deletePart() {

		showParts();
		
		int number = Helper.inputNumberRange("Select part number to delete: ", "error", 1, parts.size());
		boolean answer = Helper.yesOrNo("Are you sure you want to delete? y/n");
		
		if(answer) {
			parts.remove(number - 1);
			System.out.println("Part " + number + ". deleted");
		}
		
	}

	private void editPart() {
		showParts();
		
		int number = Helper.inputNumberRange("Select part number: ", "error", 1, parts.size());
		Part p = parts.get(number-1);
		
		if(Helper.yesOrNo("Do you wish to edit part ID? y/n")) {
			p.setId(Helper.inputNumberRange("Input part ID: (" + p.getId() + ")", "error", 1, Integer.MAX_VALUE));
		}
		
		if(Helper.yesOrNo("Do you wish to edit part name? y/n")) {
			p.setPartName(Helper.inputString("Input new part name", "error"));
		}
		
		if(Helper.yesOrNo("Do you wish to assign the part to another project? y/n")) {
			p.setProject(inputProject());
		}
		
		if(Helper.yesOrNo("Do you wish to edit the file path of the original STL file? y/n")) {
			p.setStlOriginal(Helper.inputString("Enter original STL file location: ", "error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit the file path of the supported STL file? y/n")) {
			p.setStlOriginal(Helper.inputString("Enter supported STL file location: ", "error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit the file path of the sliced file? y/n")) {
			p.setStlOriginal(Helper.inputString("Enter sliced file location: ", "error"));
		}
	}

	public void showParts() {
		System.out.println("List of existing parts: ");
		
		//parts.forEach(p->{System.out.println(p);});
		int n = 1;
		for(Part p : parts) {
			System.out.println("\t" + n++ + ". " + p.getPartName() + " (" + p.getProject().getProjectName() + ")");
		}
		
	}

	private void addParts() {

		var p = new Part();
		
		p.setId(Helper.inputNumberRange("Input part ID", "Must be positive number",
				1, Integer.MAX_VALUE));
		p.setPartName(Helper.inputString("Input part name", "Name required"));
		
		p.setProject(inputProject());
		
		if(Helper.yesOrNo("Do you wish to enter the file path of the original STL file? y/n")) {
			p.setStlOriginal(Helper.inputString("Enter original STL file location: ", "error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter the file path of the supported STL file? y/n")) {
			p.setStlOriginal(Helper.inputString("Enter supported STL file location: ", "error"));
		}
		
		if(Helper.yesOrNo("Do you wish to enter the file path of the sliced file? y/n")) {
			p.setStlOriginal(Helper.inputString("Enter sliced file location: ", "error"));
		}
		
		
		parts.add(p);
	}

	private Project inputProject() {
		menu.getProjectsController().showProjects();
		int number = Helper.inputNumberRange("Choose a project for this part: ", "Error",
				1, menu.getProjectsController().getProjects().size());
		return menu.getProjectsController().getProjects().get(number-1);
	}

}
