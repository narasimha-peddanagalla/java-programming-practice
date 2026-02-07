package Streams;
import java.util.*;
/*
Problem 12: Check if any number in a list is greater than 50 using Streams.
Input: [10, 25, 60, 30]
Output: true
*/
public class CheckGreater {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 25, 60, 30);
		
		boolean result = list.stream()
							 .anyMatch(n -> n > 50);
		
		System.out.println(result);
	}
}
