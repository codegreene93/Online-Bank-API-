package multithreading.nci.demo1;

public class DataRace implements Runnable {  
	static volatile int x = 0;
	
	public void run() {
			for (int i = 0; i < 10000; i++) {  
				x++; 
				x--;
			}
	}
	
	public static void main(String[] args) throws Exception {  
		Thread [] threads = new Thread[100];
		
		for (int i = 0; i < threads.length; i++)
			threads[i] = new Thread(new DataRace()); // create 100 threads

		for (int i = 0; i < threads.length; i++)  
			threads[i].start();	// start the 100 threads

		System.out.println(x);	// x not always 0! Why!?!?!
	}
}