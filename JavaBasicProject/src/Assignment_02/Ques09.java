package Assignment_02;

public class Ques09 {

	public static void main(String[] args) throws InterruptedException {
		BANK b = new BANK();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				b.withDrawVIAPhonePay(1500);
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				b.depositVIAGooglePay(1000);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}

class BANK{
	int balance = 1000;
	
	synchronized void withDrawVIAPhonePay(int amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
			try {
				wait();
			} catch (Exception e) {}
			balance = balance - amount;
			System.out.println("Withdraw completed");
		}
	}
	
	synchronized void depositVIAGooglePay(int amount) {
		balance = balance + amount;
		System.out.println("Amount deposited");
		notify();
	}
}
