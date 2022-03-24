package Unit01;

public class P2_Task02_ConstantsInJava {
	
	final int number = 10;
	static final int num = 100; // only variables static functions/methods can use
	private static final int x = 20; // cannot be accessed outside of this class
	public static final int y = 30; // other class can also access this variable 
	
	public static void main(String[] args) { // static function can only use static global variables
		float pi = 3.14f; // Any one can change this value and should not change value like PI '3.14'
		System.out.println(pi);
		pi = 10.5f;
		System.out.println(pi);
		
		// Constant variables
		final float PI = 3.14f; // final keyword makes this value immutable
		//PI = 35.5f; // this line will create an error
		System.out.println(PI);
		
		//System.out.println(number); // error because the variable is not static
		System.out.println(num);
		
	}
	
	void message() { // but function/s inside the same class can use all of them
		System.out.println(num);
		System.out.println(number);
	}
}
