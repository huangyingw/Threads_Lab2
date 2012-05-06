import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FibThread extends Thread {
	int num;
	private List<Long> data;

	FibThread(int num) {
		this.num = num;
		data = new ArrayList<Long>();
	}

	public void Fib() {
		if (num == 1)
			data.add((long) 0);
		if (num < 4 && num > 1)
			data.add((long) 1);
		else {
			long a = 1;
			long b = 1;
			for (int i = 2; i < num; i++) {
				b = a + b;
				a = b - a;
				// System.out.println("a = " + a + "  b = " + b);
				data.add((long) a);
			}

		}
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
		Fib();
		System.out.println(this);
	}
}
