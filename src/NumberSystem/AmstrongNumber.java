package NumberSystem;
import java.util.Scanner;
/*Amstrong - count of digits of a Number is raised to its power of each digit
  And It's whole Sum = Original Number
(1-1000) 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
*/ 
public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		//Edge Case
		if(num<0) {
			System.out.println("Invalid Input");
			return;
		}
		
		int orig = num; //store original
		
		//Count the digits
		int c = countDigits(num);
		int res = 0;
		
		while(num != 0) {
			int dig = num % 10;
			//Math.pow()
			//res = res + (int)Math.pow(dig, c);
			
			//Manual Power
			res = res + power(dig,c);
	
			num = num/10;
		}
		//Check Amstrong or Not
		System.out.println(orig == res ? "Amstrong":"Not Amstrong");
		
	}
	public static int countDigits(int num) {
		int c = 0;
		while(num != 0) {
			num = num/10;
			c++;
		}
		return c;
	}
	
	//Manual Power Method
	public static int power(int base,int exp) {
		int result = 1;
		for(int i=1;i<=exp;i++) {
			result = result * base;
		}
		return result;
	}
	
}
