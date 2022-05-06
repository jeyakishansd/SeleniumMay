package week1.day3;

public class PrimeBolean {
public static void main(String[] args) {
	int input=14;
	
	boolean flag=false;
	for (int i = 2; i <input -1; i++) {
		if (input%i==0) {
			flag=true;
			System.out.println("Not Prime");
		}
		
	}
	if (!flag) {
		System.out.println("Given number is prime");
	}
	else {
		System.out.println("Given number is prime");
	}
}

}
