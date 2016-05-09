package Q9;

public class Students extends Persons {

	
	public double gpa;

	
	
	
	public Students(String name, String iD, double gpa) {
		super(name, iD);
		this.gpa = gpa;
	}

	public Students(String name, double gpa, String iD) {
		super(name, iD);
		this.gpa = gpa;
		}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Students [gpa=" + gpa + ", name=" + name + ", iD=" + iD + "]";
	}



	
	
	

	
	
	
	
}
