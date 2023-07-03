package edunova;

public class E05TryCatch {
	public static void main(String[] args) {
		int[] niz = {1,2};
		
		try {
			System.out.println(niz[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index ne postorji");
		}catch(NumberFormatException | StackOverflowError e) {
			
		}catch(Exception e) {
			
		}finally {
			
		}
		
		try {
			System.out.println(niz[2]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
