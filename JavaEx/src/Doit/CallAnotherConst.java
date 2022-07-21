package Doit;

class Person {
	String name;
	int age;

	Person() {
		this("이름없음", 1);		// this 를 사용해 person 생성자 호출 
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noname = new Person();
		System.out.println(noname.name);
		System.out.println(noname.age);
	}
}
