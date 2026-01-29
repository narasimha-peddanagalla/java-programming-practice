package Strings;
/*Given a string, check whether it contains only numeric digits.
  Input:  "12345"   → true
  Input:  "12a45"   → false
  Input:  " 123 "   → false
 */
public class DigitCheck {
	public static void main(String[] args) {
		String str = " 12345 ";
		
		//Edge Case - Empty String
		if(str == null || str.isEmpty()) {
			System.out.println(false);
			return;
		}
		
		boolean isDigits = true;
		for(char ch : str.toCharArray()) {
			
			if(!Character.isDigit(ch)) {
				isDigits = false;
				break;
			}
		}
		
		System.out.println(isDigits ? true : false);
	}
}
