package Strings;
/*
Check Whether a String is a Pangram
A pangram is a sentence that contains every letter of the English alphabet
at least once.

Input: "A quick brown fox jumps over the lazy dog" -> Output : Pangram
Input: "Hello World" -> Output : Not Pangram
*/

public class Pangram {
	
	public static void main(String[] args) {
		
		String str = "A Quick Brown Fox Jumps Over the Lazy Dog @123 ";
		
		System.out.println(isPanagram(str) ? "Panagram" : "Not Panagram");
	}
	
	public static boolean isPanagram(String str) {
		
		//Edge Case : remove all characters except a-z
		str = str.toLowerCase().replaceAll("^[a-z]","");
		
		for(char ch ='a' ; ch <= 'z' ;ch++) {
			
			if(str.indexOf(ch) == -1) {
				return false;
			}
		}
		
		return true;	
	}
}
