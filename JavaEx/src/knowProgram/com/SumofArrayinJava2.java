package knowProgram.com;

import java.util.Iterator;
import java.util.Scanner;

public class SumofArrayinJava2 {

	/*	array = {10, 20, 30}
		Sum of array elements = 10+20+30 = 60[]
		
		*/

	/*	public static void main(String[] args) {
			int[] arrayA = { 10, 20, 30 };
	
			System.out.print("arrayA = {");
			for (int i = 0; i < arrayA.length; i++) {
				System.out.print(arrayA[i]);
				
				if (i < arrayA.length-1) {
					System.out.print(",");
					
					
				}
			
			}
			System.out.print("}");
			
			
		}
	*/
	/*	Similarly,
		array = {50, 60, -20, 55, -90}
		Sum of array elements = 50+60-20+55-90 = 55[]*/

	/*	
		public static void main(String[] args) {
			int[] arrayB = {50, 60, -20, 55, -90};
			
			
			System.out.print("array = {");
			
			for (int i = 0; i < arrayB.length; i++) {
				System.out.print(arrayB[i]);
				
				if(i<arrayB.length -1) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			
			
			
			System.out.println("\nSum of array elements =");
			
			for (int i1 = 0; 1 < arrayB.length; i1++) {
				System.out.println(arrayB[i1]);
			}
			
		}
		*/

	// output =
	// Sum of array elements= 150

	/*	public static void main(String[] args) {
			int arrayC[] = {10, 20, 30, 40, 50};
			
			System.out.print("Sum of array elements = ");
			
			int sumC = 0;
			
			for (int i = 0; i < arrayC.length; i++) {
				sumC = sumC + arrayC[i];
			}
			System.out.print(sumC);
		}*/

	/*	배열 요소의 합을 찾는 절차,
		1) 하나의 배열을 가져옵니다.
		2) 하나의 sum 변수를 선언하고 0으로 초기화하십시오.
		3) 루프를 사용하여 주어진 배열의 요소를 반복합니다.
		4) sum 변수에 요소를 추가하고 결과 값을 sum 변수에 다시 할당합니다. (즉, 합계 = 합계 + arr)
		5) 배열의 모든 요소가 sum 변수에 추가되면 결과를 표시합니다.[i]
		
		*result = 
		*Enter number of elements: 5
		*Enter array elements:
		*10 20 30 40 50
		*Sum of array elements= 150
		*/

/*	public static void main(String[] args) {
		
		int sum = 0;		//sum
		int[] arrayD = {10,20,30,40,50};		//array
		
		System.out.print("Enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int inputSc = sc.nextInt();
		System.out.println(inputSc);

		
		

		System.out.println("Enter array elements: ");
		
		for (int i = 0; i <= inputSc; i++) {
			
			
			int printArrayDI = arrayD[i];
			System.out.print(printArrayDI + " ");
			
			sum = sum + arrayD[i];
			
			
			
		}
		System.out.printf("\nSum of array elements= %d", sum);
		
		
	}

}*/

	
	
	// 입력값을 받아 SUM
	
	//Enter number of elements:
	//Enter array elements: 
	//Sum of array elements= 
		
	
	/*public static void main(String[] args) {
		
		System.out.println("Enter number of elements:");
		
		Scanner sc = new Scanner(System.in);
		int scNum = sc.nextInt();
		
		int arrayD[] = new int[scNum];
		
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i < scNum; i++) {
			arrayD[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for (int i1 = 0; i1 < scNum; i1++) {
			
		//sum =+ arrayD[i1];
		
			sum = sum + arrayD[i1];
			
			
		}
		
		
		System.out.println("Sum of array elements= "+sum);
	
		
		
		
		
	}
}*/
	
	
	
		//re3
		
		// 입력값을 받아 SUM
		
		//Enter number of elements:
		//Enter array elements: 
		//Sum of array elements= 
	
		/*public static void main(String[] args) {
			
			System.out.println("Enter number of elements:");
			
			
			
			Scanner sc = new Scanner(System.in);
			int ip = sc.nextInt();
			
			
			int arrayD[] = new int[ip];
			
			
			for (int i = 0; i < arrayD.length; i++) {
				arrayD[i] = sc.nextInt();
			}
			
			
			System.out.println("Enter array elements: ");
			System.out.println(ip);
			
			
			
			int sum = 0;
			
			for (int i = 0; i < arrayD.length; i++) {
				sum = sum + arrayD[i];
			}
			System.out.println("Sum of array elements= "+sum);
		}
}*/
	
	
	

	
		
	

//correct answer	
/*	public static void main(String[] args) {

	    // create Scanner class object
	    Scanner scan = new Scanner(System.in);

	    // take size of array
	    System.out.print("Enter number of elements: ");
	    int number = scan.nextInt();

	    // declare array with given size
	    int array[] = new int[number];

	    // take input for array elements
	    System.out.println("Enter array elements: ");
	    for (int i=0; i<array.length; i++) {
	      array[i] = scan.nextInt();
	    }

	    // initialize sum variable with 0
	    int sum = 0;

	    // add array elements to sum
	    for (int i=0; i<array.length; i++) {
	      sum += array[i];
	    }

	    // display the result
	    System.out.println("Sum of array elements= " + sum);
	  }
	}*/