package multithreading.nci.tutorial;


public class Question3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintWord("corona",2));
	
		Thread t2 = new Thread(new PrintWord("virus",2));

		t1.setPriority(2);
		t2.setPriority(1);
		
		t2.start();
		t1.start();
	
	}
}


class PrintWord implements Runnable{
	private String word;
	private int x;
	
	
	public PrintWord(String word, int x) {
		this.word = word;
		this.x = x;
	}
	
	
	public void printWord() {
		for (int i = 0; i<x; i++)
			System.out.println(word);
	}
	
	
	
	@Override
	public void run() {
		printWord();
	}
	
}
