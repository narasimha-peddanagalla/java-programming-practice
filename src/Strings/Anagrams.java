package Strings;
import java.util.Arrays;

/*Check if two strings are anagrams
 Input: "listen", "silent"
 Output: Anagram
*/
public class Anagrams {
	public static void main(String[] args) {
		String str1 = "Listen ";
		String str2 = " Silent";
		
		if(areAnagrams(str1,str2)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
	
	//Methos to Check Anagram
	public static boolean areAnagrams(String s1,String s2) {
		
		//Edge Case - case-insensitive & ignore spaces
		s1 = s1.toLowerCase().replaceAll("\\s+", "");
		s2 = s2.toLowerCase().replaceAll("\\s+","");
		
		//1.Check Lengths
		if(s1.length() != s2.length()) {
			return false;
		}
		
		//2.Convert into Character Arrays
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		//3.Sort the Arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//4.Compare to Arrays & Return
		return Arrays.equals(ch1,ch2);
	}
}
