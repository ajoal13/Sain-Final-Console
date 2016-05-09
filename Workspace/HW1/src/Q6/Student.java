package Q6;

public class Student {

	public static Object newStudent;
	String name;
	double gpa;
	String phone;
	
		
	
	public Student(String name, double gpa, String phone) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.phone = phone;
	}
	
	public Student(String name2, String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", phone=" + phone + "]";
	}
	
	
	
	
}
