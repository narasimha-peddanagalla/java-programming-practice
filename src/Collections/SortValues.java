package Collections;
import java.util.*;

//Sort HashMap based on the Values
public class SortValues {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		//Add Entries into Map
		
		map.put("Java", 5);
		map.put("Python", 2);
		map.put("SQL", 1);
		map.put("Spring", 4);
		map.put("Linux", 3);
		
		System.out.println(map);	
		
		//1.Covert Map to List
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		//2.Sort list by values
		list.sort(Map.Entry.comparingByValue());
		
		System.out.println(list);
		
		//3.Insert the Key:value pairs into LinkedHashMap
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String,Integer> entry : list) {
			
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);
	}
}
