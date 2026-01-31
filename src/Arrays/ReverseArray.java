package Arrays;
import java.util.Arrays;

/*Reverse an Array (Two Pointer Technique)
   Input:  [10, 20, 30, 40, 50]
   Output: [50, 40, 30, 20, 10]
 */

public class ReverseArray {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
