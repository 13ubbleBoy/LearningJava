package Assignment_01;

public class Q6 {
	
	static int add(int a, int b) {
		return (a+b);
	}
	
	static int sub(int a, int b) {
		int res = a - b;
		if(res < 0) res = 0;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 10;
		
		int res = a > b ? add(a,b) : sub(a,b);
		System.out.println("Result : " + res);
	}

}
