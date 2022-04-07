package Unit01;

/*
 * String are immutable statements in Java
 * So when we assign a new string to the old variable it just make a new memory location and points to that location
 * 
 */

public class P6_Task02_StringsInJava {

	public static void main(String[] args) {
		
		Strings obj = new Strings();
		obj.stringDefinitation();

	}

}

class Strings{
	void stringDefinitation() {
		String s1 = "Praveen Kumar";
		String s2 = new String("Praveen");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("String length of s1 : " + s1.length());
		
		System.out.println("\nPrinting string using loop-----------");
		for(int i=0; i<s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		
		boolean equalString = s1.equals(s2);
		System.out.println(equalString);
		
		// As strings are immutable 
		/* String pool helps in making duplicate string
		 * if s1 = "Praveen"; and s2 = "Praveen";
		 *  Then instead of making 2 strings java will make s1 and s2 point to the same location
		 *  But in case of String s1 = new String("Praveen");, this statement will create a new string
		 *  it does not matter to it even if same string already exits in the memory
		 */
		
		// Character arrays to make strings
		System.out.println("\nString using character array----------");
		char st[] = {'H', 'e', 'l', 'l', 'o'};
		for(int i=0; i<5; i++) {
			System.out.print(st[i] + " ");
		} System.out.println();
		
		// Copying character array to make a string
		String newst = new String(st);
		System.out.println(newst);
		
		// String into character arrays
		System.out.println("\nCopying string to a array of characters-----------");
		char starr[] = newst.toCharArray();
		for(int i=0; i<5; i++) {
			System.out.print(starr[i] + " ");
		} System.out.println();
	}
	
}
