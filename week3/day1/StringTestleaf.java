package week3.day1;

public class StringTestleaf {
public static void main(String[] args) {
	String name="testleaf";

	boolean equals = name.equals("testleaf");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = name.equalsIgnoreCase("TestLeaf");
	System.out.println(equalsIgnoreCase);
	
	int length = name.length();
	System.out.println(length);
	
	char charAt = name.charAt(0);
	System.out.println(charAt);
	
	char[] charArray = name.toCharArray();
	for (int i = charArray.length-1; i >=0; i--) {
		System.out.print(charArray[i]);
	}
	char charAt2 = name.charAt(2);
	System.out.println(charAt2);
	}
}
