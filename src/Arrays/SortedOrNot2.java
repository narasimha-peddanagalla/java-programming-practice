package Arrays;
/*
Check if an array is sorted in Ascending or Descending order
Input:  [1, 2, 3, 4] -> Output: Ascending Order
Input:  [9, 7, 5, 1] -> Output: Descending Order
Input:  [1, 3, 2, 4] -> Output: Not Sorted
*/
public class SortedOrNot2 {
	public static void main(String[] args) {
		
		int[] arr = {9};
		
		//Edge case
		
		
		boolean isAsc = true;
		boolean isDesc = true;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] < arr[i-1]) {
				isAsc = false;
			}
			if(arr[i] > arr[i-1]) {
				isDesc = false;
			}
		}
		
		if(isAsc) {
			System.out.println("In Ascending Order");
		}
		else if(isDesc) {
			System.out.println("In Descending Order");
		}
		else {
			System.out.println("Not Sorted");
		}
	}

}
