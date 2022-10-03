package knowProgram.com;

import java.util.Scanner;

public class SimpleJavaProgramtoAddTwoNumbers {
	
	

	
	
	


	private static String[] args;



	public static void main(String[] args) {
		
		//AdditionPrograminJava();
		//SimpleJavaProgramtoAddTwoNumbers();
		//Addition();
		//SimpleJavaProgramtoAddTwoNumbers2();
		//AdditionofTwoNumbersinJavaUsingMethod();
		SumofTwoNumbersUsingCommandLineArgumentsInJava();
		
	}


	private static void AdditionPrograminJava() {
		
			
			int sumA = 10;
			int sumB = 10;
			
			int sumT = sumA + sumB;
			
			System.out.print("sum="+ sumT);
			
	}

	/*
	Enter first number: 15
	Enter second number: 25
	Sum = 40*/
	private static void SimpleJavaProgramtoAddTwoNumbers() {
		
		Scanner sc = new Scanner(System.in);
		int inputSc1 = sc.nextInt();
		int inputSc2 = sc.nextInt();
		System.out.println("Enter first number:" + inputSc1);
		System.out.println("Enter second number:" + inputSc2);
		
		int Sum = inputSc1 + inputSc2;
		
		System.out.println("Sum="+ Sum);
		
	}
	
	/*
	Enter two floating-point numbers: 12.5 17.5
	Sum = 30.0*/
	
	private static void Addition() {
		
		double A = 12.5;
		double B = 17.5;
		
		System.out.println("Enter two floating-point numbers:" + A +" "+ B);
		
		double sum = A+B;
		
		System.out.println("Sum="+sum);
		
	}
	
	/*Enter first number: 15
	Enter second number: 25
	Sum = 40*/
	
	private static void SimpleJavaProgramtoAddTwoNumbers2() {
		
		int i = 0;
		int j = 0;
		
		
		System.out.println("Enter first number:");
		
		Scanner sc = new Scanner(System.in);
		int scNum1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int scNum2 = sc.nextInt();
		
		int sum = scNum1 + scNum2;
		
		System.out.println("Sum = :" + sum);
		
	}
	
	/*
	Enter two floating-point numbers: 12.5 17.5
	Sum = 30.0*/
	
	private static void AdditionofTwoNumbersinJavaUsingMethod() {
	
		
		System.out.println("Enter two floating-point numbers:" );
		
		Scanner sc = new Scanner(System.in);
		double scNum1 = sc.nextDouble();
		double scNum2 = sc.nextDouble();
		
		add(scNum1, scNum2);
				
	}

	
	private static void add(double scNum1, double scNum2) {
		
		double sum = scNum1 + scNum2;
		
		System.out.println("Sum + " + sum);
		
		
		
		
	}

	


	private static void SumofTwoNumbersUsingCommandLineArgumentsInJava() {
		int i, j, k;
		
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		
		int sum = i + j;
		
		System.out.println(sum);
	}
	
	
}
