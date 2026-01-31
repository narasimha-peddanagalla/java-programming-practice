package Strings;
/*Given a string, check whether it contains only numeric digits.
Input:  "+12345"   → true
Input:  "12345"   → true
Input:  "-12a45"   → false
Input:  " 123 "   → false
*/

//Handle Signs too
public class DigitCheck2 {
	public static void main(String[] args) {
		
		String str = "+123 ";
		
		//Edge Case
		str = str.toLowerCase().replaceAll("\\s+", "");
		
		int start = 0;
		//Check Signs
		if(str.charAt(0) == '+' || str.charAt(0) == '-') {
			if(str.length() == 1) {
				System.out.println(false);
				return;
			}
			start = 1;
		}
		
		for(int i=start;i<str.length();i++) {
			
			if(! Character.isDigit(str.charAt(i))) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
}
