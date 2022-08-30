package knowProgram.com;

public class arrayLoop1 {

	public static void main(String[] args) {

		int arrayB[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int x = 5;
		int C = 0;
		int ave = arrayB.length / x; // 3 page

		for (int j = 0; j < ave; j++) { // 3

			for (int j3 = 0; j3 < x; j3++) {
				int Aresult = arrayB[j3 + C];
				System.out.print(Aresult + ",");

			}
			System.out.println("\n");
			C = C + x;

		}
	}
}


