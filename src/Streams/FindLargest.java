package Streams;
import java.util.*;
/*
Problem 8: Find the maximum number in a list using Streams.
Input: [5, 2, 8, 1, 3]
Output: 8
*/
public class FindLargest {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);
		
		int max = list.stream()
					  .reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
		
		System.out.println("Maximum:"+max);
		
		//Approach-2
		list.stream()
			.max(Integer::compare)
			.ifPresent(System.out::println);
	}
}
