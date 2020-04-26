package memory;

public class Test1 {

	String obj_name;
	
	public Test1(String obj_name) {
		this.obj_name = obj_name;
	}
	
	
	public static void main(String[] args) {
		Test1 t1 = new Test1("t1");
		
		t1 = null;
		
		System.gc();
	}
	
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
