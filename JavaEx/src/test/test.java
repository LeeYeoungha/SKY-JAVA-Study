package test;

import java.lang.reflect.Constructor;

//class test {
	
	/*
	 * public static void main(String[] args) { System.out.println(10 + 10);
	 * System.out.println(20 + 20); }
	 */
	
	
	/*
	 * public static void sum(int left, int right) { System.out.println(left +
	 * right); }
	 * 
	 * 
	 * public static void main(String args[]) { sum(10,10); }
	 */
	
	/*
	 * public static void sum(int left, int right) { System.out.println(left +
	 * right); }
	 * 
	 * 
	 * public static void avg(int left, int right) { System.out.println((left +
	 * right) / 2); }
	 * 
	 * public static void main(String args[]) {
	 * 
	 * int right , left;
	 * 
	 * left = 20; right = 20; sum(left, right); avg(left, right);
	 * 
	 * 
	 * }
	 */
	/*
	 * int left, right;
	 * 
	 * public void setOperand(int left, int right) { this.left = left; this.right =
	 * right; }
	 * 
	 * public void sum() { System.out.println(this.left + this.right); }
	 * 
	 * public void avg() { System.out.println((this.left + this.right) / 2); }
	 * 
	 * 
	 * public static void main(String args[]) {
	 * 
	 * test t1 = new test(); t1.setOperand(10,20); t1.sum(); t1.avg(); }
	 */
	/* } */
/*
int left, right;

public void setOperand(int left, int right) {
	this.left = left;
	this.right = right;
}

public void sum() {
	System.out.println(left + right);
}


public void avg() {
	System.out.println((left + right) / 2);
}

public static void main(String args[]) {
	test t1 = new test();
	t1.setOperand(10, 10);
	t1.sum();
	t1.avg();
	
	test t2 = new test();
	t2.setOperand(20, 20);
	t2.sum();
	t2.avg();
	
	test t3 = new test();
	t3.setOperand(10, 10);
	t3.sum();
	t3.avg();
	
}
}
*/

/*	int left;
	int right;
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left + right) / 2);
	}
	

	public static void main(String args[]) {
		
		test t1 = new test();
		t1.setOperand(10, 20);
		t1.sum();
		t1.avg();
	}
}
*/

/*
 * int left, right;
 * 
 * public void setOperand(int left, int right) { this.left = left; this.right =
 * right; }
 * 
 * public void sum() { System.out.println(left + right); }
 * 
 * public void avg() { System.out.println((left + right) / 2); }
 * 
 * public static void main(String args[]) {
 * 
 * }
 */
	
