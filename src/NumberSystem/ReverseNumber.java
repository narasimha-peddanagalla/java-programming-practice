package NumberSystem;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int num = -123, orig = num;
		
		//Edge Case - handling -ve Numbers to reverse
		int sign = (num<0) ? -1 : 1;
		num = Math.abs(num);
		
		int rev=0;
		
		while(num != 0) {
			int dig = num % 10;
			rev = (rev*10) + dig;
			num = num/10;
		}
		//Sign
		rev = rev * sign;
		System.out.println("Reversed:"+rev);
	}
}
