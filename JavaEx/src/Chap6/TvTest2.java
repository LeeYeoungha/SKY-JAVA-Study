package Chap6;

/*class Tv {
	
	//	Tv의 속성
	String color;			//색상
	boolean power;			//전원상태(on/off)
	int channel;			//채널
	
	// Tv의 기능 
	void power() { power = !power; }
	void channelUp()	{ ++channel; }
	void channlDown()	{ --channel; }
	
}*/


class TvTest2 {
	public static void main(String args[]) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv(); 
		
		System.out.println("t1 channel =" + t1.channel);
		System.out.println("t2 channel =" + t2.channel);
		
		t1.channel = 7;

		System.out.println("t1 channel =" + t1.channel);
		System.out.println("t2 channel =" + t2.channel);
		
	}
}
