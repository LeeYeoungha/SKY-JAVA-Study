package knowProgram.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

	/*	�迭 ����� ���� ã�� ����,
		1) �ϳ��� �迭�� �����ɴϴ�.
		2) �ϳ��� sum ������ �����ϰ� 0���� �ʱ�ȭ�Ͻʽÿ�.
		3) ������ ����Ͽ� �־��� �迭�� ��Ҹ� �ݺ��մϴ�.
		4) sum ������ ��Ҹ� �߰��ϰ� ��� ���� sum ������ �ٽ� �Ҵ��մϴ�. (��, �հ� = �հ� + arr)
		5) �迭�� ��� ��Ұ� sum ������ �߰��Ǹ� ����� ǥ���մϴ�.[i]
		
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

	
	
	// �Է°��� �޾� SUM
	
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
		
		// �Է°��� �޾� SUM
		
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
	
	
	
	//re4
	
	// �Է°��� �޾� SUM
	
	//Enter number of elements:
	//Enter array elements: 
	//Sum of array elements= 
	
	/*public static void main(String[] args) {

		int i;
		
		
		
		System.out.println("Enter number of elements:");
		
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int arrayD[] = new int[max];
		int sum = 0;
		System.out.println("Enter array elements: ");
		
		
		for (int j = 0; j < max; j++) {
		
		arrayD[j] = sc.nextInt(); 
		
		sum=sum+arrayD[j];
		
		}
		
		System.out.println("Sum of array elements= "+sum);
		
	}
}*/

	
	
	//re5
	
			// �Է°��� �޾� SUM
			
			//Enter number of elements:
			//Enter array elements: 
			//Sum of array elements= 
		
	/*	public static void main(String[] args) {
			
			int sum = 0;
			int j= 0;
			System.out.println("Enter number of elements:");
			
			Scanner sc = new Scanner(System.in);
			int maxNum = sc.nextInt();
			
			int arrayD[] = new int[maxNum];
			
			for (int i = 0; i < maxNum; i++) {
				
				arrayD[i] = sc.nextInt();
				
				sum = sum+=arrayD[i];
			}
			System.out.println("Sum of array elements= " + sum);
			
			
		}
	}
		//re6
		// �Է°��� �޾� SUM
		//Enter number of elements:
		//Enter array elements: 
		//Sum of array elements= 
	
	
	
	public static void main(String[] args) {
	
		
		System.out.println("Enter number of elements:");
		
		Scanner sc = new Scanner(System.in);
		int scNum = sc.nextInt();
		int arrayE[] = new int [scNum];
		int sum = 0;
		System.out.println("Enter array elements: ");
		
		for (int i = 0; i < scNum; i++) {
		arrayE[i] = sc.nextInt();	
		
		sum += arrayE[i];
		
		}
		System.out.println("Sum of array elements= " + sum);
	}
}*/
	


	//re7
	// �Է°��� �޾� SUM
	//Enter number of elements:
	//Enter array elements: 
	//Sum of array elements= 

	/*public static void main(String[] args) {
		//1)
		System.out.println("Enter number of elements:");
		Scanner sc = new Scanner(System.in);
		int scNum = sc.nextInt();
		int sum = 0;
		
		System.out.println("Enter array elements: :");
		
		int []arrayF = new int[scNum];
		
		for (int i = 0; i < scNum; i++) {
			
			arrayF[i] = sc.nextInt();
			
			sum += arrayF[i];
			
		}
		
		System.out.println("Sum of array elements= :" + sum);
		
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
	}
	
}*/


/*
	//re8
	// �Է°��� �޾� SUM
	//Enter number of elements:
	//Enter array elements: 
	//Sum of array elements= 
	
	public static void main (String[] args) {
		
		System.out.println("Enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int scNum = sc.nextInt();
		int sum = 0;
		
		int arrayH[] = new int[scNum];

		

		System.out.println("Enter array elements: ");
		for (int i = 0; i < scNum; i++) {
			arrayH[i] = sc.nextInt(); 
			
			sum += arrayH[i];
		}
		
		System.out.println("Sum of array elements= " + sum);
		
		
	}
	
}
	*/
	
	
	
	
	
	

	
	//���� ���α׷��� ���� ���� : - �迭 ����� ���� ���α׷� ���� �ð��� �˷����մϴ�. �迭 ����� ���� �����̸� ������ ������ ������ ��� �������� Ŀ�� �� �����Ƿ� �÷��� Ŭ������ ������ �޾ƾ��մϴ�.
	// output
	// Sum = 150
	
	
	
