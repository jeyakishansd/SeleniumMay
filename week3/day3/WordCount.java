package week3.day3;

public class WordCount {
	public static void main(String[] args) {
		
	String word="I like Chicken Biriyani";
	int count=0;
	String[] split = word.split(" ");
	for (int i = 0; i < split.length; i++) {
		//System.out.print(split[i]);
		count++;

}
	System.out.println(count);
	}
}