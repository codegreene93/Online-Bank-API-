package dogs;

public abstract class Dog {
	protected double price;
	protected String name;
	
	
	protected void buyDog() {
		System.out.println(name + " is worth " + price);
	}
	
	
	public abstract void getDog();
}
