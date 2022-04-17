package Unit02;

public class P13_Assignment_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment obj = new Assignment();
		obj.abstractClassCall();
		obj.overloadingAndOverridind();
		obj.accessProtectionInJava();
		obj.interfaceImplementation();
	}

}


class Assignment{
	void abstractClassCall() {
		Sample3 obj = new Sample3();
		obj.run();
	}
	
	void overloadingAndOverridind() {
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	
	void accessProtectionInJava() {
		Sample3 obj = new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	
	void interfaceImplementation() {
		Sample3 obj = new Sample3();
		obj.display1();
		obj.display2();
	}
}

abstract class Sample2{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void showData() {
		System.out.println("Inside Sample Super class");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
	
	public void display() {
		System.out.println("This is a display method inside abstract class Sample2");
	}
	
	abstract public void run();
}

class Sample3 extends Sample2 implements A3, B3{
	
	public void display() {
		System.out.println("Inside sub class Sample3");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : Error because 'd' is private");
	}
	
	public void display1() {
		System.out.println("display1 from interface A3");
	}
	
	public void display2() {
		System.out.println("display2 from interface B3");
	}
	
	public void run() {
		System.out.println("This is a run method from abstract class Sample2");
	}
	
	public void run(int x) {
		System.out.println("Overloaded run method in Sample3 from Sample2");
	}
	
	public void run(int x, int y) {
		System.out.println("Overloaded run method with 3 parameters in Sample3 from Sample3");
	}
}

interface A3{
	void display1();
}

interface B3{
	void display2();
}
