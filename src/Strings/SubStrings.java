package Strings;
/*
Print all substrings of a given string.
Input:String str = "abc";
Output:
a
ab
abc
b
bc
c
*/
public class SubStrings {
	public static void main(String[] args) {
		
		String str = "abc";
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<=str.length();j++) {
				
				System.out.println(str.substring(i,j));
			}
		}
	}
}


