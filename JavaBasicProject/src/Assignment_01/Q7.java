package Assignment_01;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		B b5 = new B();
		
		b1.display();
		b2.display();
		b5.display();
		
		System.out.println("Total number of display calls : " + B.countCalls);
		System.out.println("Total number of Objects created : " + B.countObj);
	}

}

class B{
	static int countObj = 0, countCalls = 0;
	
	B(){
		countObj++;
	}
	
	void display() {
		countCalls++;
	}
}