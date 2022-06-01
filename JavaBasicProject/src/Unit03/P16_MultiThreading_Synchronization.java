package Unit03;

// 25/05/2022 | Thursday

public class P16_MultiThreading_Synchronization {

	public static void main(String[] args) throws InterruptedException {

		WebCount obj = new WebCount();

		Thread threadOne = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {

					obj.webcount();

				}
			}
		});

		Thread threadTwo = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {

					obj.webcount();

				}
			}
		});

		threadOne.start();
		threadTwo.start();

		//Waits for this thread to die. {Main thread will wait until this thread is finished}
		threadOne.join(); // This lines means the thread who started this thread, it has to wait for this thread to get finish after that
		// the thread who started this thread can execu
		
		//Waits for this thread to die. {Main thread will wait until this thread is finished}
		threadTwo.join();

		System.out.println("Count : " + WebCount.count);

	}

}

class WebCount {

	public static int count = 0;

	//You want T1 to complete first and then T2 
	public synchronized void webcount() { // Where ever there is 'synchronized' word is used with a method then if 2 thread get into
		// this method then 1 has to wait for the one who has come before. In this way it will get executed sequently
		
		//If not synchronised then, T1 and T2 may read the same value of count at 
		//the same time and may increment same time as well
		count++;
	}
}