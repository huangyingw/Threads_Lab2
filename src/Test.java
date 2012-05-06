class Test {
	public static void main(String[] args) throws InterruptedException {
		Thread th = new ParentThread(10);
		th.start();
	}
}
