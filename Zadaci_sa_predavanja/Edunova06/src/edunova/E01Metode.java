package edunova;

public class E01Metode {
	public static void main(String[] args) {
		
		tip1();

		tip1(2);
		
		int broj=7;
		tip1(broj);
		
		tip1(true);
		
		zbroj100Brojeva();
		
		System.out.println(zbroj100Brojeva());
		
		int i= zbroj100Brojeva();
		
		System.out.println(i+1);
		
		System.out.println(slucajniBroj(1, 100));

	}
	

	static void tip1() {
		System.out.println("tip1");
	}
	
	private static void tip1(int i) {
		System.out.println("tip 2 " + i);
	}
	
	protected static void tip1(boolean i) {
		System.out.println("tip 2 " + i);
	}
	
	public static int zbroj100Brojeva() {
		int s=0;
		for(int i=1;i<=100;i++) {
			s+=i;
		}
		return s;
	}
	
	static int slucajniBroj(int min, int max) {
		int manji = min<max ? min : max;
		int veci = min>max? min : max;
		
		return (int)Math.floor(Math.random() * (veci - manji + 1) + manji);
		
	}
}
