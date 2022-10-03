package knowProgram.com;

import java.util.Scanner;

public class JavaCalculateTotalAverageofThreeSubjects {
	

	
	public static void main(String[] args) {
		
	calculate();
		
	}
	
	
	
	public static void calculate() {
		/*	Enter marks of three subjects:
		70 75 86
		Total Mark: 231
		Average Mark: 77
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of three subjects:");
		
		
		int scNum1 = sc.nextInt();
		int scNum2 = sc.nextInt();
		int scNum3 = sc.nextInt();
		
		
		int sum = scNum1 + scNum2 + scNum3;
		
		System.out.println("Total Mark: " + sum);
		
		double scAvg = sum/3;
		
		System.out.println("Average Mark:" + Math.round(scAvg));
		
		
		//70 75 86
		//Total Mark: 231
		//Average Mark: 77
		
		
		
		
		
	}
	
	
	
	
}
