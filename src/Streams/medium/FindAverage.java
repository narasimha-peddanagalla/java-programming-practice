package Streams.medium;
import java.util.*;
/*
Problem 3: Find the average of numbers in a list using Streams.
Input: [10, 20, 30, 40]
Output: 25.0
*/
public class FindAverage {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		

			numbers.stream()
				   .mapToInt(Integer::intValue)
				   .average()
				   .ifPresent(System.out::println);	
						 
	}
}
