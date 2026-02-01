package Arrays;
import java.util.Arrays;

//Merge two Arrays into the Single Array
public class MergeArrays {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8};
		
		int[] merged = new int[arr1.length + arr2.length];
		
		//Copy arr1 and arr2 into the merged
		
		for(int i=0;i<arr1.length;i++) {
			
			merged[i] = arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			
			merged[arr1.length+i] = arr2[i];
		}
		
		System.out.println(Arrays.toString(merged));
	}
}
