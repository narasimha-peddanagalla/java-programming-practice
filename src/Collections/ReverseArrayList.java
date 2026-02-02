package Collections;

import java.util.*;

//Reverse the ArrayList
public class ReverseArrayList {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10); list.add(20); list.add(30);
		list.add(40);list.add(50);
		
		//Method-1:Using Collections Utility Class
		
//		Collections.reverse(list);
//		System.out.println(list);
		
		
		//Method-2:Traditional
		
		for(int i=0, j=list.size()-1; i<j; i++,j--) {
			
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j,temp);
		}
		
		System.out.println(list.toString());
	}
}
