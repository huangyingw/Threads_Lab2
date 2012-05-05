public class mainThreadClass {
	public static void main(String[] args) {
		FibThread p = new FibThread(1);
		p.start();
	}
}
