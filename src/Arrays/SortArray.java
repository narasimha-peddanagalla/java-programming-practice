package Arrays;
import java.util.Arrays;

//Sort the Array - Bubble Sort
public class SortArray {
	public static void main(String[] args) {
		
		int[] arr = {5,3,2,1,4};
		
		for(int i=0;i<arr.length;i++) {
			
			boolean swapped = false;
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
					
					swapped = true;
				}
			}
			
// If no swaps, Array is Sorted Already No need to run upto O(n)^2
			if(!swapped) break;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
/*
 Time Complexity: Bubble Sort
 Best Case: Sorted Array - O(n)
 Worst Case: Unsorted Array - O(n)^2
 Average Case : O(n)^2
 */

