package Arrays;
/*Find the Largest and Smallest Element in an Array (Single Loop)
   Input:  [4, 2, 9, 1, 7]
   Output: Largest = 9, Smallest = 1
 */

public class MaxMin {
	public static void main(String[] args) {
		
		int[] arr = {4, 2, 9, 1, 7};
		
		//Assume
		int max = arr[0];
		int min = arr[0];
		
		for(int num : arr) {
			
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		
		System.out.println("Largest:"+max);
		System.out.println("Smallest:"+min);
	}
}
