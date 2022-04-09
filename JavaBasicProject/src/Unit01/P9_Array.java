package Unit01;
import java.util.Scanner;

/* Tasks given below:
obj.sortAnArray(array);
obj.findTheDuplicateElements(array);
obj.findSecondLargestAndSecondSmallestElement(array);
obj.leftRotationInAnArray(array); 
obj.removeElementInArray(array);//(Optional)
*/

public class P9_Array {

public static void main(String[] args) {

	int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			boolean flag = false;
			for(int j=0; j<size-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false) break;
		}
		
		System.out.println("Sorted array------------");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("\n");

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i] + " is the duplicate element");
			}
		} System.out.println();

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		int size = arr.length;
		System.out.println("Second largest : " + arr[size-2]);
		System.out.println("Second smallest : " + arr[1]);
		System.out.println();
	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int size = arr.length, temp = arr[0];
		for(int i=0; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[size-1] = temp;
		
		System.out.println("After left shifting-------------");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("\n");
	}

	void removeElementInArray(int[] arr) {
		// write code here!
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value to delete : ");
		int x = sc.nextInt();
		int size = arr.length;
		int count = 0;
		for(int i=0; i<size; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		
		int sizeOfNewArr = size - count, index = 0;
		int newArr[] = new int[sizeOfNewArr];
		for(int i=0; i<size; i++) {
			if(arr[i] != x) {
				newArr[index] = arr[i];
				index++;
			}
		}
		
		System.out.println("After deleting element " + x + " ---------");
		for(int i=0; i<sizeOfNewArr; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

}