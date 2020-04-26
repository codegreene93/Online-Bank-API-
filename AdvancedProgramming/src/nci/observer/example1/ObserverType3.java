package nci.observer.example1;

public class ObserverType3 implements Observer{
	private String observerName;
	
	public ObserverType3(String name){
		this.observerName = name;
	}

	@Override
	public void update(int updatedValue) {
		System.out.println("ObserverType3 " + observerName + " has received an updated value " + updatedValue);
	}
	
	
	
	
	
}
