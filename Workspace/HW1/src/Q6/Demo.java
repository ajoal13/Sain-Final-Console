package Q6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {



	public static void main(String[] args) {

		Student[] studentArray = new Student[2];
		
		studentArray[0] = new Student("Chris", 3.5, "277-1234");
		studentArray[1] = new Student("Karl", 2.0, "123-4567");

		
		System.out.println(studentArray[0]);
		System.out.println(studentArray[1]);


		
		 
		 
	}

	

	

	
	
}
