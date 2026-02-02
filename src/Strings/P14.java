package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

//This Solution is not Correct for All String Compression Problems
//Check P15 for Exact Solution
//String Compression
//Ex: "aaabbc" -> a3b2c1
public class P14 {
	public static void main(String[] args) {
		
		String str = "aaabbc";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		//Get Frequency
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		
		//Print
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			
			System.out.print(entry.getKey() +""+ entry.getValue());
		}
	}

}
