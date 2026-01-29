package Strings;
import java.util.*;
/*Remove duplicate characters from a string
  Input:  "programming"
  Output: "progamin"
 */

//Using Collections - LinkedHashSet (to preserve order)
import java.util.LinkedHashSet;

public class RemoveDulpicates {
	public static void main(String[] args) {
		
		String str = "programming";
		
		//Edge Case - case-insensitive & ignore spaces
		str = str.toLowerCase().replaceAll("\\s+","");
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder unique = new StringBuilder();
		
		for(char ch : set) {
			unique.append(ch);
		}
		
		System.out.println(unique.toString());
	}
}
