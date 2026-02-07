package Streams;
import java.util.*;
import java.util.stream.Collectors;
/*
Problem 5: Remove duplicate elements from a list using Streams.
Input: [10, 20, 20, 30, 40, 40]
Output: [10, 20, 30, 40]
*/

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 20, 30, 40, 40);
		
		List<Integer> unique = list.stream()
								   .distinct()
								   .collect(Collectors.toList());
		
		System.out.println(unique);
	}
}
