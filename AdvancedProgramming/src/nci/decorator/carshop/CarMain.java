package nci.decorator.carshop;

public class CarMain{
	public static void main(String[] args) {
		
		Car basic = new BasicCar();
		basic.makeCar();
		
		System.out.println();
		
		CarDecorator sports = new SportCarDecorator(basic);
		sports.makeCar();
		
		System.out.println();

		CarDecorator luxury = new LuxuryCarDecorator(basic);
		luxury.makeCar();
	}
}
