
public class ArrayLoopTest {

	public static void main(String[] args) {
		int[] arrayA = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150 };
		int pageSize = arrayA.length / 5; // 3
		int index = 0;

		for (int i = 0; i < pageSize; i++) {

			// for(int j = 0 ; j < 4; j++) {

			for (int k = 0; k < 5; k++) {

				System.out.print(arrayA[index] + ",");

				index = index + 1;
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		// }
	}

}
