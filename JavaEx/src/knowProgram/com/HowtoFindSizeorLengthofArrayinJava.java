package knowProgram.com;

import java.util.Iterator;

public class HowtoFindSizeorLengthofArrayinJava {

	// ex1 Java���� �迭�� ũ�� �Ǵ� ���̸� ǥ���ϴ� Java ���α׷�

	/*public static void main(String[]args) {
		
		int arrayA [] = {10,20,30,40,50};
		System.out.println("arrayA.length : " + arrayA.length);
		
	}
	}
	*/

	/*
	 * ex2 :
	 * Size = 5
	Array elements:
	10 20 30 40 50
	*/

	/*public static void main(String[] args) {
	
		int arrayB [] = {10,20,30,40,50};
		
		System.out.println("Size = " + arrayB.length);
		System.out.println("Array elements : \n");
		
		for(int i = 0 ; i < arrayB.length ; i++) {
			System.out.print(arrayB[i]);
			
			if (i < arrayB.length-1 ) {
				System.out.print(",");
				
			}
		}
		
	}*/

	/*	public static void main(String[] args) {
	
			int arrayC[] = { 10, 20, 30, 40, 50 };
	
			System.out.println("Size = " + arrayC.length);
			System.out.println("Array elements : ");
	
			for (int i = 0; i < arrayC.length; i++) {
				System.out.print(arrayC[i] + " ");
	
			}
		}
	}*/

//ex3
	// Java ������ �迭���� ��� ���� ��ݿ� ���� ���� ���� ���� �Ӽ��� �ֽ��ϴ�. ���� ���,
	// ������ �迭 arr���ִ� ��� arr.length�� ����Ͽ� �θ� ���̸� ã�� arr[index].length�� ����Ͽ� �ڽ� ���̸� ã��
	// �� �ֽ��ϴ�.

	/*The length of the given array = 3
			arr[0] length = 2
			arr[1] length = 2
			arr[2] length = 2*/

	// result

	/*public static void main(String[] args) {
		
		int arrayD[][] = {{10,20},{30,40},{50,60},{70,80},{90,100}};
		
		System.out.println("arr[0] length = " + arrayD[0].length);
		System.out.println("arr[1] length = " + arrayD[1].length);
		System.out.println("arr[2] length = " + arrayD[2].length);
			
		
		
	}*/

	// ex4
	/*
	 * 2D array size = 3
	First row size = 2
	Second row size = 2
	Array elements:
	10 20
	30 40
	50 60
	 * 
	 */
	
	
	//failed
	public static void main(String[] args) {
		// 1)
		int arrayE[][] = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		System.out.println("2D array size = " + arrayE.length);

		// 2)
		System.out.println("First row size = ");

		System.out.println("Array elements = ");

		for (int i = 0; i < arrayE.length; i++) {
			int inArrayE[] = arrayE[i];
			//System.out.print(arrayE[i] + " ");
			
			for (int j = 0; j < inArrayE.length; j++) {
				System.out.print(inArrayE[j] + " ");
			}
			System.out.println(" ");
		}

	}

}
