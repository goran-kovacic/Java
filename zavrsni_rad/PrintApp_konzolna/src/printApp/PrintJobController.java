package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.Material;
import printApp.model.Part;
import printApp.model.PrintJob;
import printApp.model.Printer;
import printApp.model.Project;

public class PrintJobController {

	private List<PrintJob> printJobs;
	
	private Menu menu;
	
	public PrintJobController() {

		printJobs = new ArrayList<>();
		
		if(Helper.DEV) {
			testData();
		}
	}
	
	public PrintJobController(Menu menu) {
		this();
		this.menu = menu;
	}
	
	private void testData() {
		
		printJobs.add(new PrintJob(1, 2.5f, true, 
				new Printer(1, "Mono 4K", "Anycubic", null, 18), 
				new Material(1, "Basic Grey", "Anycubic", 44f, 3.5f, 50f, 30f, 6, 2f, 8, 2f, 6f, 3f, 0.5f), 
				new Part(1, "test part 1", "original1.stl", null, null,
						new Project(1, "test project 1", null, null, false, null, 0, 0, null))));
		
	}

	public void showMenu() {
		System.out.println("*** Print Jobs ***");
		System.out.println("1. Show existing Jobs");
		System.out.println("2. Add new Print Job");
		System.out.println("3. Edit an existing Print Job");
		System.out.println("4. Delete Print Job");
		System.out.println("5. Return to previous menu");
		inputMenuItem();
	}

	private void inputMenuItem() {

		switch (Helper.inputNumberRange("Choose a number: ", 
				"\n *** Must be in range 1 - 5 ***\n",
				1, 5)) {

		case 1:
			showJobs();
			showMenu();
			break;

		case 2:
			addJob();
			showMenu();
			break;
			
		case 3:
			editJob();
			showMenu();
			break;

		case 4:
			deleteJob();
			showMenu();
			break;
			
		case 5:
			break;

		}
			
	}

	private void deleteJob() {
		showJobs();
		
		int number = Helper.inputNumberRange("Select job you wish to delete: ", "Error",
				1, printJobs.size());
		
		boolean answer = Helper.yesOrNo("Are you sure you want to delete? y/n");

		if(answer) {
			printJobs.remove(number - 1);
			System.out.println("Print Job " + number + ". deleted");

		}
		
	}

	private void editJob() {
		showJobs();
		
		int number = Helper.inputNumberRange("Select job number: ", "Error",
				1, printJobs.size());
		PrintJob p = printJobs.get(number - 1);
		
		if(Helper.yesOrNo("Do you wish to edit job ID? y/n")) {
			p.setId(Helper.inputNumberRange("Input job ID: (" + p.getId() + ")", "error", 1, Integer.MAX_VALUE));
		}
		
		if(Helper.yesOrNo("Do you wish to edit job cost? y/n")) {
			p.setCost(Helper.inputFloat("Input job cost: (" + p.getCost() + ")", "error"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit print job result? y/n")) {
			p.setResult(Helper.yesOrNo("Was the print a success? y/n"));
		}
		
		if(Helper.yesOrNo("Do you wish to edit the printer for this job? y/n")) {
			p.setPrinter(inputPrinter());
		}
		
		if(Helper.yesOrNo("Do you wish to edit the print part for this job? y/n")) {
			p.setPart(inputPart());
		}
		
		if(Helper.yesOrNo("Do you wish to edit the material for this job? y/n")) {
			p.setMaterial(inputMaterial());
		}
		
	}

	private void addJob() {
		
		PrintJob p = new PrintJob();
		
		p.setId(Helper.inputNumberRange("Input job ID", "Must be positive number",
				1, Integer.MAX_VALUE));
		if(Helper.yesOrNo("Do you wish to enter cost?")) {
			p.setCost(Helper.inputFloat("Input cost: ", "Error"));
		}
		if(Helper.yesOrNo("Do you wish to enter print job result? y/n")) {
			p.setResult(Helper.yesOrNo("Was the print a success? y/n"));
		}
		
//		if(Helper.yesOrNo("Do you wish to input printer for this job? y/n")) {
			p.setPrinter(inputPrinter());
//		}
		
//		if(Helper.yesOrNo("Do you wish to input the print part for this job? y/n")) {
			p.setPart(inputPart());
//		}
		
//		if(Helper.yesOrNo("Do you wish to enter the material for this job? y/n")) {
			p.setMaterial(inputMaterial());
//		}
		
		printJobs.add(p);
		
	}

	private Material inputMaterial() {
		menu.getMaterialController().showMaterials();
		int number = Helper.inputNumberRange("Choose a material for this print job: ", "Error",
				1, menu.getMaterialController().getMaterials().size());
		return menu.getMaterialController().getMaterials().get(number - 1);
	}

	private Part inputPart() {
		menu.getPartsController().showParts();
		int number = Helper.inputNumberRange("Choose a part for this print job: ", "Error",
				1, menu.getPartsController().getParts().size());
		
		return menu.getPartsController().getParts().get(number - 1);
	}

	private Printer inputPrinter() {
		menu.getPrinterController().showPrinters();
		int number = Helper.inputNumberRange("Choose a printer for this job: ", "Error",
				1, menu.getPrinterController().getPrinters().size());
		return menu.getPrinterController().getPrinters().get(number - 1);
	}

	private void showJobs() {
		System.out.println("List of existing jobs: ");
		
		int n = 1;
		for(PrintJob p : printJobs) {
			System.out.println("\t" + n++ + ". " + p.getId() + 
					" - Result: " + (p.isResult() ? "Success" : "Failure") + " "
					 + " (" + p.getPart().getPartName() + ")" + " (" + 
					p.getMaterial().getMaterialName() + ")" + " (" + 
					p.getPrinter().getPrinterName() + ")");
		}
		
	}
	
	
}
