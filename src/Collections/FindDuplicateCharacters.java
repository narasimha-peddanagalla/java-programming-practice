package Collections;
import java.util.*;

//Find Duplicate and Unique Characters in the String
public class FindDuplicateCharacters {
	public static void main(String[] args) {
		String str = "programming";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.print("Duplicates:");
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			//Logic: duplicate -> freq>1
			if(entry.getValue()>1) {
				
				System.out.print(entry.getKey() + " ");
			}
		}
		
		System.out.println();
		
		//Unique Characters
		
		StringBuilder unique = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			
			if(unique.indexOf(String.valueOf(c)) == -1) {
				
				unique.append(c);
			}
		}
		
		System.out.println("Unique:"+unique);
	}
}
