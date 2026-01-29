package Strings;
//Check Given String is Palindrome Or Not
public class Palindrome {
	public static void main(String[] args) {
		String str = " Nurses run ";
		
		//Convert to LowerCase and remove extra spaces
		str = str.toLowerCase().replaceAll("\\s","");
		
		StringBuilder reversed = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			char ch = str.charAt(i);
			reversed.append(ch);
		}
		
		
		System.out.println(str.equals(reversed.toString()) ? "Palindrome" : "Not Palindrome");
	}
}
