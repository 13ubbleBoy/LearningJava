package Assignment_02;

public class Ques19 {
	
	static boolean areRotations(String str1, String str2) { 
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }

	public static void main(String[] args) {
		String str1 = "avajava";
        String str2 = "javaava";
 
        if (areRotations(str1, str2))
            System.out.println("Yes");
        else
            System.out.printf("No");
	}
}
