package Assignment_02;

public class Ques18 {
	
	static void subString(String s, int n) {
		for(int i = 0; i < n; i++) {
	        char[] temp = new char[n - i + 1];
	        int tempindex = 0;
	        for(int j = i; j < n; j++) {
	            temp[tempindex++] = s.charAt(j);
	            temp[tempindex] = '\0';
	            System.out.println(temp);
	        }
	    }
    }

	public static void main(String[] args) {
		String s = "aabacbebede";
		int n = s.length();
		subString(s,n);
	}

}
