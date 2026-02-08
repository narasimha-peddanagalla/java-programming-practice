package Streams.realtime;
import java.util.*;
import java.util.stream.Collectors;
import Streams.realtime.Emp;
/*
Problem 3: Count employees in each department using Streams.
Input: [Emp("Ram","IT"), Emp("Sam","HR"), Emp("John","IT")]
Output: {IT=2, HR=1}
*/
public class CountEmployees {
	public static void main(String[] args) {
		
		//Emp Class is Imported instead of Creating Again
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp("Ram","IT"));
		list.add(new Emp("Sam","HR"));
		list.add(new Emp("John","IT"));
		
		Map<String, Long> map =
				
					list.stream()
						.collect(Collectors.groupingBy(
								
							e -> e.dept,
							Collectors.mapping(e -> e.dept,Collectors.counting())
							
							));
		
		System.out.println(map);  			
	}
}
