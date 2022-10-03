package knowProgram.com;

import java.util.Scanner;

public class OddEvenPrograminJava {
	
	public static boolean OddNum(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer numbers");
		int scInp = sc.nextInt();
		
		boolean result = OddNum(scInp);
		
		if(result) {
			System.out.println("짝"); 
		}
		else {
			System.out.println("홀");
		}
	}

}
