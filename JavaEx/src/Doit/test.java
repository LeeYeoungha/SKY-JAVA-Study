package Doit;

/*
 * public class test {
 * 
 * public static void main(String[] args) { int year = 2018;
 * 
 * }
 * 
 * }
 */

/*
 * public class test{ public static void main(String[] args) { int age = 10;
 * System.out.println(age); } }
 */

/*
 * public class test { public static void main(String[] args) {
 * 
 * int i = 0;
 * 
 * for(i = 0 ; i <= 10 ; i++) { System.out.println("안녕하세요" + i); }
 * 
 * 
 * } }
 */

/*
public class test {
	public static void main(String[] args) {

		int i = 10;
		int r = 20;

		int sum = add(i, r);
		System.out.println(i + "+" + r + "=" + sum);
	}

	private static int add(int a, int b) {
		int result = a + b;
		return result;
	}

}
 
*/

// 사칙연산
/*public class test {
	public static void main(String[] args) {
		int left, right;
		
		left = 20;
		right = 20;
		
		int sum = add(left, right);
		System.out.println(sum);
		
		int min = min(left, right);
		System.out.println(min);
	}
	
	private static int add(int a, int b) {
		int result = a + b;
		return result ;
	}
	
	private static int min(int a, int b) {
		int result = a-b;
		return result ;
	}
}*/

/*
class calculator {
	
	int left, right;
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	
}

public class test {
	public static void main(String[] args) {
		
		calculator c1 = new calculator();
		c1.setOperand(10,10);
		c1.sum();
		
	}
}

*/
/*
public class test {
	public static void main(String[] args) {
		int left, right;
		
		left = 20;
		right = 20;
		
		int sum = add(left,right);
		System.out.println(sum);
	}
	
	private static int add(int a, int b) {
		int result = a+b;
		return result;
	}
	
}

*/

/*
public class test{
	int studendId;
	String studentName;
	int grade;
	String adress;
	
	public String getStudentName() {
		return studentName;
	
	}
	
		public void setStudendName(String name) {
			studentName = name;
		}
	
	public static void main(String[] args) {
		test t1 = new test();
		t1.studentName = "AHN";
		
		System.out.println(t1.studentName);
		System.out.println(t1.getStudentName());
	}
	
}

*/



// 나이 40 이름 james 결혼했고 자식 셋 
// 나이 이름 결혼ㅇ부 자녀수
/*
public class test {
	
	int age = 40;
	String name = "James";
	String Marriage = "Y";
	int child = 3;
	
	
	public static void main(String[] args) {

		test t1 = new test();
		
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.Marriage);
		System.out.println(t1.child);
	}
	

}*/




// 생성자
/*class person{
	
	String name;
	float height;
	float weight;
	
	public person() {} // 디폴트 생성자
	  
}

public class test{
	public static void main(String[] args) {
		person personLee = new person();
	}
}
*/
/*

public class test {
	String name;
	float height;
	float weight;

public test(String pname) {
	name = pname;
}

public test () {}

}

class test1 {
	public static void main(String[] args) {
		test t1 = new test();
	}
}*/



public class test {
	String name;
	float height;
	float weight;
	
	public test() {}
	
	public test(String pname) {
		name = pname;
	}
	
	public test(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}


