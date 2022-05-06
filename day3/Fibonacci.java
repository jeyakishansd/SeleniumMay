package week1.day3;

public class Fibonacci {
	public static void main(String[] args) {
		int range=8;
		int a=0;
		int b=1;
		int c;
        for(int i=1;i<=range;i++) {
        	c=a+b;
        	System.out.println(c);
        	a=b;
        	b=c;
        }
    	
    
	}
}
