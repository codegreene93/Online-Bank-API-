package multithreading.nci.tutorial;

public class Question4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintChar("a",100));
		Thread t2 = new Thread(new PrintChar("b", 100));
		Thread t3 = new Thread(new PrintNum(1,100));
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}

class PrintChar implements Runnable{
	
	private String name;
	private int x;
	
	
	public PrintChar(String name, int x) {
		this.name = name;
		this.x = x;
	}
	

	@Override
	public void run() {
		printChar();
	}
	
	public void printChar() {
		for (int i=0; i<x; i++)
			System.out.print(name + " ");
	}
	
}


class PrintNum implements Runnable{
	private int num;
	private int x;

	
	public PrintNum(int num, int x) {
		this.num = num;
		this.x = x;
	}

	@Override
	public void run() {
		printNum();
	}
	
	
	public void printNum() {
		for (int i=0; i<x; i++)
			System.out.print(num + " ");
	}
	
}