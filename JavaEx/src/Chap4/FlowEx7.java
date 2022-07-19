

package Chap4;

import java.util.*;

public class FlowEx7 {

	public static void main(String[] args) {
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 user 에 저장 
		int com = (int) (Math.random() * 3) + 1; // 1,2,3중 하나가 com 에 저장됨
		
		System.out.printf("user = %d, com = %d%n%n", user , com);
		System.out.println("user 는 " + user + '\n');
		System.out.println("com 는 " + com + '\n');
		
		switch(user-com) {
		case 2:
		case -1:
			System.out.println("com win");
			break;
		//case 
		}
		
			
	}
	
}
