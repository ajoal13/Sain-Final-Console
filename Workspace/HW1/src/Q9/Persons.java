package Q9;

public class Persons {

	public String name;
	public String iD;
	
	public Persons(String name, String iD) {
			super();
		this.name = name;
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", iD=" + iD + "]";
	}

	
	
	
	
	
	
	
}
