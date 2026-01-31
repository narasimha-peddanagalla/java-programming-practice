package Arrays;
import java.util.Arrays;

/*Move all zeros to the end (Maintain order of non-zero elements)
 * Input:  [0, 1, 0, 3, 12] -> Output: [0, 0 ,1, 3, 12]
   Input:  [4, 0, 5, 0, 6] -> Output: [0, 0, 4, 5, 6]
 */

public class MoveZeroesToBeginning {
	public static void main(String[] args) {
		
		int[] arr = {4, 0, 5, 0, 6};
		
		int index = arr.length - 1;
		
		for(int i=arr.length-1;i>=0;i--) {
			
		//Move all Non-zeroes to End
			if(arr[i] != 0) {
				arr[index--] = arr[i];
			}
		}
		
		//Fill Remaining positions with 0
		while(index >= 0) {
			
			arr[index--] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
