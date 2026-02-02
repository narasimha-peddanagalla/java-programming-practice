package Arrays;

/* Find Second Largest Number in the Array
 * Input:[10,20,30,40,50]  -> Output: 40
 */

public class SecondLargest {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		if(arr.length<2) {
			System.out.println("No Second Largest Number");
			return;
		}
		
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int num : arr) {
			
			if(num > largest) {
				second = largest;
				largest = num;
			}
			else if(num > second && num != largest) {
				second = num;
			}
		}
		System.out.println(largest);
		
		if (second == Integer.MIN_VALUE) {
		    System.out.println("No Second Largest Number");
		} else {
		    System.out.println("Second:" + second);
		}
	}
}
