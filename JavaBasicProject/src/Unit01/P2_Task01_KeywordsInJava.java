package Unit01;

public class P2_Task01_KeywordsInJava {
	public static void main(String[] args) {
		//int double = 10; // we cannot use 'double' as a variable because double is a keyword in Java
		int num = 10;
		System.out.println(num);
		
		/*
		P2_Task01_KeywordsInJava class = new P2_Task01_KeywordsInJava();
		We cannot use keywords 'class' to create objects
		*/
		
		P2_Task01_KeywordsInJava obj = new P2_Task01_KeywordsInJava();
		obj.message();
	}
	
	/*
	void float() { // function's name cannot be a keyword 'float', it will throw error
		System.out.println("Message...");
	}
	*/
	
	void message() {
		System.out.println("Mesage...");
	}
}