package week4.day3;

public  class Car extends Vehicle  {
	public void turnOnAC() {
	System.out.println("turn on AC");
	
}
	public static void main(String[] args) {
		Car vehicle = new Car();
		vehicle.applyBrake();
		vehicle.soundHorn();
		vehicle.openSunRoof();
		vehicle.turnOnAC();
	}
}
