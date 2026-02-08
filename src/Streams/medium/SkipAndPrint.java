package Streams.medium;
import java.util.*;
import java.util.stream.Collectors;
/*
Problem 7:Skip first 5 elements and print next 5 elements using Streams.
Input: [1,2,3,4,5,6,7,8,9,10,11,12]
Output: [6,7,8,9,10]
*/
public class SkipAndPrint {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		
		List<Integer> result = list.stream()
								   .skip(5)
								   .limit(5)
								   .collect(Collectors.toList());
				
	    System.out.println(result);
					
	}
}
