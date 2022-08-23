package knowProgram.com;

public class FindLengthOfArrayInJava {

public static void main(String[] args) 

//ex1
/*	{

	int arrayA[] = { 10, 20, 30, 40, 50 };
	
		System.out.println("Array = {" + arrayA[0] +","+ arrayA[1] +","+ arrayA[2] +","+ arrayA[3] +","+ arrayA[4] + "}");	
		System.out.print("The length of the given array = ");
		System.out.println(arrayA.length);

	}*/

//ex2
{
	int arrayB[] = {10,20,30,40,50};	
	System.out.print("Array = ");
	
	for (int i = 0; i < arrayB.length ; i++) {
		System.out.print("{"+arrayB[i]+"}");
		if (i < arrayB.length-1) {
			System.out.print(",");
		}
	}
	System.out.println(" ");
	System.out.print("The length of the given array = ");
	System.out.println(arrayB.length);
}

}
