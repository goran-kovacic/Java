package nestedLoops;

import java.util.Scanner;

public class BoxPatternE {
public static void main(String[] args) {
		
		int size = 0;
		Scanner s = new Scanner(System.in);
		while(size<1) {			
			System.out.println("Enter size: ");
			size = s.nextInt();
		}
		
		for (int row=1; row<=size; row++) {
			for(int column=1; column<=size;column++) {				
				if(row == 1 || row == size || row + column == size+1 || row == column || column == 1 || column == size) {
					System.out.print(" #");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
