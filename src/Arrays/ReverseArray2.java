package Arrays;
import java.util.Arrays;

/*Reverse An Array
  Approach-2 :Using Extra Array
*/

public class ReverseArray2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		int[] rev = new int[arr.length];
		
		int index=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			
			rev[index++] = arr[i];
			
		}
		
		System.out.println(Arrays.toString(rev));
	}
}
