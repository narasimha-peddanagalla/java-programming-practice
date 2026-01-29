package NumberSystem;

import java.util.Scanner;

//Get the Factorial of a given Number
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+n + " is : "+fact);
		
	}

}
