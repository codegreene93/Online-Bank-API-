package shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside the Square::draw() method");
	}

	@Override
	public void fillColor() {
		System.out.println("Inside the Square::fillColor() method");		
	}
	

}
