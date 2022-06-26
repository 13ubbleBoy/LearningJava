package Unit01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("754579");
		String s2 = new String("754579");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		//Scanner sc1 = new Scanner(System.in);
		//String st = sc1.next(); 
		int size = s.length();
		boolean flag = false;
		for(int i=0; i<size/2; i++) {
			if(s.charAt(i) == s.charAt(size-i-1)) {
				flag = true;
			} else {
				System.out.println("The string '" + s + "' is NOT a palindrome");
				return;
			}
		}
		if(flag == true) {
			System.out.println("The string '" + s + "' is a palindrome");
		}

	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		//Scanner sc2 = new Scanner(System.in);
		//String str = sc2.next();
		int size = s.length();
		char newstr[] = new char[size];
		
		for(int i=0; i<size; i++) {
			newstr[i] = s.charAt(size-i-1);
		}
		
		String res = String.valueOf(newstr);
		System.out.println("Old string : " + s + " | " + "New string : " + res);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		/*
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		
		String str1 = sc3.next();
		String str2 = sc4.next();
		*/
		
		boolean bool = s1.equals(s2);
		if(bool) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("String are NOT equal");
		}
	}
}