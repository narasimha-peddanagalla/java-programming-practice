package Collections;

import java.util.HashMap;
import java.util.Map;

//Approach-2 : Find Duplicates Using Map 
public class FindDuplicates2 {
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,3,4,5,4,8,9,5};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		//Finding duplicates using Frequency
		System.out.print("Dulpicates:");
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.print(entry.getKey() + " ");
			}
			
		}
		
	}
	
}
