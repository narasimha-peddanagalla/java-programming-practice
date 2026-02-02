package Strings;
import java.util.HashSet;
/*
Find the length of the longest substring without repeating characters.
A substring must be continuous and contain only unique characters.
Input: String str = "abcabcbb";
Output: Longest substring : abc | length: 3 

Approach-1 : Bruteforce Technique
Time Complexity: Worst, Average, Best -  O(n)^2
*/
public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abcabcbb";
		
		String longest = "";
				
		for(int i=0;i<str.length();i++) {
			
			HashSet<Character> set = new HashSet<>();
			String current = "";
			
			for(int j=i;j<str.length();j++) {
				
				if(set.contains(str.charAt(j))) {
					break;
				}
				
				set.add(str.charAt(j));
				
				current += str.charAt(j);
				
				if(current.length() > longest.length()) {
					longest = current;
				}
			
			}
		}
		System.out.println("Longest Sub String:"+longest);
		System.out.println("Length:"+longest.length());
	}
	
}
