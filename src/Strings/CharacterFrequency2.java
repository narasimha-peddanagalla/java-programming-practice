package Strings;
import java.util.*;
//Find frequency of each character in a string
//Ex: Input:"programming" -> Output: p-1 r-2 o-1 g-2 a-1 m-2 i-1 n-1

//Using Collections - LinkedHashMap
public class CharacterFrequency2 {
	public static void main(String[] args) {
		String str = "programming";
		
		str = str.toLowerCase().replaceAll("\\s", "");
		
		LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}
		System.out.println(freqMap);
	    //{p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
		
		//Traverse and Print Each Entry
		for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