/*
 * static double pi = 3.14; static int base = 0; int left, right;
 * 
 * public void setOperand(int left, int right) { this.left = left; this.right =
 * right; }
 * 
 * public void sum(int left, int right) { System.out.println(left + right +
 * base); }
 * 
 * public void avg(int left, int right) { System.out.println((left + right +
 * base) / 2); }
 * 
 * public static void main(String args[]) { test t1 = new test();
 * 
 * test.base = 10; t1.sum(20, 20); t1.avg(20, 20); System.out.println(t1.pi);
 * 
 * System.out.println(test.pi);
 * 
 * }
 * 
 * 
 */
	/*
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
	
	
	public class text1 {

			public static void main(String[] args) {
			test.sum(10,10);			
			test.avg(10,10);
		}
	}
	
}*/
	 
	/*
	 * class C1 { static int static_variable = 1; int instance_variable = 2; static
	 * void static_static() { System.out.println(static_variable); }
	 * 
	 * static void static_instance() { // Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ���� �� �� ����.
	 * //System.out.println(instance_variable); }
	 * 
	 * 
	 * void instance_static() { // �ν��Ͻ� �޼ҵ忡���� Ŭ���� ������ ���� �� �� �ִ�.
	 * System.out.println(static_variable); }
	 * 
	 * 
	 * void instance_instance() { System.out.println(instance_variable); } }
	 * 
	 * 
	 * public class test { public static void main(String[] args) { C1 c = new C1();
	 * // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ���� // �ν��Ͻ� �޼ҵ尡 ���� ������ ���� -> ����
	 * c.static_static(); // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ���� // ���� �޼ҵ尡 �ν��Ͻ� ������ ���� ->
	 * ���� c.static_instance(); // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ���� // �ν��Ͻ� �޼ҵ尡 Ŭ���� ������
	 * ���� -> ���� c.instance_static(); // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ���� // �ν��Ͻ� �޼ҵ尡
	 * �ν��Ͻ� ������ ���� -> ���� c.instance_instance(); // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ���� //
	 * Ŭ���� �޼ҵ尡 Ŭ���� ������ ���� -> ���� C1.static_static(); // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
	 * // Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ���� C1.static_instance(); // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ����
	 * -> ���� //C1.instance_static(); // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
	 * //C1.instance_instance(); } }
	 */
	 
	 

	/*
	 * public class test { static int i;
	 * 
	 * static void a() { i = 0; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * for(int i=0; i<=10; i++) { a(); System.out.println(i); } } }
	 */


	/*
	 * class tete {
	 * 
	 * int left, right;
	 * 
	 * public void setOperand(int left, int right) { this.left = left; this.right =
	 * right; }
	 * 
	 * 
	 * public void sum() { System.out.println(left + right); }
	 * 
	 * public void avg() { System.out.println((left + right) / 2); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public class test { public static void main(String[] args) {
	 * 
	 * tete t1 = new tete(); t1.setOperand(10, 10); t1.sum(); t1.avg();
	 * 
	 * } }
	 */



	/*
	 * 
	 * 
	 * class Calculator {
	 * 
	 * int left, right;
	 * 
	 * public void setOperand(int left, int right) { this.left = left; this.right =
	 * right; }
	 * 
	 * public void sum() { System.out.println(left + right); }
	 * 
	 * public void avg() { System.out.println((left + right) / 2); } }
	 * 
	 * class SubstractionableCalculator extends Calculator { public void substract()
	 * { System.out.println(this.left - this.right); } }
	 * 
	 * 
	 * public class test { public static void main(String[] args) {
	 * SubstractionableCalculator c1 = new SubstractionableCalculator();
	 * c1.setOperand(10,20); c1.sum(); c1.avg(); c1.substract(); } }
	 * 
	 */


	/*
	 * class calculator {
	 * 
	 * int left, right;
	 * 
	 * public void setOperand(int left, int right) { this.left = left; this.right =
	 * right; }
	 * 
	 * public void sum() { System.out.println(left + right); }
	 * 
	 * }
	 * 
	 * 
	 * class extendTest extends calculator { public void min() {
	 * System.out.println(left - right); } }
	 * 
	 * 
	 * public class test{ public static void main(String[] args) { extendTest t1 =
	 * new extendTest(); t1.setOperand(10,10); t1.sum(); t1.min(); } }
	 */


	/*
	 * class calculator { int left, right;
	 * 
	 * public void setOperand(int left, int right) { this.left = left; this.right =
	 * right; }
	 * 
	 * public void sum() { System.out.println(left + right); } }
	 * 
	 * 
	 * class calculatorSumExtend extends calculator { public void min() {
	 * System.out.println(left - right); }
	 * 
	 * }
	 * 
	 * public class test{
	 * 
	 * public static void main(String[] args) { calculatorSumMinAvg cs1 = new
	 * calculatorSumMinAvg(); cs1.setOperand(10,20); cs1.sum(); cs1.min();
	 * cs1.avg(); cs1.test(); }
	 * 
	 * }
	 * 
	 * class calculatorSumMin extends calculatorSumExtend { public void avg() {
	 * System.out.println((left+right)/2); } }
	 * 
	 * 
	 * class calculatorSumMinAvg extends calculatorSumMin { public void test() {
	 * System.out.println("left"); } }
	 */

	/*
	 * public class test {
	 * 
	 * public test() {} public test(int param1) {}
	 * 
	 * 
	 * public static void main(String[] args) { test t1 = new test(); } }
	 */



	/*
	 * 
	 * class calculator{ int left, right;
	 * 
	 * public void setOperand(int left, int right) { this.left = left; this.right =
	 * right; }
	 * 
	 * public void sum() { System.out.println(left + right); }
	 * 
	 * public void avg( ) { System.out.println((left + right) / 2); } }
	 * 
	 * 
	 * class SubstractioableCalculator extends calculator {
	 * 
	 * public void min() { System.out.println(left - right); }
	 * 
	 * }
	 * 
	 * 
	 * public class test{ public static void main(String[] args) {
	 * SubstractioableCalculator sc1 = new SubstractioableCalculator();
	 * sc1.setOperand(10, 20); sc1.sum(); sc1.avg(); sc1.min(); } }
	 * 
	 */





