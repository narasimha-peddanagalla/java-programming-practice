package Arrays;

/* Find Second Largest Number in the Array
 * Input:[10,20,30,40,50]  -> Output: 40
 */

public class SecondLargest {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
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
		System.out.println("Largest:"+largest);
		System.out.println("Second:"+second);
	}
}
