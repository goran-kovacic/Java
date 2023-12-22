package decisionAndLoop;

import java.util.Scanner;

public class CircleComputation {
	
	public static void main(String[] args) {
		
		double radius, diameter, circumeference, area;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter circle radius: ");
		radius = s.nextDouble();
		s.close();
		
		diameter=2.0*radius;
		area = Math.PI * Math.pow(radius, 2.0);
		circumeference=2.0*radius*Math.PI;
		
		System.out.printf("Diameter is: %.2f %n", diameter);
		System.out.printf("Area is: %.2f %n", area);
		System.out.printf("Circumeference is: %.2f %n", circumeference);
		
		
	}

}
