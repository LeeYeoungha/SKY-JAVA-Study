package Chap5;

import java.net.MulticastSocket;

public class ArrayEx4 {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc 와 num 을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
	
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc을 배열num의 첫번쨰 위치부터 배열 abc의 길이많큼 복사
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number의 인덱스 6위치에 3개를 복사
		
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
	}	
}
