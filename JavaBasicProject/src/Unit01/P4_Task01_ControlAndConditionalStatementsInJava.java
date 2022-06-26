package Unit01;

public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		
		Statements obj = new Statements();
		
		obj.if_else();
		obj.switch_statement();
		obj.for_loop();
		obj.while_loop();
		obj.do_while_loop();
		obj.jump_statements();

	}

}

class Statements{
	void if_else() {
		System.out.println("If else statement ------------");
		int a = 10, b = 20;
		if(a < b) {
			System.out.println("A is smaller");
		} else {
			System.out.println("B is greater");
		}
	}
	
	void switch_statement() {
		System.out.println("Switch statement ------------");
		int a = 2;
		switch(a) {
		case 1:
			System.out.println("A is : " + a);
			break;
			
		case 2:
			System.out.println("A is : " + a);
			break;
		
		default:
			System.out.println("A not found");
		}
	}
	
	void for_loop() { // For loop runs for the given number of times
		System.out.println("For loop -------------");
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	void while_loop() { // While loop runs until the condition is true
		System.out.println("While loop ----------------");
		int a = 10;
		while(a != 0) {
			System.out.println(a + " ");
			a--;
		}
		System.out.println();
	}
	
	void do_while_loop() { // Do while loop runs at least once even if the condition is false
		System.out.println("Do while loop --------------");
		int a = 1;
		do {
			System.out.println(a + " ");
			a++;
		}while(a < 11);
		System.out.println();
	}
	
	void jump_statements() {
		System.out.println("Jump statements -------------\n");
		// break : it is used to end some process when we don't want its execution anymore
		System.out.println("Break statement -------------");
		for(int i=0; i<10; i++) {
			System.out.println(i + " ");
			if(i == 5) break; // The loop will not run when it will reach to this condition
		}
		System.out.println();
		
		System.out.println("Continue statement ------------");
		for(int i=0; i<5; i++) {
			if(i == 3) continue; // Compiler will skip the lines below when i == 3
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
}
