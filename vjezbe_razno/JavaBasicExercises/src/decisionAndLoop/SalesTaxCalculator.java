package decisionAndLoop;

import java.util.Scanner;

public class SalesTaxCalculator {

	public static void main(String[] args) {

		final double SALES_TAX_RATE = 0.07;
		final int SENTINEL = -1;
		
		double price, actualPrice, salesTax;
		double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter tax-inclusive price in dollars (or -1 to end): ");
		price = s.nextDouble();
		
		while (price != SENTINEL) {
			actualPrice = price / (1 + SALES_TAX_RATE);
			salesTax = actualPrice * SALES_TAX_RATE;
			
			totalPrice+=price;
			totalActualPrice+=actualPrice;
			totalSalesTax+=salesTax;
			
			System.out.printf("Actual price is:  $%.2f, Sales Tax is: $%.2f%n  ", actualPrice, salesTax);
			
			System.out.print("Enter tax-inclusive price in dollars (or -1 to end): ");
			price = s.nextDouble();
			
		}
		
		System.out.printf("Total price is: $%.2f%n Total actual price is: $%.2f%n Total sales tax is: $%.2f", 
				totalPrice, totalActualPrice, totalSalesTax);
	

	}

}
