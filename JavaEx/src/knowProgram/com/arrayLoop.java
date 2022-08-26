package knowProgram.com;

public class arrayLoop {

	public static void main(String[] args) {

		int arrayB[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int i = 0;
		int x = 5;
		int C = 0;
		int BLength = arrayB.length; // 16 item
		int ave = arrayB.length / 5; // 3 page

		for (int j = 0; j < ave; j++) { //3
			

			for (int j2 = 0; j2 < BLength; j2++) {
				
				if (j2 == C) {
					for (int j3 = 0; j3 < x; j3++) {
						int Aresult = arrayB[j3+C];
						System.out.print(Aresult + ",");
					}
					// break;
					
				}

			}
			System.out.println("\n");
			C = C + x;
			//break;

		} 
	}
}
