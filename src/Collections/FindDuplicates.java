package Collections;
import java.util.*;

//Find Duplicates Using Set
public class FindDuplicates {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,4,5};
		
		HashSet<Integer> set = new HashSet<>();
		
		ArrayList<Integer> dupl = new ArrayList<>();
		
		for(int ele : nums) {
			
			if(!set.add(ele)) {
				
				dupl.add(ele);
			}
		} 
		
		//Duplicates
		System.out.println("Duplicates:"+dupl); //Duplicates:[1, 2]
		
		//Unique
		System.out.println(set); //[1, 2, 3, 4, 5]
		
		
/*Logic
* set.add() - returns boolean
* if added - true, else false
* So, Set adds only unique, duplicates won't -> returns false
* If false -> duplicate -> add into duplicate list
*/	
	}

}
