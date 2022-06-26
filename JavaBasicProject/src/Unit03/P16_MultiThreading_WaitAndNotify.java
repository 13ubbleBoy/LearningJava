package Unit03;

//25/05/2022 | Thursday

/*
 * 
 * Inter thread Communication:
   - Threads uses wait, notify() and notifyAll() methods from Object Class
   - command + Shift + T -> Find object class and see its methods
   - command + O -> all methods
 * 
 * */



public class P16_MultiThreading_WaitAndNotify {

	public static void main(String[] args) {

		SharedResource c = new SharedResource();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
//		new Thread() {
//			public void run() {
//				c.withdraw(15000);
//			}
//		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
				//c.deposit(30000);
			}
		}.start();
	}

}

class SharedResource {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait(); // This function will wait tell any thread notifies it that the condition is favourable
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify(); // It sends the notification to a particular waiting function 'wait()' that the condition is favourable
		//notifyAll(); // It will send notification to all the waiting function that the condition is favourable
	}
}