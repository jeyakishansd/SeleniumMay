package week3.day3;

public class VowelCount {
	public static void main(String[] args) {
		String text = "testleaf";
		int count=0;
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
		if (charArray[i]=='e') {
			count++;
		}
		}
		System.out.println(count);	
	}
}
