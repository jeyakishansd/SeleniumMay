package week4.day5;

public class Student {
	//When using static no object creation is needed 
	//variable can be called in input directly
static String  name="jeykee";
static {
	System.out.println("static");
}
Student(){
	System.out.println("Default constructor");
}
public static void studentDetails() {
	System.out.println("Amsath");

}

public static void main(String[] args) {
	//Student std= new Student();
	//System.out.println(std.name);
	System.out.println(name );
	studentDetails();
}
}
