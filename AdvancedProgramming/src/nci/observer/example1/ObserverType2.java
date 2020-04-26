package nci.observer.example1;

public class ObserverType2 implements Observer{
	private String nameOfObserver;

	public ObserverType2(String nameOfObserver) {
		super();
		this.nameOfObserver = nameOfObserver;
	}

	@Override
	public void update(int updatedValue) {
		System.out.println("ObserverType2 " + nameOfObserver + " has received an update from the subject with the UpdatedValue " + updatedValue);
	}
	
	
	
	
	
	
	
}
