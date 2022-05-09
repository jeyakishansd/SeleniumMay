package week1.day2;

public class Variables {
	public float add(float a,float  b) {
		float total =a+b;
		return total;
			}
	public void sub(float total, int b) {
		float c = total-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Variables v = new Variables();
		float total =v.add(12, 12);
		System.out.println(total);
		v.sub(total , 2);
	}
} 	
