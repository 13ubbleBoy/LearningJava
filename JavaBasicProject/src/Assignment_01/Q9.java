package Assignment_01;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		System.out.println(c.c);
		System.out.println(c.a);
		System.out.println(c.b);
		//System.out.println(c.d);
	}

}

class C{
	int c = 50;
	public int a = 100;
	protected int b = 200;
	private int d = 400;
}