package week1.day4;

public class AccessModifier {
	private void amsath() {
		System.out.println("Biriyani");

	}
	public void Mugil() {
		System.out.println("The 100");
	}
	void madhu() {
		System.out.println("Bhaiya");
	}
	protected void dinesh() {
		System.out.println("R15");

	}
public static void main(String[] args) {
	AccessModifier am = new AccessModifier();
	am.amsath();
	am.madhu();
	am.Mugil();
}
}
