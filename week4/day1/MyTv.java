package week4.day1;

public class MyTv implements LgSound, LgTv {

	public void magicRemote() {
		System.out.println("Magic remote");
	}

	public void irRemote() {
		System.out.println("irRemote");
	}
	
	public void audioMode() {
		System.out.println("audio mode");
	}

	public void pictureMode() {
		System.out.println("Picture mode");
	}

	public static void main(String[] args) {
		MyTv tv = new MyTv();
		tv.audioMode();
		tv.irRemote();
		tv.magicRemote();
		tv.pictureMode();
	}
}
