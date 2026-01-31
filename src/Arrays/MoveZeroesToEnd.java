package Arrays;
import java.util.Arrays;

/*Move all zeros to the end (Maintain order of non-zero elements)
 * Input:  [0, 1, 0, 3, 12] -> Output: [1, 3, 12, 0, 0]
   Input:  [4, 0, 5, 0, 6] -> Output: [4, 5, 6, 0, 0]
 */

public class MoveZeroesToEnd {
	public static void main(String[] args) {
		
		int[] arr = {4, 0, 5, 0, 6};
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			
			//Move All Non-zeroes to beginning
			if(arr[i] != 0) {
				
				arr[index++] = arr[i];
			}
		}	
			
		//Fill zeroes in remaining positions
		while(index<arr.length) {
				
			arr[index++] = 0;
				
		}	
		
		System.out.println(Arrays.toString(arr));
	}
}
