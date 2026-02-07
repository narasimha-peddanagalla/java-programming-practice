package Collections;
import java.util.*;
/*
 Find Common Name and Age in Two LinkedLists
 */

class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CommonPersonInLinkedList {
	public static void main(String[] args) {
		
		//LinkedList - 1
		LinkedList<Person> list1 = new LinkedList<>();
		
		list1.add(new Person("Surya",25));
		list1.add(new Person("Surya",25));
		list1.add(new Person("Arjun",36));
		list1.add(new Person("Arun",20));
		
		//LinkedList - 2
		LinkedList<Person> list2 = new LinkedList<>();
		
		list2.add(new Person("Arun",20));
		list2.add(new Person("Arun",20));
		list2.add(new Person("Varun",25));
		
		System.out.println("===== Using Traditional Approach ======");
		
		//Logic to Find Common - O(n)^2
		for(Person p1 : list1) {

			for(Person p2 :list2) {
				
				if(p1.name.equals(p2.name) && p1.age == p2.age) {
					System.out.println(p1.name +" " + p1.age);
				} // -> Arun 20
			}
		}
		
		//Optimize the Logic - O(n) -> Using HashSet
		
		System.out.println("===== Using HashSet ======");
		
		HashSet<String> set = new HashSet<>();
		
		for(Person p : list1) {
			
			set.add(p.name +"-"+ p.age);
		}
		
		System.out.println(set); //[Surya-25, Arun-20, Arjun-36]
		
		//Now Check list2 set with list2 and Print common
		for(Person p : list2) {
			
			String key = p.name + "-" +p.age;
			
			if(set.contains(key)) {
				System.out.println(p.name + "-" + p.age);
			}
		}
		
		//If Duplicate Records Matters and also need to Print Common duplicates
		//Using HashMap
		
		System.out.println("===== Using HashMap ======");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(Person p : list1) {
			String key = p.name + "-" +p.age;
			
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		System.out.println(map); //{Surya-25=1, Arun-20=1, Arjun-36=1}
		
		for(Person p : list2) {
			
			String key = p.name + "-" +p.age;
			
			if(map.containsKey(key) && map.get(key) > 0) {
				
				System.out.println(p.name + "-" + p.age);
				
				//Decrease count
				map.put(key, map.get(key) - 1);
			}
		}
	}
}
