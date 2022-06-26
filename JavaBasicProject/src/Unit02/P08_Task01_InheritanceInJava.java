package Unit02;

public class P08_Task01_InheritanceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Order of Constructor 'A -> B -> C'");
		C obj = new C(10);
		obj.message(); // Method of class A
		obj.msg(); // Method of class B
		obj.mssg(); // Method of class C
		
	}

}

class A{
	int num;
	
	A(){ // A method which is called automatically after object is created
		System.out.println("Constructor of class A");
	}
	
	A(int x){
		System.out.println("Parameterized Constructor of A");
	}
	
	void message() {
		System.out.println("Hello!");
	}
}

class B extends A{ // Single inheritance 'A -> B'
	int number;
	/*	// If default constructor is not present then parameterized constructor will be called automatically
	B(){ // A method which is called automatically after object is created
		System.out.println("Constructor of class B");
	}
	*/
	B(int x){
		System.out.println("Parameterized Constructor of B");
	}
	
	void msg() {
		System.out.println("Hi, how are you ?");
	}
}

class C extends B{ // Multilevel inheritance 'A -> B -> C'
	int n;
	
	C(){ // A method which is called automatically after object is created
		super(2);
		System.out.println("Constructor of class C");
	}
	
	C(int x){
		super(5);
		System.out.println("Parameterized Constructor of C");
	}
	
	void mssg() {
		System.out.println("Hi!");
	}
}


class D extends B{ // Hierarchical inheritance 'A -> B -> C,D'
	int no;
	
	D(){ // A method which is called automatically after object is created
		super(5);
		System.out.println("Constructor of class D");
	}
	
	void aMsg() {
		System.out.println("Hey!");
	}
}