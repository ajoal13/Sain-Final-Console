package demo;

import Controller.Login;
import Model.Faculty;
import Model.studentModel;

public class Main {

	public static void main(String[] args) {

		studentModel[] studentArray = new studentModel[100];
		Faculty[] facultyArray = new Faculty[100];
		
		studentArray[0] = new studentModel("smithj01", "suffolk", "John Smith", "13 Main Street", "Seldon", 
				"NY", "11784", "Computer Science", "Computer Science", "September 2013", 3.0, 10001);
		studentArray[1] = new studentModel("algeria01", "student", "John Smith", "13 Main Street", "Seldon", 
				"NY", "11784", "Computer Science", "Computer Science", "September 2013", 3.0, 10001);
		
		
		facultyArray[0] = new Faculty("johnsonk01", "professor", "Kathy Johnson", "1");
		facultyArray[1] = new Faculty("rodreguizj01", "admin", "Joseph Rodreguiz", "2");
		
		
		
		//Login.Login(Login.userStatus, facultyArray, studentArray);
		
		Login.getUserStatus();
		Login.getCrudentialsUserName();
		Login.getCrudentialsPassword();
		
	if (Login.userStatus.equals("Faculty")){
			Login.checkCrudentialsFaculty(Login.userName, Login.password, facultyArray, Login.currentUserFaculty);
	
	}
	if (Login.userStatus.equals("Student")){
		Login.checkCrudentialsStudent(Login.userName, Login.password, studentArray, Login.currentUserStudent);
	}
		
		
	
//		
////		System.out.println(studentArray[0]);
//		Login.getCrudentialsUserName();
////		System.out.println("Username - " + Login.userName);
//		Login.getCrudentialsPassword();
////		System.out.println("Password - " + Login.password);
//		Login.checkCrudentialsStudent(Login.userName, Login.password, studentArray, Login.currentUserStudent);
//				
				
		
	}

}
