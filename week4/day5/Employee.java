package week4.day5;

public class Employee {
	int empID;
	String empName;
	String empAddress;
	double empSalary;
	boolean isActive;
	char empInitial; 
	 
	public Employee() {
	System.out.println("default constructor");
	}	
	
public static void main(String[] args) {
	Employee emp= new Employee();
	System.out.println(emp.empAddress);		
	System.out.println(emp.empID);;
	System.out.println(emp.empName);
	System.out.println(emp.empInitial);
	System.out.println(emp.empSalary);
	System.out.println(emp.isActive);
}
}