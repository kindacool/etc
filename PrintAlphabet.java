package p2022_07_14;

public class PrintAlphabet {

	public static void main(String[] args) {

//		A
//		C   B
//		D   E   F
//		J   I   H   G
//		K   L   M   N   O
		
		final int len = 5;
		char startA = 'A';
		char[][] c = new char[5][5];

		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) { // o
				for (int j = 0; j < len; j++) {
					if (i >= j) {
						c[i][j] = startA++;
					}
				}
			} else if (i % 2 == 1) {
				for (int j = i; j >= 0; j--) {
					if (i >= j) {
						c[i][j] = startA++;
					}
				}
			}
		}

		// 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}