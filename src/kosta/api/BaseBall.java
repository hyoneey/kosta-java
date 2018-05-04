package kosta.api;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	// static int num[] = new int[3];
	// static int input[] = new int[3];
	static int count = 0;
	static int result = 0;
	static int result2 = 0;
	Random r = new Random();

	BaseBall() {
	}

	int makeNum() {
		int num = r.nextInt(9) + 1;
		return num;
	}

	 int DataInsert() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

	static void Play(int num[], int input[]) {
		int strike = 0;
		int ball = 0;
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
		// count +=1;
		/*
		 * System.out.println("��Ʈ����ũ �� : " + strike + " , ���� ��: " + ball);
		 */
		result = strike;
		result2 = ball;

	}

	public static void print() {
		System.out.println("��Ʈ����ũ �� : " + result + " , ���� ��: " + result2);
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BaseBall.count = count;
	}

	public static int getResult() {
		return result;
	}

	public static void setResult(int result) {
		BaseBall.result = result;
	}

}