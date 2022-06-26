package Unit01;

public class P5_Task01_ClassAndObjectInJava {

	public static void main(String[] args) {
		newClass obj = new newClass(); // Objects are instance of a class, no memory is provided until we create an object.
		obj.display1();
		
		newClass.display2(); // As display2() is a static method that why we can call it by using its class name

	}
	
}

class newClass{
	int a = 10;
	static int b = 20;
	
	void display1() {
		System.out.println(a);
		System.out.println(b); // this method can access both the integers
	}
	
	static void display2() {
		b++;
		System.out.println(b);
		//System.out.println(a); // this method cannot access 'a' because a is not a static integer
	}
}
