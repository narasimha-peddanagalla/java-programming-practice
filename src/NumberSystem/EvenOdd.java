package NumberSystem;
//Check Even or Odd
public class EvenOdd {
	public static void main(String[] args) {
		
		int num = 10;
		
		if (num <= 0) {
			System.out.println("Invalid Number");
		}
			
		else if(num % 2 == 0) {
				System.out.println("Even");
		}
		else {
				System.out.println("Odd");
		}
	}
}
