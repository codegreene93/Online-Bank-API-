package shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside the Rectangle::draw() method");
	}

	@Override
	public void fillColor() {
		System.out.println("Inside the Rectangle::fillColor() method");
	}

}
