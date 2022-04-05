package Unit01;
import java.util.Scanner;

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 'System.in' means input devices of the system
		Scanner sc2 = new Scanner(System.in);
		
		String s1 = sc.next(); // only accepts the string till there's a 'Space'
		System.out.println("My name is : " + s1);
		
		String s2 = sc2.nextLine(); // Accepts the whole line
		System.out.println("My name is : " + s2);
		
		sc.close(); // As soon as the block in which you defined Scanner object is over the garbage collection does your job for you.
		sc2.close(); // But until it is done the resources allocated for Scanner are still there and will be there until block(or process) is over.
		// To optimize your code( to make it faster and efficient) it is better to close() objects as soon as their work is done.
	}

}
