package week1.day1;

public class TwoWheeler {
	int noOfWheels	 = 2 ;
	
	
	short noOfMirrors = 2;
	long chassisNumber =593058;
	boolean isPunctured = false ;
	String bikeName = "Gixxer" ;
	double runningKM =32584.6 ;
	
	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();  
			String bn = tw.bikeName;
			System.out.println(bn);
			long cn = tw.chassisNumber;
			System.out.println(cn);
			boolean punctured = tw.isPunctured;
			System.out.println(punctured);
			System.out.println(tw.noOfWheels);
			System.out.println(tw.runningKM);
			System.out.println(tw.noOfMirrors);
			String bnn = tw.bikeName;
			System.out.println(bnn);
			System.out.println(tw.runningKM);
	}

}
