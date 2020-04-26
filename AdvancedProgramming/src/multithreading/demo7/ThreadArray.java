package multithreading.demo7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadArray {
	public static void main(String[] args) {
		
		
		//int coreCount = Runtime.getRuntime().availableProcessors();
		
		//System.out.println(coreCount);
		
		//ExecutorService executor = Executors.newFixedThreadPool(coreCount);
		
		//ExecutorService executor = Executors.newCachedThreadPool();
		
		
		/*
		for(int i = 0; i<100; i++) {
			executor.execute(new Task());
		}
		*/
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
		
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
		
		
		
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		
	}
}


class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(" Starting Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Completed Thread: " + Thread.currentThread().getName());

	}
	
}