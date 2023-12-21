package decisionAndLoop;

public class CozaLozaWoza {
	
	public static void main(String[] args) {
		
		boolean printed;
		System.out.print(" ");
		
		for (int i=1;i<=110;i++) {
			
			printed = false;
			
			if(i%3==0) {
				System.out.print("Coza");
				printed=true;
			}
			
			if(i%5==0) {
				System.out.print("Loza");
				printed=true;		 		
			}
			
			if(i%7==0) {
				System.out.print("Woza");
				printed=true;
			}
			
			System.out.print(" ");
			
			if(!printed) {
				System.out.print((i%11==0 || i==11) ? i + "\n" : " " + i + " ");
			}
			
			
			
			
			
//			System.out.print(i);
			
		}
		
		
		
	}

}
