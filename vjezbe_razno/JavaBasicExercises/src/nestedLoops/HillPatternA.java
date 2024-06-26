package nestedLoops;

import java.util.Scanner;

public class HillPatternA {
	
	public static void main(String[] args) {
		
		int size = 0;
		Scanner s = new Scanner(System.in);
		while(size<1) {			
			System.out.println("Enter size: ");
			size = s.nextInt();
		}
		
		for (int row=1; row<=size; row++) {
			
			for(int column=1; column<=2*size-1;column++) {				
				if((row + column >= size + 1) && (row >= column - size + 1)) {
					System.out.print(" #");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
