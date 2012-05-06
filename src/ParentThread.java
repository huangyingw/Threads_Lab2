import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParentThread extends Thread {
	int num;
	private List<Long> data;

	ParentThread(int num, List<Long> data) {
		this.num = num;
		this.data = data;
	}

	public String toString() {
		String result = "";
		Iterator<Long> it = data.iterator();
		while (it.hasNext()) {
			result += it.next().toString() + ",";
		}
		return result;
	}

	public void run() {

		Thread fib = new FibThread(num, data);
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
		System.out.println(this);
	}
}
