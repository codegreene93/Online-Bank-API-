package nci.decorator.carshop;

public abstract class CarDecorator extends BasicCar{
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	public void makeCar() {
		car.makeCar();
	}
	
}
