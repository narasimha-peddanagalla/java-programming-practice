package NumberSystem;

import java.util.Scanner;

//Get the Fibonacci Series Upto a given Range
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Series:");
		int n = sc.nextInt();
		
		int firstNum = 0, secNum = 1;
		
		for(int i=1;i<=n;i++) {
			System.out.print(firstNum + " ");
			int nextNum = firstNum + secNum;
			firstNum = secNum;
			secNum = nextNum;
		}
	}
}
