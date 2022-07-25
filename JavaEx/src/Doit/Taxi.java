package Doit;

public class Taxi {

	String taxiCompany;			//택시회사
	int passengerCount;
	int money;

	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;		//택시번호를 매개변수로 받는다
	}

	public void take(int money) {
		this.money += money;		//this.money :: money = money + money
		passengerCount++;			// passengerCount = passengerCount + 1
	}

	public void showInfo() {
		System.out.println(taxiCompany + " 의 택시를 타고 " + passengerCount + " 명이" + money + " 지불하였다.");
	}
}
