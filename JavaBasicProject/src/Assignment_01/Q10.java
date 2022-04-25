package Assignment_01;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = i+5;
			}
		}
		
		String c1 = "Delhi", c2 = "Mumbai", c3 = "Chennai", c4 = "Kolkatta";
		String cars[] = {"Maruti-K10", "Zen-Astelo", "Wagnor", "Maruti-SX4"};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i == 0) {
					System.out.println(cars[j] + " sold in " + c1 + " : " + arr[i][j]);
				} else if(i == 1) {
					System.out.println(cars[j] + " sold in " + c2 + " : " + arr[i][j]);
				} else if(i == 2) {
					System.out.println(cars[j] + " sold in " + c3 + " : " + arr[i][j]);
				} else {
					System.out.println(cars[j] + " sold in " + c4 + " : " + arr[i][j]);
				}
				
			}
			System.out.println();
		}
		
		D d = new D();
	}

}

class D{
	private D(int x) {
		System.out.println("D's private constructor");
	}
	
	D(){
		System.out.println("D's constructor");
	}
}

interface y{
	//void d();
}