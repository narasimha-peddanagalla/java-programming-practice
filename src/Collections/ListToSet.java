package Collections;
import java.util.*;

//Convert List to Set

public class ListToSet {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,10,50,20,20,30,40);
		
		Set<Integer> set = new LinkedHashSet<>(list);
		
		System.out.println(set);
	}
}
