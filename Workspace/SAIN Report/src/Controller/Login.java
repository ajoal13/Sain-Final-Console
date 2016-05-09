package Controller;

import java.util.Scanner;

import Model.Faculty;
import Model.studentModel;

public class Login {

	
	static Scanner keyboard = new Scanner(System.in);
	public static String userName, userStatus;
	public static String password;
	public static studentModel currentUserStudent = new studentModel();
	public static Faculty currentUserFaculty = new Faculty();
	
	
	
	public static String getUserStatus(){
		System.out.println("Student or Faculty?");
		String userStatusInput= keyboard.nextLine();
		userStatus = userStatusInput;
		
		return userStatus;
	}
	
	
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
	
	//STUDENT
	public static studentModel checkCrudentialsStudent(String userName, String password, studentModel[] studentArray, studentModel currentUserStudent ){		
		int a = 0;
		int stuArraySize = studentArray.length;
				
		for(int i=0; i<stuArraySize; i++){
			
				if (studentArray[i].getUserName().equals(userName) && studentArray[i].getPassword().equals(password)){
					System.out.println("Login Successful Student");
					currentUserStudent = studentArray[i];
					return currentUserStudent;			
				}
			
		}
		if(a < 1){
			System.out.println("Incorrect User Name or Password");
				getCrudentialsUserName();
				getCrudentialsPassword();
				checkCrudentialsStudent(Login.userName, Login.password, studentArray, Login.currentUserStudent);
		}		
		
		return currentUserStudent;
	}

///fACULTY
	public static Faculty checkCrudentialsFaculty(String userName, String password, Faculty[] facultyArray, Faculty currentUserFaculty ){		
		
		int facArraySize = facultyArray.length;
			
		for(int i=0; i<facArraySize; i++){
			
			if (facultyArray[i].getUserName().equals(userName) && facultyArray[i].getPassword().equals(password)){
					System.out.println("Login Successful Faculty");
					currentUserFaculty = facultyArray[i];
					return currentUserFaculty;			
			}
					
					}
		
		if (currentUserFaculty != null){
			System.out.println("Incorrect User Name or Password");
			getCrudentialsUserName();
			getCrudentialsPassword();
			checkCrudentialsFaculty(Login.userName, Login.password, facultyArray, Login.currentUserFaculty);
		return null;
		}
		return currentUserFaculty;
	
		
	}

	//////////////////////


	public static void Login(String userStatus, Faculty[] facultyArray, studentModel[] studentArray) {
		// TODO Auto-generated method stub
//				getUserStatus();
//				getCrudentialsUserName();
//				getCrudentialsPassword();
//				
//			if (userStatus.equals("Faculty")){
//					checkCrudentialsFaculty(Login.userName, Login.password, facultyArray, Login.currentUserFaculty);
//			}
//			if (userStatus.equals("Student")){
//				checkCrudentialsStudent(Login.userName, Login.password, studentArray, Login.currentUserStudent);
//			}
			
			
			
			
	}

}
