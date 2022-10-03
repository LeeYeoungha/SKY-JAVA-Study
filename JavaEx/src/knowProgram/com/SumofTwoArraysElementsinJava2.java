package knowProgram.com;

import java.util.Scanner;

public class SumofTwoArraysElementsinJava2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("sizeA?");
		int scNum1 = sc.nextInt();
		int arrayA[] = new int[scNum1];
		
		int sumA = 0;
		
		
		for (int i = 0; i < scNum1; i++) {
			arrayA[i] = sc.nextInt();
		}
		
		for (int j = 0; j < scNum1; j++) {
		System.out.print(arrayA[j] + " ");
		sumA += arrayA[j];
		}
		
		System.out.println("");
		System.out.println(sumA);
		
		System.out.println("sizeB?");
		int scNum2 = sc.nextInt();
		int arrayB[] = new int[scNum2];
		
		for (int k = 0; k < scNum2; k++) {
			arrayB[k] = sc.nextInt();
		}
		
		for (int l = 0; l < scNum2; l++) {
			System.out.print(arrayB[l] + " ");
		}
		 
		
		System.out.println("total :");
		for (int i = 0; i < arrayB.length; i++) {
			int arrayC = arrayA[i] + arrayB[i];
			System.out.print(arrayC + " ");
				
		}
		
		
		
		
				
		
		
	}
	
}
