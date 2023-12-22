package decisionAndLoop;

import java.util.Scanner;

public class SumProductMinMax3 {
	
	public static void main(String[] args) {
		
		int num1,num2,num3;
		int sum, product, min, max;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1=in.nextInt();
		System.out.print("Enter second number: ");
		num2=in.nextInt();
		System.out.print("Enter third number: ");
		num3=in.nextInt();
		in.close();
		
		sum=num1+num2+num3;
		product=num1*num2*num3;
		
		min=num1;
		if(min>num2) {
			min=num2;
		}
		if(min>num3) {
			min=num3;
		}
		
		max=num1;
		if(num2>max) {
			max=num2;
		}
		if(num3>max) {
			max=num3;
		}
		
		System.out.println("Sum= " + sum + "\nMin= " + min + "\nMax= " + max);
		
		
	}

}
