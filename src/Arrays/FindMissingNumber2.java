package Arrays;
import java.util.HashSet;
/*Find Missing Number
  What if it contains dulpicates
*/
public class FindMissingNumber2 {
	public static void main(String[] args) {
		
		int[] arr = {2,2,3,3,4,5};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int ele : arr) {
			set.add(ele);
		}
		
		int n = set.size() + 1;
		
		int expectedSum = n*(n+1)/2;
		
		int actualSum = 0;
		
		for(int num : set) {
			actualSum += num;
		}
		
		int missingNum = expectedSum - actualSum;
		
		System.out.println("Missing Number:"+missingNum);
	}
}
