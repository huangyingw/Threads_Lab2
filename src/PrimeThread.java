public class PrimeThread extends Thread {
	int begin;
	int end;

	PrimeThread(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}

	public boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public void run() {
		for (int i = begin; i <= end; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}
}
