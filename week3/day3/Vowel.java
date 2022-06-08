package week3.day3;
 	

public class Vowel {
public static void main(String[] args) {
	String text="Amazon has more than 17,865 employees in chennai";
	String replaceAll = text.replaceAll("\\D", "");
	System.out.println(replaceAll);
	
	String text1= "testleaf";
	char[] charArray = text.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if (text1.charAt(i)=='a'||text1.charAt(i)=='e'|| text1.charAt(i) =='i'||text1.charAt(i)=='o'||text1.charAt(i)=='u') {
			System.out.println(text1.charAt(i));	
		}
	}
}
}

