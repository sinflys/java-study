package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속승인' 출력하고 반복문을 빠져나옴
		// 패스워드 3회 틀릴시 '접속거부'
		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		boolean accessOK = false; // 플래그(flag):불린변수로 상태에 따라 처리흐름

		// 여기에 코드 작성 비번 맞으면 accessOK = true;로 하고 '접속승인'을 출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("패스워드 입력 > ");
			String password = scanner.nextLine();

			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK = true;
				break;
			} else {
				System.out.printf("비번이 %d 틀렸습니다.\n", i+1);
			}
		}

		scanner.close();

		if (!accessOK) {
			System.out.println("접속거부");
		}

	}

}
