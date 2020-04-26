package shape;

public class Polygon implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside the Polygon::draw() method");
	}

	@Override
	public void fillColor() {
		System.out.println("Inside the Polygon::fillColor() method");
	}

}
