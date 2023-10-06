package printApp;

import java.util.Scanner;

public class Menu {

	private ProjectsController projectsController;
	
	private PartsController partsController;
	
	public Menu() {
		
		projectsController = new ProjectsController();
		partsController = new PartsController();
		Helper.input = new Scanner(System.in);

		menuMessage();
		showMenu();

		Helper.input.close();
	}

	private void menuMessage() {

		System.out.println("**********************************");
		System.out.println("*** PrintApp Console OOP v 1.0 ***");
		System.out.println("**********************************");
		System.out.println();

	}

	private void showMenu() {

		System.out.println("***** Main Menu *****\n");
		System.out.println("1. Projects");
		System.out.println("2. Parts");
		System.out.println("3. Jobs");
		System.out.println("4. Printers");
		System.out.println("5. Materials");
		System.out.println("6. Users");
		System.out.println("7. Exit");
		System.out.println();

		inputMenuItem();
	}

	private void inputMenuItem() {

		switch (Helper.inputNumberRange("Choose a menu item: ", "\n*** Must be 1 - 7 ***\n", 1, 7)) {

		case 1:
			projectsController.showMenu();
			showMenu();
			break;
		
		case 2:
			partsController.showMenu();
			showMenu();
			break;
			
		case 3:
			System.out.println("*** Jobs ***");
			showMenu();
			break;
		
		case 4:
			System.out.println("*** Printers ***");
			showMenu();
			break;
			
		case 5:
			System.out.println("*** Materials ***");
			showMenu();
			break;
			
		case 6:
			System.out.println("*** Users ***");
			showMenu();
			break;
			
		case 7:
			System.out.println("*** BYE ***");
			
			break;
		}

	}

}
