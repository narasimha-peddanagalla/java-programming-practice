package Streams.realtime;
import java.util.*;
import java.util.stream.Collectors;
/*
Problem 2: Group employees by department using Streams.
Input: [Emp("Ram","IT"), Emp("Sam","HR"), Emp("John","IT")]
Output: {IT=[Ram, John], HR=[Sam]}
*/
class Emp{
	
	String name;
	String dept;
	
	public Emp(String name,String dept) {
		this.name = name;
		this.dept = dept;
	}
	
}

public class GroupingEmployees {
	public static void main(String[] args) {
		
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp("Ram","IT"));
		list.add(new Emp("Sam","HR"));
		list.add(new Emp("John","IT"));
		
		Map<String, List<String>> map = 
						
							list.stream()
								.collect(Collectors.groupingBy(
										e -> e.dept,
										Collectors.mapping(e -> e.name,Collectors.toList()) 			
										));
		
		System.out.println(map);
							  
	}
}
