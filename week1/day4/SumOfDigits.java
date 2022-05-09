package week1.day4;

public class SumOfDigits {
	public static void main(String[] args) {
		int input=654;
		int num=0;
		int sum;
		while (input>0) {
			sum=input%10;
			num=num+sum;
			input=input/10;
		}
		System.out.println(num);
		
		}
}
