package knowProgram.com;

import java.util.Arrays;
import java.util.Scanner;

public class SumofTwoArraysElementsinJava {


	
	
	
/*	Example:-
	array1[] = {10, 20, 30, 40, 50};
	array2[] = {9, 18, 27, 36, 45};


	The resultant array will be,
	array3[] = {19, 38, 57, 76, 95};
	And it was calculated as,
	array3[] = {10+9, 20+18, 30+27, 40+36, 50+45};

	Program to Find Sum of Two Arrays in Java
	
	
	Enter number of elements in first array: 5
	Enter number of elements in second array: 5
	Enter first array elements:
	10 20 30 40 50
	Enter second array elements:
	9 18 27 36 45
	Resultant Array: [19, 38, 57, 76, 95]

	Enter number of elements in first array: 7
	Enter number of elements in second array: 3
	Both array must have same number of elements*/
	
public static void main(String[] args) {
	
	
	int array1[] = {10,20,30,40,50};
	int array2[] = {9, 18, 27, 36, 45};
	int sum = 0;
	
	for (int i = 0; i < array1.length; i++) {
	int resultA1 = array1[i];
	int resultA2 = array2[i];
	//System.out.println(resultA1);
	//System.out.println(resultA2);
	
	sum = resultA1 + resultA2;

	array3[i] = array1[i] + array2[i];
	
	//System.out.println(sum);
	
	int resultA3[] = new int [sum];
	
	
	
	System.out.print(resultA3);
	}
	
	Arrays.toString(resultA3);
	
	
	
	
	for (int i = 0; i < array2.length; i++) {
	int resultA2 = array2[i];
	//System.out.println(resultA2);
	
	sum += resultA2;
	}
	
	//System.out.println(sum);
	
	}
}




//result
/*Program to Find Sum of Two Arrays in Java

import java.util.Scanner;
import java.util.Arrays;

public class TwoArraySum {
  public static void main(String[] args) {

    // create Scanner class object
    Scanner scan = new Scanner(System.in);

    // take number of elements in both array
    System.out.print("Enter number of elements in first array: ");
    int array1size = scan.nextInt();
    System.out.print("Enter number of elements in second array: ");
    int array2size = scan.nextInt();

    // both array must have same number of elements
    if(array1size != array2size) {
      System.out.println("Both array must have "+
                      "same number of elements");
      return; 
    }

    // declare three array with given size
    int array1[] = new int[array1size];
    int array2[] = new int[array1size];
    int array3[] = new int[array1size];

    // take input for array1 elements
    System.out.println("Enter first array elements: ");
    for (int i=0; i<array1.length; i++) {
      array1[i] = scan.nextInt();
    }

    // take input for array2 elements
    System.out.println("Enter second array elements: ");
    for (int i=0; i<array2.length; i++) {
      array2[i] = scan.nextInt();
    }

    // loop to iterate through the array
    for (int i=0; i<array3.length; i++) {
      // add array elements
      array3[i] = array1[i] + array2[i];
    }

    // display the third array
    System.out.println("Resultant Array: " 
        + Arrays.toString(array3));
  }
}*/
	
	
	
	
	 /*public static void main(String[] args) {

		    // create Scanner class object
		    Scanner scan = new Scanner(System.in);

		    // take number of elements in both array
		    System.out.print("Enter number of elements in first array: ");
		    int array1size = scan.nextInt();
		    System.out.print("Enter number of elements in second array: ");
		    int array2size = scan.nextInt();

		    // both array must have same number of elements
		    if(array1size != array2size) {
		      System.out.println("Both array must have "+
		                      "same number of elements");
		      return; 
		    }

		    // declare three array with given size
		    int array1[] = new int[array1size];
		    int array2[] = new int[array1size];
		    int array3[] = new int[array1size];

		    // take input for array1 elements
		    System.out.println("Enter first array elements: ");
		    for (int i=0; i<array1.length; i++) {
		      array1[i] = scan.nextInt();
		    }

		    // take input for array2 elements
		    System.out.println("Enter second array elements: ");
		    for (int i=0; i<array2.length; i++) {
		      array2[i] = scan.nextInt();
		    }

		    // loop to iterate through the array
		    for (int i=0; i<array3.length; i++) {
		      // add array elements
		      array3[i] = array1[i] + array2[i];
		    }

		    // display the third array
		    System.out.println("Resultant Array: " 
		        + Arrays.toString(array3));
		  }
}*/