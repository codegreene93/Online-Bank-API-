package memory;

public class Test3 {
	String obj_name;
	
	public Test3(String obj_name) {
		this.obj_name = obj_name;
	}
	
	
	static void show() {
		Test3 t1 = new Test3("t1");
		display();

	}
	
	static void display() {
		Test3 t2 = new Test3("t2");
	}
	
	public static void main(String[] args) {
		show();
		
		System.gc();
	}
	
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
