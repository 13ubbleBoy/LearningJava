package Unit01;

public class P6_Task03_StringBufferClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.append(" Java"); // It changes the original string / Modifies it
		System.out.println(sb.charAt(0));
		
		// New string
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.insert(1, "Java"); // it will add 'Java' from index 1
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.replace(1, 3, "Java"); // it will remove elements from 1-2 and add 'Java' between them
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.delete(1, 4); // it will delete elements from 1-3
		System.out.println(sb4);
	}

}
