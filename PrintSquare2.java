package p2022_07_13;

public class PrintSquare2 {

	public static void main(String[] args) {

//		   1   2   3   4   5
//		   5   1   2   3   4
//		   4   5   1   2   3
//		   3   4   5   1   2
//		   2   3   4   5   1

		final int len = 5;
		int[][] num = new int[5][5];

		for (int i = 0; i < len; i++) {

			for (int j = 0; j < len; j++) {

				if (j + 1 - i <= 0) {
					num[i][j] = (j + 1) - i + 5;
				} else {
					num[i][j] = (j + 1) - i;
				}

			}

		}

		// 출력
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
