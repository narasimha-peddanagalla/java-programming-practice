package Streams.medium;
import java.util.*;
import java.util.stream.Collectors;
/*
Problem 6: Join a list of strings with commas using Streams.
Input: ["Java", "Spring", "SQL"]
Output:["Java,Spring,SQL"]
*/
public class StringJoining {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Spring", "SQL");
		
		String result = 	  list.stream()
							  .collect(Collectors.joining(",", "[", "]"));
		
		System.out.println(result);
	}
}
