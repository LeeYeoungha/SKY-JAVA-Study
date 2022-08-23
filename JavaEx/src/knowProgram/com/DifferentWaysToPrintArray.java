package knowProgram.com;

import java.util.Iterator;

public class DifferentWaysToPrintArray {

	public static void main(String[] args) {

		
		//ex1 for
		/*int arrayA[] = { 10, 20, 30, 40, 50 };
		for (int j = 0; j < arrayA.length; j++) {
			int i = arrayA[j];
			
			System.out.print(i);
			
			if (j < arrayA.length-1) {
				System.out.print(",");
			}
		}
		*/
		
		
		
		
		//ex2 foreach
		int arrayB[] = {10,20,30,40,50};
		for (int el : arrayB) {
			System.out.println(el);/*
			if (el > arrayB.length) {
				System.out.println(",");*/
			}
		}
		
	}


