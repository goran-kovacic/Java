package generics;

import java.util.ArrayList;

public class GenericClasses {
	
	public static void Run() {
		MyIntegerClass myint = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.14);
		
		System.out.println(myint.getValue());
		System.out.println(myDouble.getValue());
		
		MyGenericClass<Integer, Integer> myInteger = new MyGenericClass<>(123, 321);
		MyGenericClass<Character, Integer> myCharacter = new MyGenericClass<>('a', 321111);
		
		ArrayList<String> myString = new ArrayList<>();
		
		System.out.println(myInteger.getValue());
	}

}
