package Strings;
import java.util.HashSet;
/*
Find the longest substring without repeating characters.
A substring must be continuous and contain only unique characters.
Input: String str = "abcabcbb";
Output: Longest substring : abc | length: 3 

Approach-2 : Using Sliding Window Technique
Time Complexity: Worst, Average, Best - O(n)
*/
public class LongestSubstring2 {
	public static void main(String[] args) {
		
		String str = "abcabcbb";
		
		int left = 0;
		int maxLength = 0;
		int startIndex = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		
		for(int right = 0; right < str.length(); right++) {
			
			while(set.contains(str.charAt(right))) {
				
				set.remove(str.charAt(left));
				
				left++;
			}
			
			set.add(str.charAt(right));
			
			
			if((right-left+1) > maxLength) {
				
				maxLength = right - left + 1;
				startIndex = left;
			}
		}
		//Fetch SubString
		String subString = str.substring(startIndex, startIndex + maxLength);
		
		System.out.println("Longest SubString:"+subString);
		System.out.println("Length:"+maxLength);
	
	}
}
