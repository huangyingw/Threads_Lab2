public class ParentThread extends Thread {
	int num;

	ParentThread(int num) {
		this.num = num;
	}

	public void run() {
		Thread fib = new FibThread(num);
		fib.start();
		System.out.println("fib is start....");
		synchronized (fib) {
			try {
				System.out.println("Waiting for fib to complete...");
				fib.join();
				System.out.println("Completed.Now back to main thread");
			} catch (InterruptedException e) {
			}
		}
		System.out.println(fib);
	}
}
