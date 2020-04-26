package nci.observer.example1;

public class ObserverType1 implements Observer{

	private String nameOfObserver;

	public ObserverType1(String name) {
		this.nameOfObserver = name;
	}
	
	@Override
	public void update(int updatedValue) {
		System.out.println("ObserverType1 " + nameOfObserver + " has received and alert : Updated myValue in Subject is: " + updatedValue);
 	}

}
