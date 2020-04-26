package generics.practice;

public class GenericsInheritance {

	public static void main(String[] args) {
		String str = "abc";
		Object obj = new Object();
		obj = str;
		
		
		MyClass<String> myClass1 = new MyClass<>();
		MyClass<Object> myClass2 = new MyClass<>();
		obj = myClass1;
		
	}
	
	public static class MyClass<T>{}
	
	
}
