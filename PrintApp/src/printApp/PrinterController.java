package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.Printer;

public class PrinterController {
	
	private List<Printer> printers;

	public List<Printer> getPrinters() {
		return printers;
	}
	
	public PrinterController() {

		printers = new ArrayList<>();
		
		if(Helper.DEV) {
			testData();
		}
		
	}

	private void testData() {
		printers.add(new Printer(1, "Mono 4K", "Anycubic", null, 18));
		printers.add(new Printer(2, "Saturn 3 Ultra", "Elegoo", null, 0));
	}

	public void showMenu() {
		System.out.println("*** Printers ***");
		System.out.println("1. Show existing Printers");
		System.out.println("2. Add new Printer");
		System.out.println("3. Edit an existing Printer");
		System.out.println("4. Delete Printer");
		System.out.println("5. Return to previous menu");
		inputMenuItem();
	}

	private void inputMenuItem() {

		switch(Helper.inputNumberRange("Choose a number: ", 
				"\n *** Must be in range 1 - 5 ***\n", 1, 5)) {
		
		case 1:
			showPrinters();
			showMenu();
			break;
			
		case 2:
			addPrinters();
			showMenu();
			break;
			
		case 3:
			editPrinter();
			showMenu();
			break;
			
		case 4:
			deletePrinter();
			showMenu();
			break;
			
		case 5:
			break;
			
		
		}
		
	}

	private void deletePrinter() {
		showPrinters();
		
		int number = Helper.inputNumberRange("Select printer number to delete: ", "Error",
				1, printers.size());
		boolean answer = Helper.yesOrNo("Are you sure you want to delete? y/n");
		
		if(answer) {
			printers.remove(number-1);
			System.out.println("Printer " + number + ". deleted");
		}
		
	}

	private void editPrinter() {
		
		showPrinters();
		
		int number= Helper.inputNumberRange("Select printer number: ", "Error", 1, printers.size());
		Printer p = printers.get(number - 1);
		
		if(Helper.yesOrNo("Do you wish to edit printer ID? y/n")) {
			p.setId(Helper.inputNumberRange("Input printer ID (" + p.getId() + "): ", "Error", 1, Integer.MAX_VALUE));
		}
		if(Helper.yesOrNo("Do you wish to edit printer name? y/n")) {
			p.setPrinterName(Helper.inputString("Input printer name: (" + p.getPrinterName() + ")", "Error"  ));
		}
		if(Helper.yesOrNo("Do you wish to edit manufacturer name? y/n")) {
			p.setManufacturer(Helper.inputString("Input manufacturer name: (" + p.getManufacturer() + ")", "Error"  ));
		}
		
	}

	private void addPrinters() {
		Printer p = new Printer();
		p.setId(Helper.inputNumberRange("Input printer ID: ", "Must be positive number", 1, Integer.MAX_VALUE));
		p.setPrinterName(Helper.inputString("Input printer name: ", "Name required"));
		p.setManufacturer(Helper.inputString("Input manufacturer name: ", "Name required"));
		
		printers.add(p);
	}

	public void showPrinters() {
		System.out.println("---- List of existing printers: ---- ");
		int n = 1;
		for(Printer p : printers) {
			System.out.println(n++ +". " + p.getPrinterName() + " (" + p.getManufacturer() + ")");
		}
		System.out.println("-------------------------------------");
	}
}
