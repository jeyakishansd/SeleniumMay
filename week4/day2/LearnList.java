package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> val= new ArrayList<String>();
		//allows duplicate
		//maintain insertion order
		val.add("Jeyakishan");
		val.add("Amsath");
		val.add("Madhu");
		val.add(2,"Manoj");
		val.add("Mugil");
		val.add("Dinesh");
		val.add("Amsath");
		val.add("Madhu");
		System.out.println(val);
		
		for (String string : val) {
			System.out.println(string);
		}
		
		int size = val.size();
		System.out.println(size);
		
		String string = val.get(4);
		System.out.println(string);
		
		boolean contains = val.contains("Amsath");
		System.out.println(contains);
		
		val.remove(2);
		System.out.println(val);
		
		String remove = val.remove(1);
		System.out.println(remove);
		
		val.removeAll(val);
		System.out.println(val);
		
		boolean empty = val.isEmpty();
		System.out.println(empty);
	}
}
