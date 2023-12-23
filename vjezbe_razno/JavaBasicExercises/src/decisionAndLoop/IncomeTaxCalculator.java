/*
 * Taxable Income	Rate (%)
First $20,000		0
Next $20,000		10
Next $20,000		20
The remaining		30
 */

package decisionAndLoop;

import java.util.Scanner;

public class IncomeTaxCalculator {
	
	public static void main(String[] args) {
		
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		
		int taxableIncome;
		double taxPayable=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the taxable income: ");
		taxableIncome = s.nextInt();
		
		if(taxableIncome<=20000) {
			taxPayable = 0;
		}else if(taxableIncome<=40000){
			taxableIncome=taxableIncome-20000;
			taxPayable=taxableIncome*TAX_RATE_ABOVE_20K;
		}else if(taxableIncome<=60000) {
			taxableIncome=taxableIncome-40000;
			taxPayable=TAX_RATE_ABOVE_40K*taxableIncome + (19999 * TAX_RATE_ABOVE_20K);
		}else {
			taxableIncome=taxableIncome-60000;
			taxPayable=taxableIncome*TAX_RATE_ABOVE_60K + (19999 * TAX_RATE_ABOVE_20K) + (19999 * TAX_RATE_ABOVE_40K);
		}			
		
		System.out.printf("The income tax payable is: $%.2f", taxPayable);		
		
	}

}
