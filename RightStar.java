package p2022_07_08;

public class RightStar {

	public static void main(String[] args) {

		final int lineNum = 10;
		
		for (int i = 1; i <= lineNum; i++) // 10줄
		{
			for (int s = lineNum; s > i ; s--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
