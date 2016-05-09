package Model;

public class studentModel{
	
	public String userName;
	public String password;
	public String name;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String major;
	public String program;
	public String enrollDate;
	double gpa;
	int studentID;
	
	
	
//	String[] CoursesTakenTwardsMajor;
//	String[] CoursesTakenOther;
//	String[] CoursesNeeded;
//	String[] CoursesCurrent;
//	String[] CoursesFailedOrWithdrew;
	
		
	
	public studentModel() {
		super();
	}
	public studentModel(String userName, String password, String name, String address, String city, String state, String zip,
			String major, String program, String enrollDate, double gpa, int studentID) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.major = major;
		this.program = program;
		this.enrollDate = enrollDate;
		this.gpa = gpa;
		this.studentID = studentID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String toString() {
		return "studentModel [userName=" + userName + ", password=" + password + ", name=" + name + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", major=" + major + ", program="
				+ program + ", enrollDate=" + enrollDate + ", gpa=" + gpa + ", studentID=" + studentID + "]";
	}
	
	
	
	
	
	
}
