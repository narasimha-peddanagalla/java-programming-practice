package Streams.basic;
import java.util.*;
/*
Problem 11: Find the 2nd minimum number in a list.
Input: [5, 2, 8, 1, 3 , 1 , 2]
Output: 2
*/
public class SecondMinimum {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3 , 1 , 2);
		
		list.stream()
			.distinct()
			.sorted()
			.skip(1)
			.findFirst()
			.ifPresent(System.out::println); //2
			
			
	}
}
