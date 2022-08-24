package knowProgram.com;

import java.util.Iterator;
import java.util.Scanner;

public class GUGU {
	
	
	//입력값에 따라 단수가 다름
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("구구단 원하는 숫자를 입력 하시오");
		
		int i = sc.nextInt();
		
		System.out.printf("구구단을 원하는 숫자 입력 %d %n", i);
		
		for (int j = i; j <= i; j++) {
			for (int K = 0; K <= 9; K++) {
			
			System.out.printf("%d * %d = "+i*K+"%n",i,K);
		}
		}
		
	}*/
	
	
	public static void main(String[] args) {
		
		for(int i=2 ; i<=9 ; i++) {
			System.out.printf("%d 단 시작%n",i);
			
		
		
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d ="+i*j+"%n",i,j);
		}
		}
		
	}

}
