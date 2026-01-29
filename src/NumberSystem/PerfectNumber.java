package NumberSystem;
import java.util.Scanner;

//Perfect Number: Sum of Factors = Original Number
//Ex: 6 -> 1,2,3 -> 1+2+3=6
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		if(num <= 1) {
			System.out.println("Not Perfect");
			return;
		}
		
		int sum = 0;
		
		for(int i=1;i<=num/2;i++) {
			
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(num == sum ? "Perfect":"Not Perfect" );
	}
}
