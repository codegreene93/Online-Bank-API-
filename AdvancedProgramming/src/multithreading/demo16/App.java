package multithreading.demo16;

import java.util.Random;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			
			public void run() {
				Random random = new Random();
				
				System.out.println("Starting....");
				
				for(int i =0; i<1E8; i++) {
					/*
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("Interrupted!");
						break;
					}
					*/
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						System.out.println("Interrupted!");
						break;
					}
					
					Math.sin(random.nextDouble());

					
				}
				
				System.out.println("Finished");
			}
			
		});
		
		
		t1.start();
		
		Thread.sleep(500);
		
		t1.interrupt();
		
		
		t1.join();
		
	}
}
