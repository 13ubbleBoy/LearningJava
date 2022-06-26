package Assignment_02;

public class Ques01 {
	
	static int t1 = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					t1 = t1 + 5;
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					t1 = t1 + 5;
				}
			}
		});
		Thread th3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					t1 = t1 + 5;
				}
			}
		});
		Thread th4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					t1 = t1 + 5;
				}
			}
		});
		Thread th5 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					t1 = t1 + 5;
				}
			}
		});
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th1.join();
		th2.join();
		th3.join();
		th4.join();
		th5.join();
		System.out.println(t1);
	}
}
