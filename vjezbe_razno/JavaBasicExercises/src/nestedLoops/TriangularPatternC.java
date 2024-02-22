package nestedLoops;

import java.util.Scanner;

public class TriangularPatternC {
	
	public static void main(String[] args) {
		
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size: ");
		size = s.nextInt();
		
		for (int row=1; row<=size; row++) {
			for(int column=1; column<=size;column++) {
				if(column<row) {
					System.out.print("  ");
				}
				if(row<=column) {
					System.out.print("# ");
				}
			}
			System.out.println();
		}		
	}
}
