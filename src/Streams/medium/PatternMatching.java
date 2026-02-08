package Streams.medium;
import java.util.*;
/*
Problem 4: Find all elements starting with letter 'A' using Streams.
Input: ["Apple", "Banana", "Avocado", "Mango"]
Output: ["Apple", "Avocado"]
*/
public class PatternMatching {
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple", "Banana", "avocado", "Mango");
		
		List<String> result = fruits.stream()
									.filter(str -> str.toLowerCase().startsWith("a"))
									.toList();
		
		System.out.println(result);
		
	}
}
