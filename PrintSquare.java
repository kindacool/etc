package p2022_07_13;

public class PrintSquare {
//	1 2 3 4 5 
//	2 3 4 5 1 
//	3 4 5 1 2 
//	4 5 1 2 3 
//	5 1 2 3 4 
	public static void main(String[] args) {

		final int len = 5;
		int[] num = { 1, 2, 3, 4, 5 };
		int start = 0;
		for (int k = 0; k < len; k++) {
			{
				for (int i = start; i < len + start; i++) {

					if (i < 5)
						System.out.print(num[i] + " ");
					else
						System.out.print(num[i - len] + " ");

				}
				System.out.println();
				start++;
			}
		}
	}
}
