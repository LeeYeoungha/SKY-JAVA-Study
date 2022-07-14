package Chap4;

import java.util.*;

public class FlowEx4 {

	public static void main(String[] args) {
		
		int score = 0; // 점수를 저장하기 위한 변수 
		char grade = ' '; // 학점을 저장하기 위한 변수. 공백으로 초기화 한다.

		
		System.out.print("점수를 입력 하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력 받은 숫자를 score 에 저장
		
		if(score >= 90) { // score 가 90 보다같거나 크면 A학점 
			grade = 'A';
		}
		else if(score >= 80) { // score 가 80보다 같거나 크면 B학점 
			grade = 'B';
		}
		else if(score >= 70) { // score 가 70보다 같거나 크면 C학점 
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		
		System.out.printf("당신의 학점은 %s 입니다.%n", grade);
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		
		
	}
	
}
