package Strings;
import java.util.HashMap;

//Check whether 2 Strings are Anagrams are Not
//Using Collections - HashMap

public class Anagrams2 {
	public static void main(String[] args) {
		
		String s1 = "Silent";
		String s2 = "Listen";
		
		//Edge Case - Case Insensitive & ignore spaces
		s1 = s1.toLowerCase().replaceAll("\\s+", "");
		s2 = s2.toLowerCase().replaceAll("\\s+", "");
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagrams");
			return;
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : s1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		//Check the s1 chars are present in s2 or not
		for(char ch : s2.toCharArray()) {
			
			if( ! map.containsKey(ch)) {
				System.out.println("Not Anagrams");
				return;
			}
			
			map.put(ch, map.get(ch) - 1);
			
			if(map.get(ch) == 0) {
				map.remove(ch);
			}
		}
		
		if(map.isEmpty()) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}	
	}
}
