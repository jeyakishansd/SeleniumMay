package week1.day3;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=11;
		int count=0;
		for (int a = 1; a <=  n; a++) {
			if (n%a==0) {
				count++;
				}
		}
	if (count==2) {
		System.out.println("Given number is prime ");
	}	
	else {
		System.out.println("Given number is not prime");
	}
		}

			
		}
		
		
		
