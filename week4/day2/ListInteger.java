package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInteger {
public static void main(String[] args) {
	List<Integer> var = new ArrayList<Integer>();
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
	int size = var.size();
	
	for (int i =0; i <size; i++) {
		Integer integer = var.get(i);
		System.out.print(integer);
	}
	Collections.sort(var);
	System.out.println(var);
	
	Collections.reverse(var);
	System.out.println(var);
	
}
}
