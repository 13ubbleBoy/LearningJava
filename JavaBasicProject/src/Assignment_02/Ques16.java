package Assignment_02;

public class Ques16 {
	static long t1 = 10;
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=20; i++) {
					t1 = t1*10;
					if(t1 > 1000) {
						try{
							wait();
						} catch(Exception e) {}
					}
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=20; i++) {
					t1 = t1/10;
					if(t1 < 1000) {
						notify();
					}
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
