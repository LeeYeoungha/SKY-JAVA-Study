package knowProgram.com;

import java.util.Iterator;
import java.util.Scanner;

public class GUGU {
	
	
	//�Է°��� ���� �ܼ��� �ٸ�
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("������ ���ϴ� ���ڸ� �Է� �Ͻÿ�");
		
		int i = sc.nextInt();
		
		System.out.printf("�������� ���ϴ� ���� �Է� %d %n", i);
		
		for (int j = i; j <= i; j++) {
			for (int K = 0; K <= 9; K++) {
			
			System.out.printf("%d * %d = "+i*K+"%n",i,K);
		}
		}
		
	}*/
	
	
	public static void main(String[] args) {
		
		for(int i=2 ; i<=9 ; i++) {
			System.out.printf("%d �� ����%n",i);
			
		
		
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d ="+i*j+"%n",i,j);
		}
		}
		
	}

}
