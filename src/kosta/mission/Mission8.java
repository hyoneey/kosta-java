package kosta.mission;

import java.util.Scanner;

public class Mission8 {

	// �޼ҵ� ���
	/*
	 * public static void main(String[] args) {
	 * 
	 * / int kor, eng, mat, total = 0;
	 * 
	 * kor = get_Input(); eng = get_Input(); mat = get_Input(); total = kor +
	 * eng + mat;
	 * 
	 * System.out.println("����: " + get_Total(kor, eng, mat));
	 * System.out.println("���: " + get_Avg(total));
	 * 
	 * }
	 * 
	 * // Ű����κ��� ���� �Է� �޼ҵ� static int get_Input() { Scanner sc = new
	 * Scanner(System.in); System.out.print("�Է�: "); int num = sc.nextInt();
	 * return num; }
	 * 
	 * // ������ ���ϴ� �޼ҵ� static int get_Total(int num1, int num2, int num3) {
	 * return num1 + num2 + num3; }
	 * 
	 * // ����� ���ϴ� �޼ҵ� static int get_Avg(int num1) { return num1 / 3; }
	 */

	// �޼ҵ� _�迭���
	public static void main(String[] args) {

		int arr[] = new int[5];

		for (int i = 0; i < 3; i++) {
			arr[i] = get_Input();
		}

		get_Total(arr);
		System.out.println("����: " + arr[3]);
		get_Avg(arr);
		System.out.println("���: " + arr[4]);

	}

	// Ű����κ��� ���� �Է� �޼ҵ�
	static int get_Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		int num = sc.nextInt();
		return num;
	}

	// ������ ���ϴ� �޼ҵ�
	static void get_Total(int arr[]) {
		for (int i = 0; i < 3; i++) {
			arr[3] += arr[i];
		}
	}

	// ����� ���ϴ� �޼ҵ�
	static void get_Avg(int arr[]) {
		arr[4] = arr[3] / 3;
	}
}
