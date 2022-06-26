package Unit01;

public class P3_Task01_staticVariables_and_type_Conversion_Casting {
	int num = 10; // instance variable, will create a separate copy inside every method who is using it
	static int number = 20;
	public static void main(String[] args) {
		//System.out.println(num); // main is a static method, thats why it cannot access normal global variable
		System.out.println(number); // number is a static variable, thats why it is accessible inside the main method
		
		Abc obj = new Abc();
		System.out.println(obj.a);
		obj.a = 100;
		System.out.println(obj.a);
		
		System.out.println("Count : " + obj.count);
		obj.count++;
		System.out.println("Count : " + obj.count);
		
		Abc object = new Abc();
		System.out.println(object.a); // 'a' variable is different for every object
		System.out.println("Count : " + object.count); // 'count' variable is same for every object
		
		P3_Task01_staticVariables_and_type_Conversion_Casting o1 = new P3_Task01_staticVariables_and_type_Conversion_Casting();
		o1.msg1();
		o1.msg2();
		
		P3_Task01_staticVariables_and_type_Conversion_Casting o2 = new P3_Task01_staticVariables_and_type_Conversion_Casting();
		o2.msg1();
		
		// Type Conversion
		int i = 20;
		long l = i; // This is called TYPE CONVERSION
		System.out.println("i : " + i + " | Data type of i : " + ((Object)i).getClass().getSimpleName());
		System.out.println("l : " + l + " | Data type of l : " + ((Object)l).getClass().getSimpleName());
		
		// Type Casting
		float f = 12.56f;
		int fn = (int)f; // This is called TYPE CASTING
		System.out.println("f : " + f + " | Data type of f : " + ((Object)f).getClass().getSimpleName());
		System.out.println("fn : " + fn + " | Data type of fn : " + ((Object)fn).getClass().getSimpleName());
		
		
	}
	
	void msg1(){ // msg1 has a separate copy of 'num' that belongs to the object
		System.out.println(num);
		num = 90; // instance variable
		System.out.println(num);
	}
	
	void msg2(){ // msg2 has a separate copy of 'num' that belongs to the object
		System.out.println(num);
		num = 50; // instance variable
		System.out.println(num);
	}
	
}


class Abc{
	int a = 10; // normal variable
	static int count = 0; // will remain same for every object
}