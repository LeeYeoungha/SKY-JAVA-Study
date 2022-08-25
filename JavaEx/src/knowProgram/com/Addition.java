package knowProgram.com;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[]args) {
		
		//ex1
		/*		int num1, num2, sum;
				
				num1 = 10;
				num2 = 20;
				
				sum = num1 + num2;
				
				System.out.printf("%d + %d = %d",num1,num2,sum);
				*/
		
		
		//ex2
		
		System.out.println("input num");
		
		Scanner sc = new Scanner(System.in);
		
		/*int inputSc = sc.nextInt();
		int inputScc = sc.nextInt();*/
		
		double inputSc = sc.nextDouble();
		double inputScc = sc.nextDouble();
		
		System.out.printf("%d, %d 을 입력%n", inputSc, inputScc);
		
		double sum = inputSc + inputScc;
		
		System.out.println("합계값" + sum + "이다");
		
		
		
		
		
	}

}
