import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapApp {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> map3 = new TreeMap<Integer,String>();
		
		System.out.println("HashMap");
		processMap(map1);
		System.out.println("\nLinkedHashMap");
		processMap(map2);
		System.out.println("\nTreeMap");
		processMap(map3);
	
	}
	
	public static void processMap(Map<Integer, String> map) {
		map.put(3, "Wilmir");
		map.put(1,"Willy");
		map.put(2, "Myrna");
		map.put(4, "Rhea");
		map.put(5, "Jhon");
		
		System.out.println(map);
		
		for(Integer key : map.keySet()) {
			String name = map.get(key);
			System.out.println(key + " : " + name);
		}
		
	}
	
	
}
