package demo;

import Controller.Login;
import Model.studentModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentModel[] studentArray = new studentModel[100];
		
		
		studentArray[0] = new studentModel("smithj01", "suffolk", "John Smith", "13 Main Street", "Seldon", 
				"NY", "11784", "Computer Science", "Computer Science", "September 2013", 3.0);
		

	
		
		System.out.println(studentArray[0]);
		Login.getCrudentialsUserName();
		System.out.println(Login.userName);
		Login.getCrudentialsPassword();
		System.out.println(Login.password);
		Login.checkCrudentials(Login.userName, Login.password, studentArray, Login.currentUser);
				
				
		
	}

}
