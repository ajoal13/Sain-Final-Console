package Controller;

import java.util.Scanner;

import Model.studentModel;

public class Login {

	
	static Scanner keyboard = new Scanner(System.in);
	public static String userName;
	public static String password;
	public static studentModel currentUser = new studentModel();

	public static String getCrudentialsUserName(){
		System.out.println("Enter Username");
		String userNameInput= keyboard.nextLine();
		userName = userNameInput;
		
		return userName;
	}
	
	public static String getCrudentialsPassword(){
	System.out.println("Enter Password");
	String passwordInput= keyboard.nextLine();
	password = passwordInput;
	
	return password;
	}
	
	
	public static studentModel checkCrudentials(String userName, String password, studentModel[] studentArray, studentModel currentUser ){		
		
		int stuArraySize = studentArray.length;
			
		for(int i=0; i<stuArraySize; i++){
			
			if (studentArray[i].getUserName().equals(userName) && studentArray[i].getPassword().equals(password)){
					System.out.println("Login Successful");
									
					currentUser = studentArray[i];
					return currentUser;
			}
			
			else {
				System.out.println("Incorrect User Name or Password");
				return null;			
			}
					}
		return currentUser;
	
		
	}

	
	
	
	
	
	
	
}
