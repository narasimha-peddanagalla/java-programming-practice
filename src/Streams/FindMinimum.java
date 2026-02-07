package Streams;
import java.util.*;
/*
Problem 10: Find the minimum number in a list using Streams.
Input: [5, 2, 8, 1, 3]
Output: 1
*/
public class FindMinimum {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);
		
		//Approach-1
		int min = list.stream()
					  .reduce(Integer.MAX_VALUE,(a,b) -> a < b ? a : b);
		
		System.out.println("Minimum:"+min);
		
		
		//Approach-2 
		list.stream()
			.min(Integer::compare)
			.ifPresent(System.out::println);
	}
}
