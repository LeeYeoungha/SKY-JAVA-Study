/*package Doit;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}

*/

package Doit;

public class Student{
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + " " + money);
	}
}