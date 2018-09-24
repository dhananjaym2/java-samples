
class Simple_Class_Implementing_Runnable implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello i:" + i + " Thread name: " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Simple_Thread_Example_Using_Runnable {

	public static void main(String args[]) {
		Simple_Class_Implementing_Runnable runnableObject = new Simple_Class_Implementing_Runnable();
		Thread t1, t2;

		t1 = new Thread(runnableObject);
		t1.start();

		t2 = new Thread(runnableObject);
		t2.start();
	}
}
