package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class ImplementationSet {
	public static void main(String[] args) {
		Set<String> name= new LinkedHashSet<String>();
		name.add("Amsath");
		name.add("Jey");
		name.add("Dinesh");
		name.add("Madhu");
		name.add("Mugil");
		System.out.println(name);
		
		//ASCii order
		//Set<String> name= new TreeSet<String>();
		//[Amsath, Dinesh, Jey, Madhu, Mugil]
		
		//Random order
		//Set<String> name= new HashSet<String>();
		//[Mugil, Dinesh, Madhu, Amsath, Jey]
		
		//Insertion order
		//Set<String> name= new java.util.LinkedHashSet<String>();
		//[Amsath, Jey, Dinesh, Madhu, Mugil]
	}
}
