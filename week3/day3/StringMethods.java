package week3.day3;

public class StringMethods {
	public static void main(String[] args) {
		
	
	String name1= "JeyaKishan";
	String name2= "S@ 3699D";
	String lowerCase = name1.toLowerCase();
	System.out.println(lowerCase);
	
	String upperCase = name1.toUpperCase();
	System.out.println(upperCase);
	
	String concat = name1.concat(" ").concat(name2);
	System.out.println(concat);
	
	String replace = name1.replace("a", "e");
	System.out.println(replace);
	
	String replaceAll = name2.replaceAll("\\d", "");
	System.out.println(replaceAll);
	
	String replaceAll2 = name2.replaceAll("\\D", "");
	System.out.println(replaceAll2);
	
	String replaceAll3 = name2.replaceAll("\\w", "");
	System.out.println(replaceAll3);
	
	String replaceAll4 = name2.replaceAll("\\s+", "Me");
	System.out.println(replaceAll4);
	
	String substring = name1.substring(3);
	System.out.println(substring);
	
	String substring2 = name1.substring(2, 6);
	System.out.println(substring2);
	
	String sentence = "Madhusudhanan is from north ";
	String[] split = sentence.split(" ");
	 
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	String[] split2 = sentence.split("n");
	
	for (int i = 0; i < split2.length; i++) {
		System.out.println(split2[i]);
	}
	}
}
