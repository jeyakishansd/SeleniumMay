package week1.day1;

public class MobileObject {
	String mobileName="Redmi";
	char firstLetter='R';
	short ramSize=6;
	int storage=64;
	boolean isDamaged = false ;
	double price = 15000.00 ;
	long ipAddress = 3968765;
	float frequencyRange = 3.69f;
	
	public static void main(String[] args) {
		MobileObject mob = new MobileObject();
		long ip = mob.ipAddress;
		System.out.println(ip);
	}

}
