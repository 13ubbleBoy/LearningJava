package Unit03;

import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;

public class P14_ExceptionHanding {
	
	
	// stack overflow
	public static void faf(int x) {
		System.out.println(x);
		faf(x+1);
	}
	
	
	
	// use of throw (manually)
	public static void fun() {
		try {
			System.out.println("Throwing exception...");
			throw new ArithmeticException();
		} catch(Exception e) {
			System.out.println("Message : " + e.getMessage());
			throw e;
		}
	}
	
	
	
	// use of throws
	public static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		int a = 0;
		
		// try, catch block
		try {
			int b = 100/a; // exception will occur here, and no line will get executed after this line.
			// Program will terminate
			System.out.println(b);
		} 
		// There should not be any code between try and catch block
		catch(ArithmeticException e) {
			System.out.println("Message : " + e.getMessage());
		}
		// There should not be any code between two catch blocks
		catch(Exception e) { // 'Exception' is the super class/mother of all the exceptions
			System.out.println("Message : " + e.getMessage());
		}
		
		
		
		// inputMissMatchException
		A a1 = new A();
		a1.inputMissMatchException();
		
		
		
		// Stack overflow
		try { 
			P14_ExceptionHanding.faf(1); // Without try catch this line will produce error
		} catch(StackOverflowError e) { // There will no message related to stack overflow
			System.out.println("Message : " + "Stack overflow !");
		}
		
		
		
		// indexOutOfBoundException
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println("Trying to print an element whose index does not exits : " + arr[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Message : " + e.getMessage());
		}
		
		
		
		// nullPointerException
		String s = null;
		try {
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("Message : " + e.getMessage());
		}
		
		
		
		// useOfThrow
		try {
			fun();
		} catch(Exception e) {
			System.out.println("Message : " + e.getMessage());
		}
	
		
		
		// use of throws
		try {
			int res = divide(6, 0);
			System.out.println(res);
		} catch(ArithmeticException e) {
			System.out.println("Message : " + e.getMessage());
		}
		
		//System.out.println("Praveen"); // There should not be any content between catch and finally
		
		// use of finally | it will get executed always
		finally { // finally block is always written after catch block
			System.out.println("finally block is always executes...");
		}
		
		
		
		
		// use of checked and unchecked exception
		/*
		checked : In this compiler only gives a warning, saying if this error occurs in future then how should I (compiler)
				  handle it.
				  Happens at Compile time.
				  
				  Example : If you are opening a file to read something content, then at the time of compilation, compiler
				  			will produce warning saying 'what to do if this file does not exist in future at this location.
				  
				  
				  
		unchecked : It is a case where compiler does not produce any warning/error, instead at the run time our program will
					get terminated. Because these type of exception occur one in a thousand, thats why compiler does not
					take this seriously.
					Happens at run time.
					
					Example : Dividing a number, if any time divisor becomes 0 then the program will get terminated
							  saying Arithmetic Exception.
		*/
		try {
			FileReader fr = new FileReader("/Library/Praveen/Demo.txt");
		} catch(FileNotFoundException e) {
			System.out.println("Message : " + e.getMessage());
		}
		
		
	}

}


class A{
	void inputMissMatchException() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a number : ");
			int a = sc.nextInt();
			System.out.println(a);
		} catch(InputMismatchException e) {
			System.out.println("Input miss match !");
		}
		sc.close();
	}
}