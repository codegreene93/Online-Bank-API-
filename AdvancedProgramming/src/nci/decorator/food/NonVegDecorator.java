package nci.decorator.food;

public class NonVegDecorator extends FoodDecorator{

	public NonVegDecorator(Food food) {
		super(food);
	}

	
	public void prepareFood() {
		super.prepareFood();
		chooseNonVegetarian();
	}


	private void chooseNonVegetarian() {
		System.out.println("With non vegetarian ingredients");
	}
	
	
}
