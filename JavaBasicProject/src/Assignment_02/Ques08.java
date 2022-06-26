package Assignment_02;

public class Ques08 {
	static int t1 = 0;
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					t1 = t1+10;
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					t1 = t1-10;
				}
			}
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(t1);
	}

}
