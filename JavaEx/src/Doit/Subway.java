package Doit;

public class Subway {
	
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " 호선을타고 " + passengerCount + " 명이" + money + " 지불하였다.");
	}

}
