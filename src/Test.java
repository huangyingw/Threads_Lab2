import java.util.ArrayList;
import java.util.List;

class Test {
	public static void main(String[] args) {
		List<Long> data = new ArrayList<Long>();
		Thread th = new ParentThread(10, data);
		th.start();
	}
}
