package Doit;

public class TakeTrans {

	public static void main(String[] args) {
	// 3 명의 학생을 생성
	  Student studentJames = new Student("James", 5000);   
	  Student studentTomas = new Student("Tomas", 10000);
	  Student studentEdward = new Student("Edward", 25000);
	   
	  Bus bus100 = new Bus(100);
	  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
	  studentJames.showInfo();           // james 정보 출력
	  bus100.showInfo();                // 버스 정보 출력
	  
	  Subway subwayGreen = new Subway("2호선");  
	  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
	  studentTomas.showInfo();                 // Tomas 정보 출력
	  subwayGreen.showInfo();   
	  
	  Taxi taxiCompany = new Taxi("한일운수");
	  studentEdward.takeTaxi(taxiCompany);		//Edward가 100번 택시를 
	  studentEdward.showInfo();				//Edward 정보출력
	  taxiCompany.showInfo();					//택시 정보 출력
	}
}
