package week4.day1;

public class MyMobile {
public static void main(String[] args) {
	Redmi red= new Redmi();
	red.faceAuthentication();
	red.Fingerprint();
	red.makeCall();
	red.redmiNote();
	red.sendSMS();
	red.startPhone();

	
	AndroidDesign design = new Redmi();
	design.startPhone();
	design.makeCall();
	design.sendSMS();
	
	SamsungDesign sam=new Redmi();
	sam.faceAuthentication();
	sam.Fingerprint();

}
}
