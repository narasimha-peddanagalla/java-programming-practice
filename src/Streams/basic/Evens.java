package Streams.basic;
import java.util.*;

/*
Problem 1: Program to filter and print all even numbers.
Input: [10, 15, 20, 25, 30, 35]
Output: 10 20 30
*/
public class Evens {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,20,25,30,35);
		
		list.stream()   				 		//Stream creation
			.filter(n -> n % 2 == 0) 	    //Intermediate Operation
			.forEach(System.out::println);  //Terminal Operation
		
	}
}
