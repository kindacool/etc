package p2022_06_23;

import java.util.Scanner;

public class MiniGame2 {

	public static void main(String[] args) {

		// 1 ~ 29 까지의 숫자가 랜덤으로 발생되고 그게 뭔지 맞추기, 맞힐때까지 반복되고, 정답이 내가 입력한 숫자보다 UP인지 DOWN 인지 알려줌
		int number;
		int guess;
		number = (int) (Math.random() * 29); // 이게 숨겨진 정답

//	System.out.println(number);//난수 발생 확인
		do {
			// 값 입력받기
			System.out.println("1~29 사이의 수를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();
			
			if(number>guess) {
				System.out.println("UP");
			}
			if(number<guess) {
				System.out.println("DOWN");
			}
		}while(number!=guess);
		
		System.out.println("정답!");
		
	}

}
