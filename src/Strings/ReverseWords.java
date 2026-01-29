package Strings;
//Reverse the Words in the Sentence
//ex:"Java is easy" -> "avaJ si ysae"
public class ReverseWords {
	public static void main(String[] args) {
		String str = "Java is easy";
		
		String[] words = str.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String word : words) {
			result.append(reverseWord(word)).append(" ");
		}
		
		System.out.println(result.toString().trim());
	}
	
	//Method to Reverse Word
	public static String reverseWord(String str) {
		
		StringBuilder rev = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}
}
