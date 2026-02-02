package Strings;
import java.util.*;

//Find Duplicate Characters in a String
public class FindDuplicates {
	public static void main(String[] args) {
		String str = "Programming ";
		
		//Edge Case - Case Insensitive & Avoid spaces
		str = str.toLowerCase().replaceAll("\\s+", "");
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + "-" +entry.getValue());
			}
		}
	}
}
