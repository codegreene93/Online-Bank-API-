package nci.decorator.food;

public class VegFoodDecorator extends FoodDecorator{
	public VegFoodDecorator(Food food) {
		super(food);
	}
	
	public void prepareFood() {
		super.prepareFood();
		chooseVegetarian();
	}

	private void chooseVegetarian() {
		System.out.println("With vegetarian ingredients.");
	}
	
	
}
