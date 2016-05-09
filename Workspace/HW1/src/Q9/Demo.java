package Q9;

import Q6.Student;

public class Demo {

	public static void main(String[] args) {

		Students[] studentArray = new Students[2];
		Faculty[] facultyArray = new Faculty[2];
		Persons[] personArray = new Persons[1];
		
		
		studentArray[0] = new Students("Chris", "12345", 3.5);
		studentArray[1] = new Students("Karl", 2.0, "55555");
		
		facultyArray[0] = new Faculty("Ms Smith", "98765", 55000.00);
		
		personArray[0] = new Persons("Anthony", "55555");
		
		System.out.println(studentArray[0]);
		System.out.println(studentArray[1]);
		System.out.println(personArray[0]);
		System.out.println(facultyArray[0]);
	}

}
