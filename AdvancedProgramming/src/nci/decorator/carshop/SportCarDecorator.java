package nci.decorator.carshop;

public class SportCarDecorator extends CarDecorator{

	public SportCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void makeCar() {
		car.makeCar();
		setSports();
	}

	private void setSports() {
		System.out.print(" Adding features of Sports Car.");
	}

}
