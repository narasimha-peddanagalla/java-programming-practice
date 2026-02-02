package Collections;

import java.util.*;

//Remove Duplicates from the ArrayList - Preserve Insertion Order
public class RemoveDuplicates {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);list.add(3);list.add(4);
		list.add(1);list.add(2);list.add(3);list.add(4);
		
		System.out.println(list);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		
		System.out.println(set); //[1, 2, 3, 4]
		
		//Clear ArrayList and Store Unique Elements
		list.clear();
		list.addAll(set);
		
		System.out.println(list);
		
		
	}

}
/*Logic
 LinkedHasheSet Poperty : Uniqueness + Order Of Insertion 
 */
