package nci.decorator.shape;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		this.decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
	

}
