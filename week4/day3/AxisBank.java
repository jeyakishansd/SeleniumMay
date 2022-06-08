package week4.day3;

public class AxisBank extends BankInfo {
	public void deposits() {
	System.out.println("50000 cash deposited");
}
	public static void main(String[] args) {
		AxisBank axis= new AxisBank();
		axis.deposits();
		axis.fixed();
		axis.savings();
	}
}
