package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.PrintObject;

public class PrintObjectsController {

	private List<PrintObject> printObjects;
	
	public PrintObjectsController() {
		printObjects = new ArrayList<>();
		
	}
	
	public void showMenu() {
		System.out.println("*** Print Objects ***");
		System.out.println("1. Show existing Objects");
		System.out.println("2. Add new Object");
		System.out.println("3. Edit an existing Object");
		System.out.println("4. Delete Object");
		System.out.println("5. Return to previous menu");
		inputMenuItem();
	}
	
private void inputMenuItem() {
		
		switch(Helper.inputNumberRange("Choose a number: ", "\n *** Must be in range 1 - 5 ***\n", 1, 5)){
			
		case 1:
			//showProjects();
			showMenu();
			break;
		
		case 2:
			//addProject();
			showMenu();
			break;
		
		case 5:
				break;
			
			
			
		}
		
	}
	
}
