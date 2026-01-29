package NumberSystem;
import java.util.Scanner;
//Strong Number:Factorial Sum of the Digits = Original Number
//Ex:145 -> 1!+4!+5! = 145
//(1-100) -> 1,2,145
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		//Edge Case
		if(num < 0) {
			System.out.println("Invalid Input");
			return;
		}
		
		int orig = num;
		int res = 0;
		
		while(num != 0) {
			int dig = num % 10;
			res = res + factorial(dig);
			num = num/10;
		}
		
		System.out.println(orig == res ? "Strong Number":"Not Strong");
	}
	public static int factorial(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
	}
}
