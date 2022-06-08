package week3.day3;

public class StringBuff {
public static void main(String[] args) {
	StringBuffer buffer= new StringBuffer("Madhu");
	buffer.append("sudhanan");
	System.out.println(buffer);
	
	StringBuffer rev= new StringBuffer("Amsath");
	rev.reverse();
	System.out.println(rev);
}
}
