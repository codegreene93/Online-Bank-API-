package memory;

public class Memory {
	private static int a;
	
	public static void main(String[] args) {                                                      
		Object obj = new Object();          
		Memory mem = new Memory();          
	    System.out.println("First time: " + a);
		mem.foo(obj);                       
	    System.out.println("Second time: " + a);     
	}                                           

	private void foo(Object param) {            
		String str = param.toString();      
		System.out.println(str);
	    a = 2;
	    System.out.println("Third time: " + a);
    }
}