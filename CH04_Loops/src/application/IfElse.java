package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// 스캐너
		Scanner scanner = new Scanner(System.in);

		System.out.printf("사과의 갯수는?");
		// If 조건문
		int apple = scanner.nextInt();
		System.out.printf("바나나의 갯수는?");
		int banana = scanner.nextInt();
		scanner.close(); // 스캐너 종료(더이상 안쓸때)

		// If의 조건이 참일 경우에 {}안의 명령문을 실행한다.
		if (apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		else { //위의 if문의 조건이 아닐경우 실행
			System.out.println("바나나가 사과보다 많음");
		}

		System.out.println("프로그램 종료.");

	}

}
