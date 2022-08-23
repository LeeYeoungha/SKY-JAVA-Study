package test;
//이름이 cat인 메서드가 총 3개가 있지만 각각 매개변수의 유형과 개수가 다른게 보이시죠?
class OverloadingTest {
	
	void cat() {
		System.out.println("매개변수 없음");
	}
	
	void cat(int a, int b) {
		System.out.println("매개변수 있음" + a + b);
	}
	
	void cat(String c) {
		System.out.println("매개변수 String C" + c);
	}

}


public class OverTest {
//그리고 호출 시 매개변수를 입력하면 호출 매개변수에 따라 매칭되어 함수를 실행시켜 줍니다.
	public static void main(String[] args) {
	
	OverloadingTest ot = new OverloadingTest();
	
	ot.cat();
	ot.cat(10, 20);
	ot.cat("테스트");
	}
}