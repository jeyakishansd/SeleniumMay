package week4.day5;

public class LearnStatic {
public void getEmployeeDetails(String empName, int empID, String company) {
	
	System.out.println("name:"+empName);
	System.out.println("ID:"+empID);
	System.out.println("COMPANY:"+company);
}
public static void main(String[] args) {
	LearnStatic ls= new LearnStatic();
	ls.getEmployeeDetails("jey", 36, "testleaf");
	ls.getEmployeeDetails("Amsath", 46, "testleaf");
	ls.getEmployeeDetails("Mugil", 93, "testleaf");
	ls.getEmployeeDetails("Madhu", 99, "Ex-ZOHO");
	ls.getEmployeeDetails("Dinesh", 22, "ZOHO");
}
}
