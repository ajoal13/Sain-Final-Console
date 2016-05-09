package Q5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		
		int smallest;
		int largest = 0;
		int average = 0;
		int[] myList = new int[5];
		String reader;
		
		
	//writes new file	
//		PrintWriter writer = null;
//		try {
//			writer = new PrintWriter("NUMBERS.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		writer.println(10);
//		writer.println(20);
//		writer.println(30);
//		writer.println(40);
//		writer.println(50);
//		writer.close();
		// END
		
		
		//Reads text file
		
	
		System.out.println("Reading file");

			Scanner scanner = null;
			try {
				scanner = new Scanner(new File("NUMBERS.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			int [] number = new int [100];
			int i = 0;
			while(scanner.hasNextInt())
			{
			     number[i++] = scanner.nextInt();
			}
			
			/////////////////////
			
			for(int z=0; z<5; z++){
				
				if (number[z] > largest){
					largest = number[z];
								}
			}
				
				smallest = largest;  //initilizes smallest as largest number to sort
							
				for(int x=0; x<5; x++){
					
					if (number[x] < smallest){
						smallest = number[x];
									}
				}
				
					for(int y=0; y<5; y++){
						average = average + number[y];
										}
				
				
				//Writes to outut file
		System.out.println("Writing File");
				
				
				PrintWriter outputWriter = null;
				try {
					outputWriter = new PrintWriter("High.Low.Average.txt");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				outputWriter.println("Largest number = " + largest);
				outputWriter.println("Smallest number = " + smallest);
				outputWriter.println("Average = " + average / 5);
			
				outputWriter.close();
		
			
		System.out.println("Done");
		
		
		
	}

}
