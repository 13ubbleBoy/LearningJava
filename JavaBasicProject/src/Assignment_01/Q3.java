package Assignment_01;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t1 = new test();
		t1.display(13);
		
		test t2 = new test();
		t2.display(20);
	}

}

interface In1{
	void display(int x);
}

class test implements In1 {
	public void display(int x) {
		for(int i=2; i<x; i++) {
			if(x%i == 0) {
				System.out.println("The number is not Prime");
				return;
			}
		}
		
		System.out.println("The number is Prime");
	}
}