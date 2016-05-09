package Model;

public class Faculty {

	public String userName, password, name, adminflag;

	
	
	
	
	
	public Faculty() {
		super();
	}






	public Faculty(String userName, String password, String name, String adminflag) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.adminflag = adminflag;
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

	public String getAdminflag() {
		return adminflag;
	}


	public void setAdminflag(String adminflag) {
		this.adminflag = adminflag;
	}
	
}
