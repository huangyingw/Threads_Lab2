class Test {
	public static void main(String[] args) {
		// Thread fib = new FibThread(6);
		// fib.start();
		Thread th = new ParentThread(10);
		th.start();
	}
}
