package Streams.medium;
import java.util.*;
import java.util.stream.Collectors;
/*
Problem 1: Find all strings whose length is greater than 5 using Streams.
Input: ["Java", "SpringBoot", "SQL", "Microservices"]
Output: ["SpringBoot", "Microservices"]
*/

public class FindStrings {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");
		
		List<String> result = list.stream()
								  .filter(str -> str.length() > 5)
								  .toList();
				                   
		System.out.println(result);
			
	}
}
