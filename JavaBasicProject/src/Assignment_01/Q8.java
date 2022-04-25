package Assignment_01;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<9; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
		
		int index = 3;
		
		arr[index] = 0;
		
		for(int i=0; i<9; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
