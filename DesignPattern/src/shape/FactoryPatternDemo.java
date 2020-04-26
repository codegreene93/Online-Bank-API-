package shape;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape square = factory.getShape("Rectangle");
		square.draw();
		square.fillColor();
		
		Shape polygon = factory.getShape("Polygon");
		polygon.draw();
		polygon.fillColor();
	}
}
