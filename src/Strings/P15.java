package Strings;

//String Compression
//Input : "aaabbcab" -> a3b2c1a1b1
public class P15 {
	public static void main(String[] args) {
		
		String str = "aaabbcab";

		//Using String Builder
		
		StringBuilder result = new StringBuilder();
		int count = 1;
		
		for(int i = 1; i <= str.length(); i++) {
			
			//Logic
			if(i < str.length() && str.charAt(i) == str.charAt(i-1)) {
				//if preceeding chars are equal increase count
				count++;
			}
			
			else {
				
				result.append(str.charAt(i-1));
				result.append(count);
				
				//set count to 1
				count = 1;
			}
			
		}
		
		System.out.println("Result:" + result);
	}

}
