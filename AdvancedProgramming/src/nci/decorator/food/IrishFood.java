package nci.decorator.food;

public class IrishFood extends Food{

	@Override
	public void prepareFood() {
		System.out.println("Preparing Irish food");
	}
}
