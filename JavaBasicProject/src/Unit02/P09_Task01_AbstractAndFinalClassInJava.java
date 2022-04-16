package Unit02;

public class P09_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		normal obj = new normal();
		obj.message();
		
		FN object = new FN();
		System.out.println("Number in class FN : " + object.number);
	}

}


abstract class Abs{
	int num;
	
	abstract void message();
	
	/*
	 * Abstract class's object cannot be created
	 * This class can only be inherited by other class
	 * It can have 0 or more abstract methods
	 * If can class inherit this class then it is necessary to define those abstract methods
	 * Otherwise that class will also become abstract class
	 */
}

class normal extends Abs{
	int a;
	
	void message() { // This method is from Super class (abstract class)
		System.out.println("Hello!");
	}
	
}


final class FN{
	/*
	 * This class cannot be inherited by any other class
	 */
	
	int number;
	
	FN(){
		number = 100;
		System.out.println("Constructor of final class FN");
	}
}


