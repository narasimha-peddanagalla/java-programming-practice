package Streams;
import java.util.*;
/*
Problem 4: Find the first element in a list using Streams.
Input: [10, 20, 30, 40]
Output: 10
*/

public class FindFirst {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		
		//Approach-1
		list.stream()
			.findFirst()
			.ifPresent(System.out::println);
		
		
		//Approach-2
		list.stream()
			.limit(1)
			.forEach(System.out::println);
							
	}
}
