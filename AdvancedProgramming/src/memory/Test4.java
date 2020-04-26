package memory;

public class Test4 {
	String obj_name;
	
	public Test4(String obj_name) {
		this.obj_name = obj_name;
	}
	
	
	public static void main(String[] args) {
		new Test4("t1");
		
		
		System.gc();
	}
	
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
