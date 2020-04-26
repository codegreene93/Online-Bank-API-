import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Persona implements Comparable<Persona>{
	private String name;
	
	public Persona(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int compareTo(Persona person) {
		// TODO Auto-generated method stub
		return -name.compareTo(person.name);
	}
	
}



public class NaturalOrdering {
	public static void main(String[] args) {
		List<Persona> list = new ArrayList<>();
		SortedSet<Persona> set = new TreeSet<>();

		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		
		showElements(list);
		System.out.println();
		showElements(set);

	}
	
	
	private static void addElements(Collection<Persona> col) {
		col.add(new Persona("Wilfredo"));
		col.add(new Persona("Myrna"));
		col.add(new Persona("Wilmir"));
		col.add(new Persona("Rhea Rhubie"));
		col.add(new Persona("Jhon Ric"));
	}
	
	
	private static void showElements(Collection<Persona> col) {
		for(Persona person:col) {
			System.out.println(person);
		}
	}
	
	
}
