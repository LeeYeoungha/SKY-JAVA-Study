
// 2_1 VarEx1.java
// 변수에 값 저장하고 읽어오기.

package Chap2;

public class VarEx1 {
	public static void main(String[] args) {
		int year = 0; // int형 변수에 0 선언
		int age = 14; // int형 변수에 14 선언

		System.out.println(year); // year 출력 
		System.out.println(age);  // age 출력 
		
		year = age + 2000; // year 변수에 age = 14 + 2000 = 2014 값으로 초기화
		age = age + 1; // age 변수에 age = 14 + 1 = 15 값 으로 초기화
		
		System.out.println(year); // 초기화한 값 2014 출력 
		System.out.println(age);  // 초기화한 값 15 출력  ,
		
	}

}
