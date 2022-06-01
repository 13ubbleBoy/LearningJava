package Unit03;

//25/5/2022 | Wednesday

import java.util.Scanner;


/*
 * Question) Is Threading a concept of JAVA ?
 * --> Using JAVA we can implement Threading but it is not a concept of JAVA. It is just a concept.
 * 
 * Question) Why do we need to make thread class's object when we already made our class and extended thread class ?
 * --> Because JVM does not understand user defined thread it only understands it own threads, thats why we need to make our
 * 	   class's object and pass it to the thread's object.
 * 
 * Question) Why does execution comes to the main mthods's 1st line ?
 * --> 
 * 
 * 
 * 
 * Question) What can a user do/control in multi threading ?
 * --> 1) Identify dependent and non dependent tasks in respective process.
 * 	   2) Insert selective task into threads, which are not dependent on other task.
 * 	   3) Start those threads.
 */


public class P16_Multithreading {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		C1 obj1 = new C1();
		C2 obj2 = new C2();
		
		obj1.show1(); // CPU will not execute next line until this line is executed, this is called Sequential Process.
		obj1.area();
		obj2.show2();
		*/
		
		// We need to tell JVM to start the thread
		Thread t1 = new Thread(new T1(), "T1_Thread"); // We made 'Thread' class's object instead the the 'T1 & T2' we made because JVM only understands its own thread
		Thread t2 = new Thread(new T2(), "T2_Thread"); // We will make our object ('new T1()', 'new T2()') and we'll pass the object of our class to the thread class
		// "T1_Thread" and "T2_Thread" are name of objects of user defined class
		
		
		//Thread t3 = new Thread(new T2(), "T3");
		
		
		t1.start(); // Now CPU will not wait for t1 to finish it will
		t2.start(); // CPU will come to this task also
		//t3.start();
		
		// Above thread are in now JVM queue
	}
}


class C1{
	
	int r = 0;
	
	void show1() {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		System.out.println(r);
		
		sc.close();
	}
	
	void area() { // This method depends on show1() method for the radius to calculate area
		System.out.println("Area : " + r*r);
	}
}

class C2{
	
	void show2() {
		for(int i=0; i<10; i++) {
			System.out.println("Hey");
		}
	}
}





// Making Thread classes : They don't start on their own, user has to start them. Then JVM will do those for us (executing tasks concurrently)

class T1 extends Thread{ 
	
	int r = 0;
	
	public void run() { // 'run()' is a built in method in Thread class and we are overriding it (user defined)
		for(int i=0; i<10000; i++) {
			//System.out.println("Hey 1 : " + i+1);
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class T2 extends Thread{ // 'run()' is a built in method in Thread class and we are overriding it (user defined)
	
	public void run() {
		for(int i=0; i<10000; i++) {
			//System.out.println("Hey 2 : " + i+1);
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class T3 extends Thread{ // 'run()' is a built in method in Thread class and we are overriding it (user defined)
	
	public void run() {
		for(int i=0; i<10000; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}