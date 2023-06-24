package edunova;

public class E02 {
	public static void main(String[] args) {
		
		int t=1, k=0;
		
		t = ++k - t;
		System.out.println("k=" + k + ",t=" + t);
		
		k = --t - t++;
		System.out.println("k=" + k + ",t=" + t);
		
		System.out.println(k+t);
	}

}
