package Assignment_01;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.fun();
		
		A a2 = new A();
		
		A a3 = new A();
		a3.fun();
		
		System.out.println("Number of calls : " + A.count);
	}

}

class A{
	static int count = 0;
	
	void fun() {
		count++;
	}
}