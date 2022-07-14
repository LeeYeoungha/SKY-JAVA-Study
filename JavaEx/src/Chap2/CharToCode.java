package Chap2;

public class CharToCode {

	public static void main(String[] args) {

		char ch = 'A'; // char ch = 65;
		int code = (int) ch; // ch 에 저장된 값을 int 타입으로 변환 하여 저장

		System.out.printf("%c=%d(%#X)%n", ch, code, code);

		char hch = '가'; // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);

	}

}
