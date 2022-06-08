package week3.day3;

public class StringAss {
	public static void main(String[] args) {
		String str="welcome";
		char[] charArray = str.toCharArray();
		
	for (char i = 0; i <charArray.length; i++) {
		if (i%2!=0) {
			charArray[i] =Character.toUpperCase(charArray[i]);
			}
		System.out.print(charArray[i]);
		
	
	}
	}
	}
