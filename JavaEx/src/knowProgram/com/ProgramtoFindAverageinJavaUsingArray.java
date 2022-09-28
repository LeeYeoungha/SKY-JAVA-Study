package knowProgram.com;

import java.util.Scanner;

public class ProgramtoFindAverageinJavaUsingArray {





/*배열 |을 사용하여 Java에서 평균을 찾는 프로그램 자바의 배열 프로그램 - 6 | 이전 Java 프로그램에서는 Java에서 배열 요소의 합계를 찾습니다. 이제이 게시물에서는 Java에서 배열의 평균을 찾는 방법에 대해 설명합니다.

프로그램 설명 : - Java 프로그램을 작성하여 숫자의 평균을 계산하거나 주어진 배열의 요소 평균을 찾으십시오.


Java 배열에 주어진 숫자의 평균을 계산하려면 먼저 합계를 계산 한 다음 합계 / number_of_array_elements을 사용하여 평균을 찾아야합니다.

예:-
array = {10, 20, 30, 40, 50};
배열 요소의 합 = 10 + 20 + 30 + 40 + 50 = 150
이고 숫자의 평균 = 150 / 5 = 30[]

평균을 찾기 위해 Java 프로그램을 개발하는 절차,

1) 숫자를 입력으로 가져 와서 배열
에 저장 2) 합계 변수를 선언하고 0으로 초기화
3) 배열을 반복하고 sum 변수에 숫자를 추가하고 합계 변수 (예 : sum = sum + array)를 업데이트하십시오 (예 : sum = sum + array)4) 평균, 평균 계산 / 합계 / number_of_array_elements
5)
평균 값 표시[i]

배열의 평균을 계산하는 Java 프로그램*/
	
/*	public static void main(String[] args) {
		
		int arrayA[] = {10,20,30,40,50};
		int sum = 0;
		for (int i = 0; i < arrayA.length; i++) {
			int j = arrayA[i];
			sum += j;
		}
		int avg = sum / 5;
		System.out.println("avg=" + avg);
	}
	
	
}*/
	
	//result
	/*public class ArrayAverage {
		  public static void main(String[] args) {

		    double array[] = {10, 20, 30, 40, 50};
		    // declare sum variable, & initialize with 0
		    double sum = 0.0;
		    // declare average variable
		    double avg = 0.0;

		    // loop to iterate the array
		    for (int i=0; i<array.length; i++) {
		      // add numbers
		      sum = sum + array[i];
		    }

		    // calculate the average value
		    avg = sum/array.length;

		    // display result
		    System.out.println("Average: " + avg );
		  }
		}*/
	
	
	
	//이 Java 프로그램에서는 값을 하드 코딩했습니다. 
	//이제 배열 요소를 최종 사용자의 입력으로 사용하여 배열의 평균을 계산하는 또 다른 Java 프로그램을 개발합시다. 
	//입력 값을 얻으려면 Scanner 클래스 또는 BufferedReader 클래스를 사용할 수 있지만 여기서는 Scanner 클래스를 사용합니다. 
	//스캐너 클래스 메서드를 사용하려면 java.util.Scanner 클래스를 가져와야합니다.
	
	//Enter Number of elements: 5
	//Enter array elements:
	//10 20 30 40 50
	//Average: 30.0
	
	
	
/*	public static void main(String[] args) {

		System.out.println("Enter Number of elements: ");
		
		Scanner sc = new Scanner(System.in);
		int scNum = sc.nextInt();
		int arrayB[] = new int[scNum];
		double sum = 0.0;
		double avg = 0.0;
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i < scNum; i++) {
			
			arrayB[i] = sc.nextInt();
			
			sum += arrayB[i];
		}
		
		avg = sum/scNum;
		
		System.out.println(sum + "/" + scNum +"="+avg);
		System.out.println("Average:"+avg);
		//10 20 30 40 50
		//Average: 30.0
		
	}
}
	*/
	
	//re1
	//Enter Number of elements: 5
	//Enter array elements:
	//10 20 30 40 50
	//Average: 30.0
	
	
	public static void main(String[] args) {
		System.out.println("Enter Number of elements:");
		Scanner sc = new Scanner(System.in);
		int inputSc = sc.nextInt();
		
		System.out.println("Enter array elements:");
		
		double arrayB[] = new double [inputSc];
		double sum = 0.0;
		double avg = 0.0;
		
		
		
		for (int i = 0; i < inputSc; i++) {
			arrayB[i] = sc.nextDouble();
			
			sum+=arrayB[i];
		}
		
		avg = sum / inputSc;
		
		System.out.println("Average:" + avg );
		
	
	}
	
}
	
	
	
	
	
	//result
	//Java program to calculate the average of numbers by taking inputs from end-user
	/*public static void main(String[] args) {

	    // create Scanner class object
	    Scanner scan = new Scanner(System.in);

	    // take total number of elements
	    System.out.print("Enter number of elements: ");
	    int size = scan.nextInt();

	    // declare an array with given size
	    double array[] = new double[size];
	    // declare sum variable, & initialize with 0
	    double sum = 0.0;
	    // declare average variable
	    double avg = 0.0;

	    // take numbers and store them to the array
	    System.out.println("Enter array elements: ");
	    for (int i=0; i<array.length; i++) {
	      array[i] = scan.nextDouble();
	      // add numbers
	      sum = sum + array[i];
	    }

	    // calculate the average value
	    avg = sum/array.length;

	    // display result
	    System.out.println("Average: " + avg );
	  }
	}
	*/
	
	
	
	