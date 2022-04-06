package Unit01;

public class P5_Task01_ClassAndObjectInJava {

	public static void main(String[] args) {
		newClass obj = new newClass();
		obj.display1(); // 'display()1' is not a static method, thats why we require object to call it
		
		newClass.display2(); // 'display2()' was a static method, thats why there is no need for object to call this method

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
