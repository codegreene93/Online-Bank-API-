package nci.decorator;

class Human {
	public static void walk() {
		System.out.println("Human walks!");
	}
}


public class Boy extends Human {
	public static void walk() {
		System.out.println("Boy walks!");
	}
	
	public static void main(String[] args) {
		Boy obj = new Boy();
		Human obj2 = new Human();
		
		obj.walk();
		obj2.walk();
		
	}
	
}
