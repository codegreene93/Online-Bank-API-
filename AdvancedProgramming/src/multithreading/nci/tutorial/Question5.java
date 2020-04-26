package multithreading.nci.tutorial;

class Sleeper implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}




public class Question5 {
	public static void main(String[] args) {
		
		Thread[] threads = new Thread[1000];
		
		for (int i = 0; i<threads.length; i++) {

			threads[i] = new Thread(new Sleeper());
			
			threads[i].start();
			
			System.out.println("Number of active threads: " + Thread.activeCount());
			
		}
		
		
	}
}
