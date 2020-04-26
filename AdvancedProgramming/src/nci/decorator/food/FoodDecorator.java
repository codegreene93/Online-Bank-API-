package nci.decorator.food;

public abstract class FoodDecorator extends Food{
	protected Food food;

	public FoodDecorator(Food food) {
		this.food = food;
	}
	
	@Override
	public void prepareFood() {
		food.prepareFood();
	}
	
	
	
}
