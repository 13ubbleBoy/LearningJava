package Unit01;

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		class2inP5 obj = new class2inP5();
		class2inP5 obj2 = new class2inP5(100);
		obj.message();
		obj2.message();

	}

}

class class2inP5{
	int a;
	
	// Constructor is called at the time of object creation and memory is located at that time.
	// It is used to provide initial values to the data members (variables).
	// Constructor is called with each object creation.
	// It has same name as that of class.
	// It does not return anything.
	// It can have parameters.
	// Default constructor is provided if user does provide one.
	class2inP5(){
		a = 10;
		System.out.println("Constructor with no parameter---------");
	}
	
	class2inP5(int x){
		a = x;
		System.out.println("Constructor with parameter-----------");
	}
	
	void message() {
		System.out.println("a is : " + a);
	}
}