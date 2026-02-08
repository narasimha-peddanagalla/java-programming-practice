package Streams.medium;
import java.util.*;
/*
Problem 8: Count how many numbers are even using Streams.
Input: [10, 15, 20, 25, 30]
Output: 3
*/
public class CountEvens {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);
		
		long count = nums.stream()
						 .filter(n -> n % 2 == 0)
						 .count();
		
		System.out.println("Even Count:"+count);
		
	}
}
