package kosta.api;

public class BaseBallMain {

	public static void main(String[] args) {

		int num[] = new int[3];
		int input[] = new int[3];
		int count = 0;
		BaseBall baseball = new BaseBall();

		// 난수 3자리 생성
		for (int i = 0; i < num.length; i++) {
			num[i] = baseball.makeNum();
		}

		// 난수 3자리 결과값
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// 입력 생성 후 실행
		do {
			System.out.println("숫자를 입력하세요 (1~9) : ");
			for (int j = 0; j < input.length; j++) {
				input[j] = baseball.DataInsert();
			}

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < input.length; j++) {
					BaseBall.Play(num, input); // 게임실행
				}
			}
			count += 1;

			BaseBall.print();

			if (BaseBall.getResult() == 3) {
				System.out.println("정답입니다.");
				System.out.println(count + "번째 성공");
			}
		} while (BaseBall.getResult() != 3);

	}

}
