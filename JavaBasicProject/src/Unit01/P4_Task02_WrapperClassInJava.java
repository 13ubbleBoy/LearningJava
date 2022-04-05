package Unit01;

public class P4_Task02_WrapperClassInJava {

	public static void main(String[] args) {
		int a = 10; // int, being a primitive data type has got less flexibility. We can only store the binary value of an integer in it
		String s = "Number : " + a + " is a Integer";
		
		Integer i = Integer.valueOf(a); // Integer is a wrapper class for int data type, it gives us more flexibility in storing, converting and manipulating an int data
		Integer j = a;
		System.out.println(a + " | " + i + " | " + j);
		System.out.println(i.toString()); // i is an object of Integer Wrapper class
		//System.out.println(a.toString()); // cannot be done because a is an integer not an object
		
		// AutoBoxing : Converting primitives into objects
		// --> Auto boxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
		byte b = 5;
		Byte obj = b;
		System.out.println(obj);
		
		// UnBoxing : Converting objects into primitive data types
		byte bValue = obj;
		System.out.println(bValue);
	}

}
