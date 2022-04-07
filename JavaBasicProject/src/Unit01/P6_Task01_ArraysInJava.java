package Unit01;
/*
 * An array is collection of similar type of data.
 * 
 * There are 2 types of arrays mostly used
 * a) Single Dimension
 * b) Double Dimension
 */

public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {
		// Declaration of arrays
		// No space is occupied after declaration
		int arr1[];
		int[] arr2;
		int []arr3; 
		
		arr1 = new int[5]; // Now space has been allocated to the 'arr1'
		// All the position holds a default value which is '0'
		
		// Assigning values
		for(int i=0; i<5; i++) {
			arr1[i] = i+1;
		}
		
		System.out.println("1D arrays---------");
		for(int i=0; i<5; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		int arr4[] = {1,2,3,4,5}; // Declaration and initialisation
		
		// Passing array as an argument
		print(arr4); // one way | only writing the name of the array
		print(new int[] {2,4,6,8,10}); // Passing a whole array
		
		// Accepting array from a method
		arr2 = addOne(arr1);
		print(arr2);
		
		// 2D arrays
		int arr5[][] = new int[3][3];
		
		// Assigning values
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr5[i][j] = i+j;
			}
		} System.out.println();
		
		System.out.println("2D arrays------------");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		} System.out.println();
		
	}
	
	static void print(int arr[]) {
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static int[] addOne(int arr[]) {
		for(int i=0; i<5; i++) {
			arr[i]++;
		}
		return arr;
	}

}
