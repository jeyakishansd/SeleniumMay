package week3.day3;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1="Stops";
	String text2="Potss";

	int length = text1.length();
	int length2 = text2.length();
	
	if (length==length2) {
		System.out.println("It's Anagram");
	}
	String upperCase = text1.toUpperCase();
	System.out.println(upperCase);
	
	String upperCase1 = text2.toUpperCase();
	System.out.println(upperCase1);
	
	String lowerCase = text1.toLowerCase();
	System.out.println(lowerCase);
	
	String lowerCase1= text2.toLowerCase();
	System.out.println(lowerCase1);
	
	char[] tochar1 = lowerCase.toCharArray();
	System.out.println(tochar1);
	char[] tochar2 = lowerCase1.toCharArray();
	System.out.println(tochar2);
	
	Arrays.sort(tochar1);
	System.out.println(tochar1);
	Arrays.sort(tochar2);
	System.out.println(tochar2);
	
	boolean equals = Arrays.equals(tochar1, tochar2);	
	if (equals==true) {
		System.out.println("Both arrays has same value");
	}
	else{
		System.out.println("Both arrays is not same");
		}
		
	}
}

