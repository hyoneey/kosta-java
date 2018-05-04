package kosta.mission;

import java.util.Scanner;

public class Mission8 {

	// 메소드 사용
	/*
	 * public static void main(String[] args) {
	 * 
	 * / int kor, eng, mat, total = 0;
	 * 
	 * kor = get_Input(); eng = get_Input(); mat = get_Input(); total = kor +
	 * eng + mat;
	 * 
	 * System.out.println("총합: " + get_Total(kor, eng, mat));
	 * System.out.println("평균: " + get_Avg(total));
	 * 
	 * }
	 * 
	 * // 키보드로부터 점수 입력 메소드 static int get_Input() { Scanner sc = new
	 * Scanner(System.in); System.out.print("입력: "); int num = sc.nextInt();
	 * return num; }
	 * 
	 * // 총점을 구하는 메소드 static int get_Total(int num1, int num2, int num3) {
	 * return num1 + num2 + num3; }
	 * 
	 * // 평균을 구하는 메소드 static int get_Avg(int num1) { return num1 / 3; }
	 */

	// 메소드 _배열사용
	public static void main(String[] args) {

		int arr[] = new int[5];

		for (int i = 0; i < 3; i++) {
			arr[i] = get_Input();
		}

		get_Total(arr);
		System.out.println("총점: " + arr[3]);
		get_Avg(arr);
		System.out.println("평균: " + arr[4]);

	}

	// 키보드로부터 점수 입력 메소드
	static int get_Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		return num;
	}

	// 총점을 구하는 메소드
	static void get_Total(int arr[]) {
		for (int i = 0; i < 3; i++) {
			arr[3] += arr[i];
		}
	}

	// 평균을 구하는 메소드
	static void get_Avg(int arr[]) {
		arr[4] = arr[3] / 3;
	}
}
