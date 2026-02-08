package Streams.basic;
import java.util.*;
/*
Problem 3: Count the number of elements in a list using Streams.
Input: [10, 20, 30, 40, 50]
Output: 5
*/

public class CountElements {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		long count = list.stream()
						 .count();
		
		System.out.println("Count:"+count);
	}
}
