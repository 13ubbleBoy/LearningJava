package Unit01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		classInP5 obj = new classInP5();
		obj.display1();
		int a = obj.display2();
		classInP5.display1(); // static method
		System.out.println(obj.a);
		
	}

}

class classInP5{
	static int a = 10;
	int b = 30;
	
	static void display1() {
		int a = 5;
		int b = 6;
		System.out.println(a + " | " + b);
	}
	
	int display2() {
		System.out.println(a);
		return a;
	}
}
