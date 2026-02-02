package Strings;
/*Remove duplicate characters from a string
Input:  "programming"
Output: "progamin"
*/

//Traditional Approach - With StringBuilder
public class RemoveDuplicates2 {
	public static void main(String[] args) {
		String str = "programming";
		
		StringBuilder unique = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			
			if(unique.indexOf(String.valueOf(ch)) == -1) {
				unique.append(ch);
			}
		}
		
		System.out.println(unique.toString()); //progamin
	}

}

//indexOf()-returns index postion of first occurence of the character if present else -1
