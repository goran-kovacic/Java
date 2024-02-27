package generics;

public class GenericMethods {	
	
	public static void Run(){	
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.3,4.4,5.5};
		Character[] charArray = {'a','b','C'};
		String[] stringArray = {"A", "B", "c"};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		
		System.out.println(getFirstElement(intArray));
		System.out.println(getFirstElement(doubleArray));
		System.out.println(getFirstElement(charArray));
		System.out.println(getFirstElement(stringArray));
		
	}	
	
	public static <T> void printArray(T[] array) {
		for(T x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static <T> T getFirstElement(T[] array) {
		return array[0];
	}

}
