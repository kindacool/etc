package p2022_06_23;

import java.util.Scanner;

public class MiniGame {

	public static void main(String[] args) {

		// 목장이야기 코로보쿠르 여신님 퀴즈 : 0~9까지 수를 랜덤으로 해서 그 수보다 클지 작을지를 고르는 게임!
		int initValue; //초기값 , 이전값
		int nextRandom; //다음값
		int pick; //1을 고르면 크다, 2를 고르면 작다
		int score = 0; //몇번 맞췄는지 점수

		// 초기값도 랜덤으로(이전값)
		initValue = (int) (Math.random() * 10);

		while (true) {
			// 다음 값 (랜덤)

			nextRandom = (int) (Math.random() * 10);

			// 플레이어가 선택
			System.out.println("자 그럼 이 " + initValue + " 보다?");
			Scanner sc = new Scanner(System.in);
			pick = sc.nextInt(); // 1이면 크다! 2면 작다!

			System.out.println(nextRandom + " ~!");
			if (nextRandom > initValue) {

				if (pick == 1) // 다음값이 이전값보다 크다고 선택했으면
				{
					System.out.println("이전값이 " + initValue + "고, 이번값이 " + nextRandom + "이고, 다음값이 이전값보다 크다고 선택했으니까...");
					System.out.println("정답! 자 그럼 한번 더 할게.");
					score++;
					initValue = nextRandom;
				}

				else if (pick == 2) {
					System.out.println("이전값이 " + initValue + "고, 이번값이 " + nextRandom + "이고, 다음값이 이전값보다 작다고 선택했으니까...");
					System.out.println("땡!");
					break;
				}
			} else if (nextRandom < initValue) {

				if (pick == 1) // 다음값이 이전값보다 크다고 선택했으면
				{
					System.out.println("이전값이 " + initValue + "고, 이번값이 " + nextRandom + "이고, 다음값이 이전값보다 크다고 선택했으니까...");
					System.out.println("땡");
					break;
				} else if (pick == 2) {
					System.out.println("이전값이 " + initValue + "고, 이번값이 " + nextRandom + "이고, 다음값이 이전값보다 작다고 선택했으니까...");
					System.out.println("정답! 자 그럼 한번 더 할게.");
					score++;
					initValue = nextRandom;
				}

			} else {
				System.out.println("이전값이 " + initValue + "고, 이번값이 " + nextRandom + "이고, 다음값이 이전값보다 작다고 선택했으니까...");
				System.out.println("무승부!! 자 그럼 한번 더 할게.");
				initValue = nextRandom;
			}
		}
		System.out.println("이번엔  " + score + " 번 만큼이나 맞췄네 대단한걸?");

	}

}
