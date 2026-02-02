package Strings;
//Check Given String is Palindrome or Not
//Approach-2 : Two Pointer Method

public class Palindrome2 {
	public static void main(String[] args) {
		
		String str = "Nurses run ";
		
		//Edge Case - Case insensitive & Avoid spaces
		str = str.toLowerCase().replaceAll("\\s+","");
		
		int left = 0, right = str.length()-1;
		
		boolean isPalindrome = true;
		
		while(left<right){
			
			if(str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(isPalindrome ? "Palindrome":"Not Palindrome");
	}
}
