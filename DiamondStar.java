package p2022_07_11;

public class DiamondStar {

	public static void main(String[] args) {

		final int lineNum = 10;
		for (int i = 1; i < lineNum; i++) {

			for (int j = 1; j <= lineNum - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= lineNum; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * lineNum - 1; k >= 2 * i - 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
