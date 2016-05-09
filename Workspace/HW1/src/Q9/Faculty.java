package Q9;

public class Faculty extends Persons {

		public double salary;

		
		public Faculty(String name, String iD, double salary) {
			super(name, iD);
			this.salary = salary;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Faculty [salary=$ " + salary + ", name= " + name + ", iD= " + iD + "]";
		}

		
		
		
	
}
