package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintSet {
	public static void main(String[] args) {
		Set<Integer> var= new TreeSet<Integer>();
		List<Integer> name = new ArrayList<Integer>(var);
		var.add(0);
		var.add(1);
		var.add(2);
		var.add(3);
		var.add(4);
		var.add(5);
		var.add(6);
		var.add(99);
		var.add(8);
		var.add(9);
		var.add(10);
		System.out.println(var);
		
		//Set<Integer> var= new LinkedHashSet<Integer>();
		//[0, 1, 2, 3, 4, 5, 6, 99, 8, 9, 10]
		
		//Set<Integer> var= new HashSet<Integer>();
		//[0, 1, 2, 3, 99, 4, 5, 6, 8, 9, 10]
		
		//Set<Integer> var= new TreeSet<Integer>();
		//[0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 99]



	}

}
