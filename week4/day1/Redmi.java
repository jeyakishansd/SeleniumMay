package week4.day1;

public class Redmi implements AndroidDesign , SamsungDesign{

	public void startPhone() {
		// TODO Auto-generated method stub
		System.out.println("Start Phone");
	}

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("make call");
	}

	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send SMS");
	}
	
	public void redmiNote() {
	// TODO Auto-generated method stub
	System.out.println("Redmi note");
}
	public static void main(String[] args) {
		Redmi red= new Redmi();
		red.makeCall();
		red.redmiNote();
		red.sendSMS();
		red.startPhone();
		red.faceAuthentication();
		red.Fingerprint();
	}
	

	public void faceAuthentication() {
		// TODO Auto-generated method stub
		System.out.println("Face Lock");
	}

	public void Fingerprint() {
		// TODO Auto-generated method stub
		System.out.println("FingerPrint");
	}
}
