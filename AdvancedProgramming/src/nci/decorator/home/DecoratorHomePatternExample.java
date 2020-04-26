package nci.decorator.home;

public class DecoratorHomePatternExample {
	public static void main(String[] args) {
		System.out.println("***Decorator pattern Demo***\n");
		ConcreteComponent withoutDecorator = new ConcreteComponent();
		withoutDecorator.makeHouse();
		
		//Using a decorator to add floor
		System.out.println("\nUsing a Floor decorator now");
		AbstractDecorator floorDecorator = new FloorDirector();
		floorDecorator.setTheComponent(withoutDecorator);
		floorDecorator.makeHouse();
		System.out.println("____________________________");
		
		
		//Using a decorator to add paint
		System.out.println("\nUsing a Paint decorator now");
		AbstractDecorator paintDecorator = new PaintDecorator();
		paintDecorator.setTheComponent(withoutDecorator);
		paintDecorator.makeHouse();
		System.out.println("____________________________");
		
		
	}
}
