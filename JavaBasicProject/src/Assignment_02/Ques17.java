package Assignment_02;

public class Ques17 {

	public static void main(String[] args) throws InterruptedException {
		BANK2 b2 = new BANK2();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=3; i++) {
					b2.PhonePay(1500);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=4; i++) {
					b2.GooglePay(1000);
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}

class BANK2{
	int balance = 1000;
	synchronized void PhonePay(int amount) {
		if(amount > balance) {
			System.out.println("Amount less cannot withdraw");
			try {
				wait();
			} catch(Exception e) {}
		}
		System.out.println("Withdraw completed");
	}
	synchronized void GooglePay(int amount) {
		balance = balance + amount;
		System.out.println("Amount : " + amount + " deposited");
		notify();
	}
}