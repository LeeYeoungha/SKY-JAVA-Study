package Doit;

public class Taxi {

	String taxiCompany;			//�ý�ȸ��
	int passengerCount;
	int money;

	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;		//�ýù�ȣ�� �Ű������� �޴´�
	}

	public void take(int money) {
		this.money += money;		//this.money :: money = money + money
		passengerCount++;			// passengerCount = passengerCount + 1
	}

	public void showInfo() {
		System.out.println(taxiCompany + " �� �ýø� Ÿ�� " + passengerCount + " ����" + money + " �����Ͽ���.");
	}
}
