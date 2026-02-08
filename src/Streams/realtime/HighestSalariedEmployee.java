package Streams.realtime;
import java.util.*;
/*
Problem 4: Find the highest salaried employee among employees using Streams.
Input: [Emp("Ram",30000), Emp("Sam",50000), Emp("John",40000)]
Output: Sam - 50000
*/
class Empl{
	
	String name;
	double salary;
	
	public Empl(String name, double sal) {
		this.name = name;
		this.salary = sal;
	}
}
public class HighestSalariedEmployee {
	public static void main(String[] args) {
		
		List<Empl> list = new ArrayList<>();
		
		list.add(new Empl("Ram",30000));
		list.add(new Empl("Sam",50000));
		list.add(new Empl("John",40000));
		
			
				list.stream()
					.max(Comparator.comparingDouble(e -> e.salary))
					.ifPresent(e -> 
						System.out.println(e.name + "-" + e.salary)
						);
	}
}
