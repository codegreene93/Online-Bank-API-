package shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside the Circle::method()");
	}
	
	public void fillColor() {
		System.out.println("Inside the Circle::fillColor()");
	}

}
