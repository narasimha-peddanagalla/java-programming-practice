package Streams.basic;
import java.util.*;
/*
Problem 2: Convert all strings in a list to uppercase using Streams.
Input: ["java", "spring", "sql"]
Output: ["JAVA", "SPRING", "SQL"]
*/

public class ConvertIntoUppercase {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "spring", "sql");
		
		list.stream()
			.map(n -> n.toUpperCase())
			.forEach(System.out::println);
	}
}
