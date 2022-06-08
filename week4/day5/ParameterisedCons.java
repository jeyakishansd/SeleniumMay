package week4.day5;

public class ParameterisedCons {
	int empID;
	String empName;
	 String empAddress;
	public ParameterisedCons() {
		System.out.println("default constructor");
	}

	public ParameterisedCons(int id,String name,String address) {
		this.empID=id; 
		this.empName=name;
		this.empAddress=address;
		System.out.println("name:"+name +" id:"+id+ " Address:" +address);
	}
	public static void main(String[] args) {
		ParameterisedCons pm= new ParameterisedCons(36, "jeykee","testleaf");
		System.out.println(pm.empAddress);
		System.out.println(pm.empID);
		System.out.println(pm.empName);
	}
}
