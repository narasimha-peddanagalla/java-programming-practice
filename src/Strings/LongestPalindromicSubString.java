package Strings;
/*
Find the longest palindromic substring in a given string.
Input: String str = "babad";
Output: Longest palindromic substring: "bab" (or "aba")

Approach: BruteForce
Time Complexity : O(n)^3
*/


public class LongestPalindromicSubString {
	public static void main(String[] args) {
		
		String str = "babad";
		
		String longest = "";
		
		for(int i=0;i<str.length();i++) { //O(n)
			
			for(int j=i;j<=str.length();j++) { //O(n)
				
				String subStr = str.substring(i,j);
				
				if(isPalindrome(subStr)) {  //O(n)
					
					if(subStr.length() > longest.length()) {
						longest = subStr;
					}
				}
			}
		}
		
		System.out.println("Result:"+longest);
	}
	
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length()-1;
		
		while(left < right) {	
			if(str.charAt(left) != str.charAt(right)) {	
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
