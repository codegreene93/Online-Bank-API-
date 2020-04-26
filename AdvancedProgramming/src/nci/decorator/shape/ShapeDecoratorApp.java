package nci.decorator.shape;

public class ShapeDecoratorApp {
	public static void main(String[] args) {
		Shape circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle with red border");
		redCircle.draw();
		
		System.out.println("\nRectangle with Red border");
		redRectangle.draw();
		
	}
}
