package nci.decorator.home;

public class FloorDirector extends AbstractDecorator{
	public void makeHouse() {
		component.makeHouse();
		System.out.println("***Floor decorator is in action***");
		addFloor();
	}

	private void addFloor() {
		System.out.println("I am making an additional floor on top of it.");
	}
	
	
	
	
}
