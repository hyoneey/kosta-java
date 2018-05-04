package kosta.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {

	public static void main(String[] args) {
		// 2018�� 2�� Ķ���� ����;
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE);
		System.out.println(n);

		// �Է� : 2
		// <2018�� 2��>
		// �� �� ȭ �� �� �� ��
		// 1 2 3 //���� ���� �������� -����� -> �� ���� ������ 7�� ������ ����
		// 4 5 6 7 8 9 10

		Scanner sc = new Scanner(System.in);
		System.out.print("Month �Է�: ");
		int month = sc.nextInt();
		int count =0;
		
		gc.set(2018,month,1);
		int c = gc.get(Calendar.DAY_OF_WEEK) - 1;
//		System.out.println(c);

		System.out.println("<2018�� " + month + "��>");
		System.out.println("��	��	ȭ	��	��	��	��");
		
		for(int j=1; j<=c; j++){
			System.out.print("	");
			count += 1;
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "	");
			count +=1;

			if (count%7 ==0) {
				System.out.println();
			}
		}

	}

}
