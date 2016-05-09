package View;

import java.util.EventObject;

public class OKButtonEventObject extends EventObject {

	private String userID;
	private String password;
	
	public OKButtonEventObject(Object source) {
		super(source);
	}

	public OKButtonEventObject(Object source, String userID, String password) {
		super(source);
		this.userID = userID;
		this.password = password;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public String getPassword() {
		return password;
	}
	

	
	
	
	
}