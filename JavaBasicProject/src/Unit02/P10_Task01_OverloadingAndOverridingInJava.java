package Unit02;

public class P10_Task01_OverloadingAndOverridingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F obj = new F();
		obj.message(); // Method of sub class will be called because of overriding
		obj.message("Praveen"); // Method from super class will be called
	}

}


class E{
	int a;
	
	void message() {
		System.out.println("Hello!");
		
	}
	
	void message(String name) { // Overloading
		// Overloading occurs within the class
		System.out.println("Hello, Mr. " + name);
	}
}

class F extends E{
	int b;
	
	void message() { // Overriding
		// Overriding happens in between 2 classes
		System.out.println("My name is Praveen Kumar");
	}
}