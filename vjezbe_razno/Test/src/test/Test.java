package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import multithreading.MyRunnable;
import multithreading.MyThread;
import serialization.User;
import java.io.*;


public class Test {	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
//		User user = new User();
//		
//		user.name = "bro";
//		user.password = "pizza";
//		
//		FileOutputStream fileOut = new FileOutputStream("userinfo.ser");
//		ObjectOutputStream out = new ObjectOutputStream(fileOut);
//		out.writeObject(user);
//		out.close();
//		fileOut.close();
//		
//		System.out.println("object info saved");
		
//		User user = null;
//		
//		FileInputStream fileIn = new FileInputStream("userinfo.ser");
//		ObjectInputStream in = new ObjectInputStream(fileIn);
//		user = (User) in.readObject();
//		in.close();
//		fileIn.close();
//		
//		System.out.println(user.name + " " + user.password);
//		user.sayHello();
		
		
		MyThread thread1 = new MyThread();
		
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		thread1.start();
		thread1.join();
		thread2.start();
		
		
	}	
}
