package knowProgram.com;

import java.util.Scanner;

public class SimpleInterestPrograminJava {
	
	public static void main(String[] args) {
		
		/*Enter principal amount:: 10000
		Enter time (in months):: 60
		Enter the interest rate (per year):: 3.9
		Simple interest = 23400.0
		Total amount to pay = 33400.0 */
		//interest = (principalAmount * rate * time) / 100
		//("Total amount to pay = "+ (principalAmount+interest));

		
		
		System.out.println("Enter principal amount:");
		
		Scanner sc = new Scanner(System.in);
		double scNum1 = sc.nextDouble();
		
		
		System.out.println("Enter time (in months):");
		double scNum2 = sc.nextDouble();
		
		System.out.println("Enter the interest rate (per year):");
		double scNum3 = sc.nextDouble();
		
		double result1 = (scNum1 * scNum2 * scNum3)/100;
		System.out.println("Simple interest = "+ result1);
		
		double result2 = result1 + scNum1;
		System.out.println("Total amount to pay = "+ result2);
	
	}

}
