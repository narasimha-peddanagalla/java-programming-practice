package Strings;
//Input:aaabccabc -> Output: a3b1c2a1b1c1

public class StringCompression {
	public static void main(String[] args) {
		
		String str = "aaabccabc";
		
		StringBuilder result = new StringBuilder();
		
		int count = 1;
		
		for(int i=1;i<=str.length();i++) {
	
			if(i < str.length() && str.charAt(i) == str.charAt(i-1)) {
				count++;
			}
			else {
				result.append(str.charAt(i-1));
				result.append(count);
				
				//Update Counter
				count = 1;
			}
		}
		System.out.println(result.toString());
	}
}
