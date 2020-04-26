import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class LengthComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		
		if(len1<len2) {
			return -1;
		}
		else if(len1>len2) {
			return 1;
		}
		return 0;
	}
	
}


class ReverseAlphabeticalComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}


class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}





public class SortingList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Willy");
		list.add("Myrna");
		list.add("Wilmir");
		list.add("Rhea");
		list.add("Jhon");
		
		
		Collections.sort(list, new ReverseAlphabeticalComparator());
		
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(99);
		list2.add(30);
		list2.add(54);
		list2.add(14);
		list2.add(89);

		Collections.sort(list2, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
			
		});
		
		System.out.println(list2);
		
		

		List<Person> people = new ArrayList<>();
		
		people.add(new Person(2, "Wilmir"));
		people.add(new Person(3, "Rhea Rhubie"));
		people.add(new Person(0, "Wily"));
		people.add(new Person(1, "Myrna"));
		people.add(new Person(4, "Jhon Ric"));
		
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				return ((Integer)p1.getId()).compareTo((Integer)p2.getId());
			}
			
		});
		
		for(Person person: people) {
			System.out.println(person);
		}
		
		
		
		
	}
}
