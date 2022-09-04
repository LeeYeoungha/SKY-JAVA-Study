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
	
	//output = 
	//Sum of array elements= 150

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
	
	public static void main(String[] args) {
		System.out.print("Enter number of elements: ");
		
		Scanner sc = new Scanner(System.in);
		int inputSc = sc.nextInt();
		
		System.out.print(inputSc);
		
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		
		int inputIp = ip.nextInt();		
		
		
		for (int i = 0; i < inputSc; i++) {
		
			
			int[] inputArray = {i};
				
			}
			
		}
		
		
		
		
		
		
	}
	

}
