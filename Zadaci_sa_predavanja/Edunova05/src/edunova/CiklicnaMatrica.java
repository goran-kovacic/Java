package edunova;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {
	public static void main(String[] args) {
		
boolean dev = false;
		
		int row = dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("unesi broj redova"));
		
		int column = dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("unesi broj stupaca"));
		
		int [] [] table = new int [row] [column];
		
		int val=1;
		
		int rowmax= row, colmax=column;
		
		int rowmin = 1, colmin=1;
		
		
		while(val<=(row*column)) {
			
			for(int i=colmin;i<=colmax;i++) {
				table[row-rowmin][column-i]=val++;
			}
			if(val>(row*column)) {
			break;
			}
			
			rowmin++;
			
			
			
			
			for(int i=rowmin;i<=rowmax;i++) {
				table[row-i][column-colmax]=val++;
			}
			if(val>(row*column)) {
				break;
			}
			
			
			
			
			for(int i=colmin;i<=column-colmin;i++) {
				table[row-rowmax][i]=val++;
			}
			if(val>(row*column)) {
				break;
			}
			colmax--;
			
			
			for(int i=rowmin-1;i<=row-rowmin;i++) {
				table[i][colmax]=val++;
			}
			if(val>(row*column)) {
				break;
			}
			
			
			
			rowmax--;
			colmin++;
		
		
		
		}
		
			
		
		
		
		
		
		
		
		
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(table[i][j] + "\t");
			}System.out.println();
		}
		
}
	
}
