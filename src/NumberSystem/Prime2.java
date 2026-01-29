package NumberSystem;
import java.util.Scanner;

//Print Prime Numbers from 1 to N
public class Prime2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of Primes that you want::");
		int n = sc.nextInt();
		
		for(int num = 2; num <= n; num++) {
			
			//Assume the num is Prime
			boolean isPrime = true;
			
			for(int i = 2;i<=Math.sqrt(num);i++) {
				
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(num + " ");
			}
		}
		
	}

}
