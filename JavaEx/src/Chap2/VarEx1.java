
// 2_1 VarEx1.java
// ������ �� �����ϰ� �о����.

package Chap2;

public class VarEx1 {
	public static void main(String[] args) {
		int year = 0; // int�� ������ 0 ����
		int age = 14; // int�� ������ 14 ����

		System.out.println(year); // year ��� 
		System.out.println(age);  // age ��� 
		
		year = age + 2000; // year ������ age = 14 + 2000 = 2014 ������ �ʱ�ȭ
		age = age + 1; // age ������ age = 14 + 1 = 15 �� ���� �ʱ�ȭ
		
		System.out.println(year); // �ʱ�ȭ�� �� 2014 ��� 
		System.out.println(age);  // �ʱ�ȭ�� �� 15 ���  ,
		
	}

}
