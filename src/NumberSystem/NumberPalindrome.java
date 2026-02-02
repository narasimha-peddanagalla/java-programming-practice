package NumberSystem;
import java.util.Scanner;

//Check the Given Number is Palindrome or Not
public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		//Edge Case
		if(num<0) {
			System.out.println("Not Palindrome");
			return;
		}
		
		int orig = num;
		
		int rev = 0;
		while(num != 0) {
			int dig = num % 10;
			rev = (rev * 10) + dig;
			num = num/10;
		}
		System.out.println(orig == rev ? "Palindrome":"Not Palindrome");
	}

}
