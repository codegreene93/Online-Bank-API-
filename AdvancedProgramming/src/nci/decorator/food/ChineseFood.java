package nci.decorator.food;

public class ChineseFood extends Food{

	@Override
	public void prepareFood() {
		System.out.println("Preparing Chinese Food");
	}

}
