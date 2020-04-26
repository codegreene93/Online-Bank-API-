package nci.decorator.home;

public class PaintDecorator extends AbstractDecorator{
	public void makeHouse() {
		component.makeHouse();
		System.out.println("***Paint decorator is in action");
		paintHouse();
	}

	private void paintHouse() {
		System.out.println("Now I am painting the house");
	}
}
