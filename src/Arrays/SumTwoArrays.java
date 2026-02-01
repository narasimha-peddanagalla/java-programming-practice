package Arrays;
import java.util.Arrays;

//Sum two Arrays of Same Size
public class SumTwoArrays {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		//Edge Case
		if(arr1.length != arr2.length) {
			System.out.println("Both Arrays should have same size");
			return;
		}
		
		int[] sum = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++){
			
			sum[i] = arr1[i] + arr2[i];
		}
		
		System.out.println(Arrays.toString(sum));
	}
}
