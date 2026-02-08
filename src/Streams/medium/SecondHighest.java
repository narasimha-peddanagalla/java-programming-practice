package Streams.medium;
import java.util.*;
/*
Problem 9: Find the second highest number in a list using Streams.
Input: [10, 20, 40, 30, 50]
Output: 40
*/
public class SecondHighest {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 40, 30, 50);
		
					list.stream()
						.distinct()
						.sorted(Comparator.reverseOrder())
						.skip(1)
						.findFirst()
						.ifPresent(System.out::println);
		
	}
}
