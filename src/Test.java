class Test {
	public static void main(String[] args) throws InterruptedException {
		Thread fib = new FibThread(10);
		fib.start();
		System.out.println("b is start....");
		synchronized (fib) {
			try {
				System.out.println("Waiting for fib to complete...");
				fib.wait();
				System.out.println("Completed.Now back to main thread");
			} catch (InterruptedException e) {
			}
		}
		System.out.println(fib);
	}
}
