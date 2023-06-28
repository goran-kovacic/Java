package edunova;

public class E03 {
	public static void main(String[] args) {
		
		int [] niz= {1,2,3,4,5,6,7};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		for (int em : niz) {
			System.out.println(em);
		}
	}

}
