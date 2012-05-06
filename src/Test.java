class Test {
	public static void main(String[] args) {
		Thread th = new ParentThread(10);
		th.start();
	}
}
