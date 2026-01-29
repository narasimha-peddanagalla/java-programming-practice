package NumberSystem;
import java.util.Scanner;

//Print the Fibonacci Series Upto the given Value
//Ex: Upto 100 - 0 1 1 2 3 5 8 13 21 34 55 89
public class Fibonacci2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upto value:");
		int n = sc.nextInt();
		
		int firstNum = 0, secNum = 1;
		
		while(firstNum <= n) {
			System.out.print(firstNum + " ");
			int nextNum = firstNum + secNum;
			firstNum = secNum;
			secNum = nextNum;
		}
	}
}
