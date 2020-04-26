package multithreading.nci.demo1;

public class TestThread {
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("Thread-1");
		r1.start();
		
		RunnableDemo r2 = new RunnableDemo("Thread-2");
		r2.start();
	}
}


class RunnableDemo implements Runnable{
	private Thread t;
	private String threadName;
	
	
	RunnableDemo(String name){
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	
	
	@Override
	public void run() {
		System.out.println("Running " + threadName);
		
		for(int i = 4; i>0; i--) {
			System.out.println("Thread: " + threadName + ", "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
		         System.out.println("Thread Inter " +  threadName + " interrupted.");
			}
		}
		
		System.out.println("Thread " + threadName +" exiting");
		
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	
}