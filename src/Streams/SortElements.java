package Streams;
import java.util.*;
import java.util.stream.Collectors;
/*
Problem 6: Sort a list of integers in ascending order using Streams.
Input: [5, 2, 8, 1, 3]
Output: [1, 2, 3, 5, 8]
*/
public class SortElements {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);
		
		List<Integer> sorted = list.stream()
								   .sorted()
								   .toList(); //java 16+
		
		System.out.println(sorted);
	}

}
