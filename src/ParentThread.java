public class ParentThread extends Thread {
	int num;

	ParentThread(int num) {
		this.num = num;
	}

	public void run() {
		synchronized (this) {
			ThreadB b = new ThreadB();
			b.start();
			System.out.println("b is start....");
			synchronized (b) {
				try {
					System.out.println("Waiting for b to complete...");
					b.wait();
					System.out.println("Completed.Now back to main thread");
				} catch (InterruptedException e) {
				}
			}
			System.out.println("Total is :" + b.total);
			notify();
		}
	}
}
