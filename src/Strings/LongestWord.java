package Strings;
/*Find the longest word in a sentence
 * Input:  "Java is very powerful language"
 * Output: powerful
 */
public class LongestWord {
	public static void main(String[] args) {
		
		String str = " Java is very powerful language ";
		
		str = str.trim();
	
		String[] words = str.split("\\s+");
		
		String longest = "";
		
		for(String word : words) {
			
			if((word.length()) > longest.length()) {
				longest = word;
			}
		}
		System.out.println("Longest Word:"+longest);
		
	}
	
}
