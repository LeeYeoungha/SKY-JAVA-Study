package knowProgram.com;

public class ArrayFailed {

	public static void main(String[] args) {

		int arrayB[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int i = 1;
		int x = 5;
		int BLength = arrayB.length; // 16 item
		int ave = arrayB.length / 5; // 3 page

		for (int j = 0; j < ave; j++) { // 3회 순회
			// System.out.print(j); //page 수 출력
			for (int j2 = 0; j2 < BLength; j2++) {
				int B = arrayB[j2];

				if (B == i) {
					for (int j3 = 0; j3 < 5; j3++) {
						System.out.print(arrayB[j3] + ",");
					}
					System.out.println("\n");
					// break;
				}
				if (B == 5) {
					for (int j4 = 0; j4 < 5; j4++) {
						System.out.print(arrayB[j4 + 5] + ",");
						// break;

					}
				}
			}
			// System.out.println("\n");
			break;
		}

	}

}
