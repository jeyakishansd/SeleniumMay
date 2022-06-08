package week4.day3;

public class Students {

	public void getStudentInfo (String id){
		System.out.println("ID :"+id);
	}
	public void getStudentInfo(int ID , String Name){
		System.out.println("ID & Name:"+ID +Name);
	}	
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("Email & Ph.No :"+email +phonenumber);
	}
	public static void main(String[] args) {
		Students stu= new Students();
		stu.getStudentInfo("3699");
		stu.getStudentInfo(3699, ",jeyakishan");
		stu.getStudentInfo("jeykee@gmail.com,", 76395709);
	}
	}

	
