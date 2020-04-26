package udemy_serialization;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private transient int id;
	private String name;
	
	private static int count;
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	

}
