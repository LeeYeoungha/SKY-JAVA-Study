package Chap6;


	class Tv {
		//Tv �� �Ӽ� �������
		String color;			//����
		boolean power;			//�������� (On/off)
		int channel;			//ä��
		
		// Tv�� ���(�޼���)
		void power()	{ power = !power; }	//TV�� �Ѱų� ���� ����� �ϴ� �޼���
		void channelUp()		{	++channel; }	//TV�� ä���� ���̴� ����� �ϴ� �޼���
		void channelDown() { --channel;	}			//TV�� ä���� ���ߴ� ����� �ϴ� �޼���
		
	}
	
	class TvTest {
		public static void main(String args[])	{
			Tv t;							//TV�ν��Ͻ��� �����ϱ����� t�� ����
			t = new Tv();
			t.channel = 7;
			t.channelDown();
			System.out.println(t.channel);
		}
	}
	

