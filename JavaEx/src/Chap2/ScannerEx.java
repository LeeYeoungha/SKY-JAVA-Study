package Chap2;

import java.util.*; //Scanner 사용하기 위해 추가 

public class ScannerEx {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in); // 클래스명 + 객체변수명 = new 클래스명;
				
		System.out.print("두자리 정숙를 하나 입력해 주세요.>");
		String input = scanner.nextLine(); // nextLine() 변환없이 숫자로 바로 입력받는 method
		int num = Integer.parseInt(input); //Integer.parseInt(문자열) 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
	}

}
