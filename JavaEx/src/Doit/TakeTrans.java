package Doit;

public class TakeTrans {

	public static void main(String[] args) {
	// 3 ���� �л��� ����
	  Student studentJames = new Student("James", 5000);   
	  Student studentTomas = new Student("Tomas", 10000);
	  Student studentEdward = new Student("Edward", 25000);
	   
	  Bus bus100 = new Bus(100);
	  studentJames.takeBus(bus100);     // james�� 100�� ������ Ž
	  studentJames.showInfo();           // james ���� ���
	  bus100.showInfo();                // ���� ���� ���
	  
	  Subway subwayGreen = new Subway("2ȣ��");  
	  studentTomas.takeSubway(subwayGreen);  // Tomas�� 2ȣ���� Ž
	  studentTomas.showInfo();                 // Tomas ���� ���
	  subwayGreen.showInfo();   
	  
	  Taxi taxiCompany = new Taxi("���Ͽ��");
	  studentEdward.takeTaxi(taxiCompany);		//Edward�� 100�� �ýø� 
	  studentEdward.showInfo();				//Edward �������
	  taxiCompany.showInfo();					//�ý� ���� ���
	}
}
