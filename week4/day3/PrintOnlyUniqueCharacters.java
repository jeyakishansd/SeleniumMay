package week4.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {
	public static void main(String[] args) {
		String in = "babub";
		char[] charArray = in.toCharArray();
		Set<Character> str= new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			str.add(charArray[i]);
			if (str.contains(charArray[i])==str.contains(charArray[i])) {
				str.remove(charArray[i]);
			}
			else {
				str.add(charArray[i]);
			}
			System.out.println(charArray[i]);
		} 
	}
}
