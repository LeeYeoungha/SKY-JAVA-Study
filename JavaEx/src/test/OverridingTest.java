package test;

class woman {
	public String name;
	public int age;
	public void info() {
		System.out.println("woman name : " + name + " / age : " + age);
	}
}



class job extends woman{
	String job;
	
	public void info() {
		super.info();
		System.out.println("job :"+ job);
	}
}


public class OverridingTest {

	public static void main(String[] args) {
		
		job j = new job();
		j.name = "yuri";
		j.age = 35;
		j.job = "Programer";
		j.info();
	}
	
}
