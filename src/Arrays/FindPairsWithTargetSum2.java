package Arrays;
import java.util.*;
/*
PROBLEM: Return All Pairs with Target Sum
Given an integer array nums and an integer target, return all pairs of numbers 
(or indices) whose sum equals target. A number cannot be used more than once in the same pair.

Input: nums = [2,7,11,15,3,6,4,5] ,target = 9
Output (pairs): [2,7] ,[3,6], [4,5]

Optimized Approach - Using HashSet - O(n) 
 */

public class FindPairsWithTargetSum2 {
	
	public static List<int[]> findPairs(int[] arr,int target){
		
		Set<Integer> seen = new HashSet<>();
		List<int[]> pairs = new ArrayList<>();
		
		for(int num : arr) {
			
			int complement = target - num;
			
			if(seen.contains(complement)) {
				pairs.add(new int[] {complement,num});
			}
			
			seen.add(num);
		}
		return pairs;
	}

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15,3,6,4,5};
		int target = 9;
		
		List<int[]> result = findPairs(nums,target);
		
		//Edge Case
		if(result.isEmpty()) {
			System.out.println("No Pairs Found");
			return;
		}
		
		for(int[] pair : result) {
			System.out.println(Arrays.toString(pair));
		}
	}
}
