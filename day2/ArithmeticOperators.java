package week1.day2;

public class ArithmeticOperators {
	 public  void add() {
	 int a =10;
	 int b=6;
	 int c=a+b;
	 System.out.println(c);	
	}
	 private void sub() {
	int a=12;
	int b=5;
	int c=a-b;
	System.out.println(c);

	}
	 public static void main(String[] args) {
		ArithmeticOperators ao = new ArithmeticOperators();
		ao.add();
		ao.sub();
	}
}
