package Arrays;
/*
 Find the Missing Number in an Array (1 to N)
 Input:  [1, 2, 4, 5] -> Output: 3
 */
public class FindMissingNumber {
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4,4,5};
		
		int n = arr.length + 1;
		
		int expectedSum = n*(n+1)/2;
		
		int actualSum = 0;
		
		for(int num : arr) {
			actualSum += num;
		}
		
		int missingNum = expectedSum - actualSum;
		
		System.out.println("Missing Number:"+missingNum);
	}
}

//Core Mathematical Logic:Sum of Numbers from 1 to N -> n(n+1)/2
