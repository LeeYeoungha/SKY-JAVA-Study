package knowProgram.com;

import java.util.Iterator;

public class DifferentWaysToPrintArray {

	public static void main(String[] args) {

		// ex1 for
		/*int arrayA[] = { 10, 20, 30, 40, 50 };
		for (int j = 0; j < arrayA.length; j++) {
			int i = arrayA[j];
			
			System.out.print(i);
			
			if (j < arrayA.length-1) {
				System.out.print(",");
			}
		}
		*/

		// ex2 foreach
		/*int arrayB[] = {10,20,30,40,50};
		for (int el : arrayB) {
			System.out.println(el);
			if (el > arrayB.length) {
				System.out.println(",");
			}*/

		// ex3 foreach

		//
			int p1 = 0;
			int p2 = 0;
			//int x5 = 5;
	
			int arrayB[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 }; //16 item
			int arrayBLength = arrayB.length; // 16 item
			int ave = arrayB.length / 5; // 3 page
		// System.out.println(ave);
		
		
			int I = 0;
			int X = 5; 
			int C = 0;
			
			for (int K = 0; K < ave; K++) { // ave=3 0,1,2
				//System.out.println(arrayB[K] + ",");
				//System.out.println("\n"); //3번 순회
				C = I+5;
				
				for (int A = 0; A < 5; A++) { //page 돌리기 
					//System.out.println(l);
					// 0; 0<5; 1
					// 1; 1<5; 2
					// 2; 2<5; 3
					// 3; 3<5; 4
					// 4; 4<5; 5
					
					int B = A+5;
							
					if (arrayBLength >= 0) {
						System.out.printf(arrayB[A] + ",");
						//i = i + 5; 
					}
					//System.out.printf(arrayB[B] + ",");
				}
				System.out.println("\n");	
				//break;
			}
			//System.out.printf(arrayB[C] + ",");
		}
}


//1,2,3,4,5
//6,7,8,9,10
//11,12,13,14