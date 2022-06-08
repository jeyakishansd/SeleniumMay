package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassAssignment {
	public static void main(String[] args) {
		List<String> val= new ArrayList<String>();
		val.add("Aspire Systems");
		val.add("CTS");
		val.add("Wipro");
		val.add("HCL");
		System.out.println(val);
		
		Collections.sort(val);
		Collections.reverse(val);
		System.out.println(val);
		
	}

}
