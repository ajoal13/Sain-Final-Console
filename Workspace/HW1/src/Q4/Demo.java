package Q4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		
		Scanner keyboard = new Scanner(System.in);
		
		int smallest;
		int largest = 0;
		int average = 0;
		
		int[] myList = new int[5];
		
			
		System.out.println("Enter 5 numbers");

		myList[0] = keyboard.nextInt();
		myList[1] = keyboard.nextInt();
		myList[2] = keyboard.nextInt();
		myList[3] = keyboard.nextInt();
		myList[4] = keyboard.nextInt();
		
		for(int i=0; i<5; i++){
			
			if (myList[i] > largest){
				largest = myList[i];
							}
		}
			
			smallest = largest;  //initilizes smallest as largest number to sort
						
			for(int x=0; x<5; x++){
				
				if (myList[x] < smallest){
					smallest = myList[x];
								}
			}
			
				for(int y=0; y<5; y++){
					average = average + myList[y];
										}
				
			
				System.out.println("Largest number -" + largest);
				System.out.println("Smallest number -" + smallest);
				System.out.println("Average -" + average / 5);
				
			
		}
		}
	
		
		
		
		
		
		
		
