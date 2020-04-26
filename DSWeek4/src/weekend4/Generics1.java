package weekend4;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
	public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			
			list.add(1);
			list.add(9);
			list.add(5);
			
			for(Integer val : list)
				System.out.println(val);
			
			
		
		}
		
	}


