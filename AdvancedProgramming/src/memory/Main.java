package memory;

class Test {
	void show() {
		System.out.println("Test::show() called");
	}
}



public class Main {
	public static void main(String[] args) {
		Test t = new Test();;
		t.show();
	}
}