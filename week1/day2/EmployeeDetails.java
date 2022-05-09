package week1.day2;

public class EmployeeDetails {
public  String printEmployeeName(String empName, int empID) {
	return empName;	
}
public String getEmployeeAddress(String empAddress) {
	return empAddress;
}
public double printEmployeeSalary(double empsalary) {
	return empsalary ;
}
public long printMobileNo(long empNo) {
	return empNo;
}
public static void main(String[] args) {
	EmployeeDetails ed = new EmployeeDetails();
	
	String Name = ed.printEmployeeName("Jeykee", 3699);
	System.out.println(Name);
	String address =ed.getEmployeeAddress("Madurai");
	System.out.println(address);
	double salary =ed.printEmployeeSalary(45000);
	System.out.println(salary);
	long mobNo =ed.printMobileNo(76395759);
	System.out.println(mobNo);
}
}
