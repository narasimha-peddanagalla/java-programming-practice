package Streams.realtime;
import java.util.*;
import java.util.stream.Collectors;
/*
Problem 1: Convert a list of Employees into a Map (id -> name) using Streams.
Input: [Employee(1,"Ram"), Employee(2,"Sam")]
Output: {1=Ram, 2=Sam}
*/
class Employee{
	
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
}

public class ConvertEmployees {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Ram"));
		list.add(new Employee(2,"Sam"));
		
		
		Map<Integer,String> map = list.stream()
									  .collect(Collectors.toMap(
											  			e -> e.id,
											  			e -> e.name
											  ));
			
		System.out.println(map);

	}
}
