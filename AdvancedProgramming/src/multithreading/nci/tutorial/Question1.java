package multithreading.nci.tutorial;

public class Question1 {

	public static void main(String[] args) {
		
		Thread[] threads = new Thread[5];
		
		
		for (int i =0; i<threads.length; i++) {
			threads[i] = new Thread();
			
			threads[i].setName(((Long)threads[i].getId()).toString());
			
			System.out.println("Id of Thread " + threads[i].getName() + " is " + threads[i].getId());
			
		}
	
		
		
		
		
	}
	
}
