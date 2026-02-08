package Streams.medium;
import java.util.*;
import java.util.stream.Collectors;

/*
Problem 5: Convert a list into a Set using Streams.
Input: [10, 20, 20, 30, 40, 40]
Output: [10, 20, 30, 40]
*/
public class ListToSet {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 20, 30, 40, 40);
		
		Set<Integer> set = list.stream()
							   .collect(Collectors.toSet()); //toSet() removes duplicates
							   
		
		System.out.println(set);
	}
}
