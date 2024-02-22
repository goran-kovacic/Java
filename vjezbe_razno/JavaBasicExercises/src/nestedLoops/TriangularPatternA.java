package nestedLoops;

import java.util.Scanner;

public class TriangularPatternA {
	
	public static void main(String[] args) {
		
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size: ");
		size = s.nextInt();
		
		for (int row=1; row<=size; row++) {
			for(int column=1; column<=size;column++) {
				if(row>=column) {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