/*	public static void main(String[] args) {
		
		
		List<Integer> arrayG = new ArrayList<Integer>();

		arrayG.add(10);
		arrayG.add(20);
		arrayG.add(30);
		arrayG.add(40);
		arrayG.add(50);
		
		int sum = 0;
		
		for (int i : arrayG ) {
			
			sum += i;
		}
		
		
		System.out.println("Sum =" + sum);
	
	}
	
}*/
	
	
	
	
	
	
	
	
	
	
	
	

	
	//���� ���α׷��� ���� ���� : - �迭 ����� ���� ���α׷� ���� �ð��� �˷����մϴ�. �迭 ����� ���� �����̸� ������ ������ ������ ��� �������� Ŀ�� �� �����Ƿ� �÷��� Ŭ������ ������ �޾ƾ��մϴ�.
	// output
	// Sum = 150
	//re2
	
	/*public static void main(String[] args) {
		
	List<Integer> arrayD = 	new ArrayList<Integer>();
	
	arrayD.add(10);
	arrayD.add(20);
	arrayD.add(30);
	arrayD.add(40);
	arrayD.add(50);
	
	int sum = 0;
	
	for (int i : arrayD) {
		sum+= i;
	}
	System.out.println("sum =" + sum);
	}
}

	*/

	
	
	
	
	//���� ���α׷��� ���� ���� : - �迭 ����� ���� ���α׷� ���� �ð��� �˷����մϴ�. �迭 ����� ���� �����̸� ������ ������ ������ ��� �������� Ŀ�� �� �����Ƿ� �÷��� Ŭ������ ������ �޾ƾ��մϴ�.
	// output
	// Sum = 150
	//re3
	
	/*
	public static void main(String[] args) {

		List<Integer> arrayI = new ArrayList<Integer>();
			
			arrayI.add(10);
			arrayI.add(20);
			arrayI.add(30);
			arrayI.add(40);
			arrayI.add(50);
		
			int sum = 0;
			
		for (int i : arrayI) {
			sum += i;
		}
		System.out.println("sum=" + sum);
	}
}*/
	
	
	//-=-----------------------------------------------------------------
	//����                                    
	//re6
	// �Է°��� �޾� SUM
	//Enter number of elements:
	//Enter array elements: 
	//Sum of array elements= 
	
	
/*	public static void main(String[] args) {

		System.out.println("Enter number of elements:");
		
		Scanner sc = new Scanner(System.in);
		int scInput = sc.nextInt();
		int arrayJ[] = new int[scInput];
		int sum = 0;
		
		System.out.println("Enter array elements: ");
		
		for (int i = 0; i < scInput; i++) {
			arrayJ[i] = sc.nextInt();
			
			sum += arrayJ[i];
		}
		
		
		System.out.println("Sum of array elements=" + sum);
		
		
	}
}
	*/
	
/*	public static void main(String[] args) {

		List<Integer>arrayK = new ArrayList<Integer>();

		arrayK.add(10);
		arrayK.add(20);
		arrayK.add(30);
		arrayK.add(40);
		arrayK.add(50);
		
		int sum = 0;
		
		for (int i : arrayK) {
			sum += i;
		}
		System.out.println(sum);
	}
}
	*/
	
		//����                                    
		//re6
		// �Է°��� �޾� SUM
		//Enter number of elements:
		//Enter array elements: 
		//Sum of array elements= 
	
	public static void main(String[] args) {
		
		
		
		//1)
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number of elements:");
		int index = sc.nextInt();
		int arrayH[] = new int[index];
		int sum = 0;
		
		
		//2)
		System.out.println("Enter array elements:");
				
		for (int i = 0; i < arrayH.length; i++) {
			arrayH[i] = sc.nextInt();
			
			sum += arrayH[i];
		}
		
		//3)
		System.out.println("Sum of array elements=" + sum);
		
	}
	
	
	
}
	