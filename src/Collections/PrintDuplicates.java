package Collections;
import java.util.*;

//Print the Duplicates in the List

public class PrintDuplicates {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,4,5,5);
		
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int num : list) {
			
			if( !set.add(num)) {
				
				System.out.print(num + " ");  //1 2 3 4 5 
			}
		}
	}
}
