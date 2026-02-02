package Collections;
//Count Frequency Using HashMap

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	public static void main(String[] args) {
		
		//Count Frequency of Characters
		String str = "Programming";
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			charMap.put(ch,charMap.getOrDefault(ch,0) + 1);
		}
		
		System.out.println(charMap);
		
		//Print the Frequencies
		for(Map.Entry<Character,Integer> entry : charMap.entrySet()) {
			System.out.println(entry.getKey() + "-" +entry.getValue());
		}
		
System.out.println("------------------------------------------------");
		
		//Count Frequency of Numbers
		
		int[] nums = {1,2,2,1,3,4,5,3,2};
		
		HashMap<Integer,Integer> numMap = new HashMap<>();
		
		for(int num : nums) {
			numMap.put(num, numMap.getOrDefault(num,0)+1);
		}
		
		System.out.println(numMap);
		
		//Print through Entry
		for(Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
	}

}
