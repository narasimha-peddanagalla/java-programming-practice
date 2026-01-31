package Strings;
//Check 2 Strings are Rotational or Not

public class Rotational {
	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "cdab";
		
		//Edge Case - Case Insensitive & Avoid spaces
		s1 = s1.toLowerCase().replaceAll("\\s+", "");
		s2 = s2.toLowerCase().replaceAll("\\s+", "");
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Rotational");
			return;
		}
		
		//Logic: If s2 is a rotation of s1, then s2 must be present in s1 + s1
		
		String temp = s1 + s1;
		
		if(temp.contains(s2)) {
			System.out.println("Rotational");
		}
		else {
			System.out.println("Not Rotational");
		}
	}
}
