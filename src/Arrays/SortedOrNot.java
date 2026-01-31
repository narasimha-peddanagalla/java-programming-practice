package Arrays;
/*Check if an Array is Sorted (Ascending Order)
 Input:  [1, 3, 5, 7] -> Output: Sorted
 Input:  [1, 5, 3, 7] -> Output: Not Sorted
 */
public class SortedOrNot {
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 2, 4};
		
		//Edge Case
		if(arr.length == 0) {
			System.out.println("Empty Array");
			return;
		}
		
		boolean isSorted = true;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] < arr[i-1]) {
				isSorted = false;
				break;
			}
		}
		
		System.out.println(isSorted ? "Sorted" : "Not Sorted");
	}
}
