package kosta.mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		String subject[] = { "국어", "영어", "수학", "총점", "평균" };
		int arr[][] = new int[2][5];

		// 점수 입력(초기화)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("학생 [" + (i + 1) + "] 의 " + subject[j] + " 점수 입력: ");
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / 3;
		}

		// 선택 정렬 (평균을 기준으로 내림차순)
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

		// 점수출력
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
