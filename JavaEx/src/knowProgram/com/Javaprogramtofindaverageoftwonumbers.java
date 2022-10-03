package knowProgram.com;

import java.util.Scanner;

public class Javaprogramtofindaverageoftwonumbers {

	public static void main(String[] args) {
		
		
		//Javaprogramtofindaverageoftwonumbers();
		Javaprogramtofindaverageoftwonumbersbytakinginputfromenduser();
		
	}
	
	
	public static void Javaprogramtofindaverageoftwonumbers() {
		
		double i = 10;
		double j = 20;
		double sum = i + j;
		double avg = sum/2;
		
		System.out.println(avg);
	}
	
	
	/*Enter two numbers: 50 100
	Average: 75.0*/
	
	public static void Javaprogramtofindaverageoftwonumbersbytakinginputfromenduser() {
		
	
		System.out.print("Enter two numbers: ");
		
		//Average: 75.0*/
		Scanner sc = new Scanner(System.in);
		double scNum1 = sc.nextDouble();
		double scNum2 = sc.nextDouble();
		System.out.println(scNum1 + " " + scNum2);
		
		double sum = scNum1 + scNum2;
		double avg = sum/2;
		
		System.out.println("Average: " + avg);
		
	}
	
}
