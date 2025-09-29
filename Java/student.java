package Java;

public class student {
	String name;
	int roll_no;
	String phone_no;
	String email_id;
	final static String college_name="Bjs college";
	
	private student(String name, int roll_no,String phone_no,String email_id){
		this.name=name;
		this.roll_no=roll_no;
		this.phone_no=phone_no;
		this.email_id=email_id;
	}
	public void display_student_info() {
		System.out.println("student name is:"+this.name);
		System.out.println("student roll_no is:"+this.roll_no);
		System.out.println("student phone_no is:"+this.phone_no);
		System.out.println("student email_id is:"+this.email_id);
	}

	public static void main(String[] args) {
		student s= new student("shubhangi", 1,"8855943694","shubhangikundekar@gmail.com");
		student s1= new student("shruti", 2,"8855943694","shrutikothawale@gmail.com");
		 s.display_student_info();
		 s1.display_student_info();
	}

}
