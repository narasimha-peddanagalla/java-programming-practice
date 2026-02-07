package Collections;
import java.util.*;
/*
 * Problem - Sort Employees based on Age
 * Using Comparable - Default sorting order defined using compareTo()
 */
class Employee implements Comparable<Employee>{
	
	String name;
	int age;
	
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Employee e) {
		return this.age - e.age;
	}
	
	
	@Override
	public String toString() {
		
		return name + " " + age;
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Surya",25));
		list.add(new Employee("Arjun",36));
		list.add(new Employee("Krishna",30));
		list.add(new Employee("Ajay",20));
		list.add(new Employee("Varun",23));
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
	}
}
