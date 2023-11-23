package printApp;

import java.util.Scanner;

public class Menu {

	private ProjectsController projectsController;
	
	private PartsController partsController;
	
	private PrinterController printerController;
	
	private MaterialController materialController;
	
	private PrintJobController printJobController;
	
	
	public PrinterController getPrinterController() {
		return printerController;
	}

	public ProjectsController getProjectsController() {
		return projectsController;
	}

	public PartsController getPartsController() {
		return partsController;
	}
	
	public MaterialController getMaterialController() {
		return materialController;
	}

	public Menu() {
		
		projectsController = new ProjectsController();
		partsController = new PartsController(this);
		printerController = new PrinterController();
		materialController = new MaterialController();
		printJobController = new PrintJobController(this);
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
//		System.out.println("6. Users");
		System.out.println("6. Exit");
		System.out.println();

		inputMenuItem();
	}

	private void inputMenuItem() {

		switch (Helper.inputNumberRange("Choose a menu item: ", "\n*** Must be 1 - 6 ***\n", 1, 6)) {

		case 1:
			projectsController.showMenu();
			showMenu();
			break;
		
		case 2:
			partsController.showMenu();
			showMenu();
			break;
			
		case 3:
			printJobController.showMenu();
			showMenu();
			break;
		
		case 4:
			printerController.showMenu();
			showMenu();
			break;
			
		case 5:
			materialController.showMenu();
			showMenu();
			break;
			
		case 6:
			System.out.println("*** BYE ***");
			
			break;
		}

	}

}
