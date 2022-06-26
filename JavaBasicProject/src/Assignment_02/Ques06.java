package Assignment_02;

public class Ques06 {
	
	static String swap(String str) {
		  
		String words[]=str.split("\\s");
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();
    }

	public static void main(String[] args) {
		String s = "Today is a sunny day";
		String res = swap(s);
		System.out.println(res);
	}
}
