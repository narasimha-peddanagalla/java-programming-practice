package Streams.basic;
import java.util.*;
/*
Problem 9: Find the maximum number in a list using Streams.
Input: [2,2,8,9,3,1,9,7,8]
Output: 8
*/
public class SecondLargest {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,2,8,9,3,1,9,7,8);
		
			int secondMax = list.stream()
							 	.distinct()
							 	.sorted(Comparator.reverseOrder())
							 	.skip(1)
							 	.findFirst()
							 	.get();
			
			System.out.println("Second Largest:"+secondMax);
	}
}
