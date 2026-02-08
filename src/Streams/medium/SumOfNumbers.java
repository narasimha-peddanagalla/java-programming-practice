package Streams.medium;
import java.util.*;
/*
Problem 2: Find the sum of all numbers in a list using Streams.
Input: [10, 20, 30, 40]
Output: 100
*/
public class SumOfNumbers {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		
		int sum = numbers.stream()
						 .reduce(0, (a,b) -> a + b);
		
		System.out.println("Sum:"+sum);
		
		
		//Appoach-2
		int result = numbers.stream()
							.mapToInt(Integer::intValue)
							.sum();
		
		System.out.println("Result:"+result);
	}
}
