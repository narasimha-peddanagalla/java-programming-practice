package Strings;
/*Count vowels and consonants in a string
   Input:  "Interview"
   Output: Vowels = 4, Consonants = 5
 */

public class VowelConsonantCount {
	public static void main(String[] args) {
		
		String str = "Interview";
		
		//Edge Case - case-insensitive & ignore spaces
		str = str.toLowerCase().replaceAll("\\s+", "");
		
		int vowelCount = 0, consonantCount = 0;
		
		for(char ch : str.toCharArray()) {
			
			if(Character.isAlphabetic(ch)) {
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
			}
		}
		
		System.out.println("Vowels:"+vowelCount);
		System.out.println("Consonants:"+consonantCount);
		
	}
}
