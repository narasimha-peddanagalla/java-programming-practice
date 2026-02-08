package Streams.basic;
import java.util.*;
/*
Problem 7: Sort a list of integers in descending order using Streams.
Input: [5, 2, 8, 1, 3]
Output: [8, 5, 3, 2, 1]
*/

public class SortInDescending {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);
		
		List<Integer> result = list.stream()
								.sorted(Comparator.reverseOrder())
								.toList();
		
		System.out.println(result);
		
	}
}
