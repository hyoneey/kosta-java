package kosta.mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		String subject[] = { "����", "����", "����", "����", "���" };
		int arr[][] = new int[2][5];

		// ���� �Է�(�ʱ�ȭ)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("�л� [" + (i + 1) + "] �� " + subject[j] + " ���� �Է�: ");
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / 3;
		}

		// ���� ���� (����� �������� ��������)
		for (int a = 0; a < arr.length; a++) {
			for (int b = a + 1; b < arr.length; b++) {
				if (arr[a][4] < arr[a + 1][4]) {
					int temp[];
					temp = arr[a];
					arr[a] = arr[a + 1];
					arr[a + 1] = temp;
				}
			}
		}

		// �������
		for (String s : subject) {
			System.out.print(s + "\t");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
