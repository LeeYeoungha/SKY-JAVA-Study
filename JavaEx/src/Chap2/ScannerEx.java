package Chap2;

import java.util.*; //Scanner ����ϱ� ���� �߰� 

public class ScannerEx {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in); // Ŭ������ + ��ü������ = new Ŭ������;
				
		System.out.print("���ڸ� ������ �ϳ� �Է��� �ּ���.>");
		String input = scanner.nextLine(); // nextLine() ��ȯ���� ���ڷ� �ٷ� �Է¹޴� method
		int num = Integer.parseInt(input); //Integer.parseInt(���ڿ�) �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� : " + input);
		System.out.printf("num=%d%n", num);
	}

}
