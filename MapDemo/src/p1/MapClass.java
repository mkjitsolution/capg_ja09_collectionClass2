package p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap();
		
		map.put("Z", 4747);
		map.put("PA", 14747);
		map.put("B", 665747);
		map.put("A", 454747);
		
		System.out.println(map);
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext())
		{
			int value = map.get(itr.next());
			System.out.println(value);
		}
		
		
		//   1) ----- EntrySet How to iterate using Map.Entry<>
		//   2) What is EntrySet
		
		
		Map<String, Employee> empMap = new HashMap<>();
		
		empMap.put("edes", new Employee(101, "X"));
		
		
		Employee e = empMap.get("edes");
		
		
	}
}
