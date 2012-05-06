public class FibThread extends Thread {
	int num;

	FibThread(int num) {
		this.num = num;
	}

	public long Fib() {
		if (num < 4)
			return 1;
		else {
			long a = 1;
			long b = 1;
			for (int i = 2; i < num; i++) {
				b = a + b;
				a = b - a;
				System.out.println("a = " + a + "  b = " + b);
			}
			return a;
		}
	}

	public void run() {
		System.out.println(Fib());
	}
}
