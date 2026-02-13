package Arrays;
import java.util.Arrays;
/*
PROBLEM:Two Sum
Given an integer array nums and an integer target, return indices of the two numbers 
such that they add up to target. Assume exactly one solution exists and you cannot use 
the same element twice.
Example:nums = [2,7,11,15], target = 9 -> Output: [0,1]

BruteForce Approach:Time Complexity: O(n^2)
*/

public class TwoSum {
	
	public static int[] twoSum(int[] nums,int target) {
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j = i+1; j<nums.length;j++) {
				
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};	
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,11,15,7};
		
		System.out.println(Arrays.toString(twoSum(arr,9))); //[0,3]
	}
}
