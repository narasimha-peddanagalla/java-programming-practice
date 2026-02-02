package Strings;
/*
Find the longest palindromic substring in a given string.
Input: String str = "babad";
Output: Longest palindromic substring: "bab" (or "aba")

Approach: Expand Around Center approach
Time Complexity : O(n)^2
*/
public class LongestPalindromicSubString2 {
	public static void main(String[] args) {
		
		String str = "babad";
		
		String longest = "";
		
		for(int i=0;i<str.length();i++) {
			
			// Odd length palindrome
			String odd = expand(str,i,i);
			
			// Even length palindrome
			String even = expand(str,i,i+1);
			
			if(odd.length() > longest.length()) {
				longest = odd;
			}
			
			if(even.length() > longest.length()) {
				longest = even;
			}
		}
		
		System.out.println("Result:"+longest);
	}
	
	public static String expand(String str,int left,int right) {
		
		while(left >= 0 && right < str.length()
				&& str.charAt(left) == str.charAt(right)
		     ){
			
			left--;
			right++;
		}
		return str.substring(left+1, right);
	}
}
