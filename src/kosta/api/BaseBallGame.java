package kosta.api;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {

		int num[] = new int[3];
		int input[] = new int[3];

		int result = 0;
		int count = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(9) + 1; // 1~9 ���� ����
		}

		do {

			int strike = 0;
			int ball = 0;

			System.out.println("���ڸ� �Է��ϼ��� (1~9) : ");
			for (int j = 0; j < input.length; j++) {
				input[j] = sc.nextInt();
			}

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < input.length; j++) {

					if (num[i] == input[j]) {
						if (num[i] == input[i]) {
							strike += 1;
						} else {
							ball += 1;
						}
					}	
				}
			}
			System.out.println("��Ʈ����ũ �� : " + strike + " , ���� ��: " + ball);
			count +=1;
			
			result = strike;
			if (strike == 3) {
				System.out.println("�����Դϴ�.");
				System.out.println(count+"��° ����");
			}

		} while (result != 3);
	}
}
