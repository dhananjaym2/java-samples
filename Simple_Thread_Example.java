

class SimpleClassExtendingThread extends Thread {

	public void run() {
		for( int i = 0; i < 10; i++) {
			System.out.println("Hello i:" + i + " Thread.name" + Thread.currentThread().getName());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Simple_Thread_Example {

	public static void main(String agrs[]) {
		Thread t1 = new SimpleClassExtendingThread();
		t1.start();

		Thread t2 = new SimpleClassExtendingThread();
		t2.start();
	}
}
