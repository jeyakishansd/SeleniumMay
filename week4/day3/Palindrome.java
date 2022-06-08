package week4.day3;

public class Palindrome {
	public static void main(String[] args) {
	String pal= "madam";
	String reverse="";
	for (int i =pal.length()-1; i >=0; i--) {
		reverse=reverse+pal.charAt(i);
	}
	System.out.println(reverse);
		if (pal.equals(reverse)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
	}	
}