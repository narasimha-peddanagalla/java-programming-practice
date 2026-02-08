package Streams.medium;
import java.util.*;
/*
Problem 10: Find all numbers divisible by both 3 and 5 using Streams.
Input: [10, 15, 30, 45, 22]
Output: [15, 30, 45]
*/
public class FindFactors {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 15, 30, 45, 22);
		
				
		List<Integer> result = list.stream()
								   .filter(n -> (n % 3 == 0) && (n % 5 == 0))
								   .toList();
		
		System.out.println(result);
	}
}
