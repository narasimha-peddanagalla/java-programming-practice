package Strings;
import java.util.LinkedHashMap;
//Find first non-repeated character in a string
//Input: "swiss" | Output: w

//Using Collections - LinkedHashMap
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "swiss";
		
		//Edge Case - case-insensitive & ignore spaces
		str = str.toLowerCase().replaceAll("\\s", "");
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch : str.toCharArray()) {
			
			if(map.get(ch) == 1) {
				System.out.println(ch);
				return;
			}
		}
		
		System.out.println("No FirstNonRepeatingCharacter is Found");
	}
}
