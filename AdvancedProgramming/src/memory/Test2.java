package memory;

public class Test2 {
	String obj_name;
	
	public Test2(String obj_name) {
		this.obj_name = obj_name;
	}
	
	
	public static void main(String[] args) {
		Test2 t1 = new Test2("t1");
		Test2 t2 = new Test2("t2");
		
		t1 = t2;
		
		System.gc();
	}
	
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
