package nci.observer.example1;

public class ObserverPatternExample {
	public static void main(String[] args) {
		System.out.println("Observer Pattern Demo in Higher Diploma class\n");
		
		/*Creating Observers*/
		Observer myObserver1 = new ObserverType1("Aida");
		Observer myObserver2 = new ObserverType1("Lorna");
		Observer myObserver3 = new ObserverType2("Fe");
		Observer myObserver4 = new ObserverType3("Alan");
		
		

		/*Creating the Subject*/
		Subject subject = new Subject();
		
		/*Registering Observers*/
		subject.register(myObserver1);
		subject.register(myObserver2);
		subject.register(myObserver3);

		subject.setFlag(5);
		
		
		System.out.println("\nSetting flag = 737");
		subject.setFlag(737);
		
		
		/*Unregistration*/
		subject.unregister(myObserver1);

		
		System.out.println("\n Setting flag = 50");
		subject.setFlag(50);
		
		
		subject.register(myObserver4);
		
		
		System.out.println("\n Setting flag = 100");
		subject.setFlag(100);
		
		
	}
}
