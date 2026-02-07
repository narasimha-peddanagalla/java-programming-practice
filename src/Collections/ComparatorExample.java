package Collections;
import java.util.*;
/*
 * Problem - Sort Employees based on Name and Age
 * Using Comparator - Multiple Custom sorting orders defined using compare()
 */
class Emp{
	
	String name;
	int age;
	
	public Emp(String name,int age) {
		
		this.name = name;
		this.age = age;
	}
	
	@Override
		public String toString() {
			return name + " - " + age;
		}
}

public class ComparatorExample {
	public static void main(String[] args) {
		
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp("Charlie",25));
		list.add(new Emp("Alice",36));
		list.add(new Emp("Frank",30));
		list.add(new Emp("Bob",20));
		list.add(new Emp("Derry",23));
		list.add(new Emp("Bob",28));
		
		Collections.sort(list, new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				
				int nameCompare =  e1.name.compareTo(e2.name);
				
				//If names are not equal
				if(nameCompare != 0) {
					return nameCompare;
				}
				
				//If names are equal then compare age
				return e1.age - e2.age;
			}	
		});
		
		list.forEach(System.out::println);
	}
}
