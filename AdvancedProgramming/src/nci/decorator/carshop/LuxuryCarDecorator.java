package nci.decorator.carshop;

public class LuxuryCarDecorator extends CarDecorator{

	public LuxuryCarDecorator(Car car) {
		super(car);
	}

	public void makeCar() {
		car.makeCar();
		setLuxury();
	}

	private void setLuxury() {
		System.out.println(" Adding features of Luxury Car.");
	}
	
}
