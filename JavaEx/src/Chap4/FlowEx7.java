

package Chap4;

import java.util.*;

public class FlowEx7 {

	public static void main(String[] args) {
		
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� user �� ���� 
		int com = (int) (Math.random() * 3) + 1; // 1,2,3�� �ϳ��� com �� �����
		
		System.out.printf("user = %d, com = %d%n%n", user , com);
		System.out.println("user �� " + user + '\n');
		System.out.println("com �� " + com + '\n');
		
		switch(user-com) {
		case 2:
		case -1:
			System.out.println("com win");
			break;
		//case 
		}
		
			
	}
	
}
