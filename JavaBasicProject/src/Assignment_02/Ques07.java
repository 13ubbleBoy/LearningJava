package Assignment_02;

import java.util.Arrays;
import java.util.Scanner;

public class Ques07 {
	
	static String removeDuplicate(char str[], int n) {
		int index = 0;
        for (int i = 0; i < n; i++){
            int j;
            for (j = 0; j < i; j++){
            	if (str[i] == str[j]){
                    break;
                }
            }
            if (j == i) str[index++] = str[i];
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		char str[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }
		System.out.println(removeDuplicate(str,n));
	}

}
