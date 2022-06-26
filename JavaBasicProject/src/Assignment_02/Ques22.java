package Assignment_02;

public class Ques22 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("ping");
				notify();
				try {
					wait();
				} catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("pong");
				notify();
				try {
					wait();
				} catch(Exception e) {}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
