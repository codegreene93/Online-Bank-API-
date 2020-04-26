package nci.decorator.food;

public class FoodMain {
	public static void main(String[] args) {
		
		
		Food chinese = new ChineseFood();
		FoodDecorator chineseVeg = new VegFoodDecorator(chinese);
		chineseVeg.prepareFood();
		System.out.println("---------------------------");
		
		
		Food irish = new IrishFood();
		FoodDecorator irishNonVeg = new NonVegDecorator(irish);
		irishNonVeg.prepareFood();
		System.out.println("---------------------------");

		
		
		
		
	}
}
