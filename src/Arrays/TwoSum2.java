package Arrays;
import java.util.*;
/*
PROBLEM:Two Sum
Given an integer array nums and an integer target, return indices of the two numbers 
such that they add up to target. Assume exactly one solution exists and you cannot use 
the same element twice.
Example: nums = [2,7,11,15], target = 9 -> Output: [0,1]

HashMap Approach:Time Complexity: O(n)
*/

public class TwoSum2 {
	
	public static int[] twoSum(int[] arr, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++) {
			
			int complement = target - arr[i];
			
			if(map.containsKey(complement)) {
				
				return new int[] {map.get(complement),i};
			}
			
			map.put(arr[i], i);
		}
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums,target))); //[0,3]
	}
}
