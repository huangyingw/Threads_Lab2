public class mainThreadClass {
	public static void main(String[] args) {
		int threadCount = 10;
		int upLimit = 1000000;
		int unit = upLimit / threadCount;
		for (int i = 0; i < threadCount; i++) {
			PrimeThread p = new PrimeThread(1 + unit * i, unit * (i + 1));
			p.start();
		}
	}
}
