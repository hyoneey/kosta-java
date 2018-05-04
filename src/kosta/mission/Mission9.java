package kosta.mission;

import java.util.Scanner;

public class Mission9 {
	static int count = 0;

	// 1. �߰�
	public static void Insert(String arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� : ");
		arr[count++] = sc.nextLine();
	}

	// 2. ���
	public static void Print(String arr[]) {
		for (int i = 0; i < count; i++) {
			System.out.print(i + " ��°: " + arr[i] + "\t");
		}
		System.out.println();
	}

	// 3. �˻�
	public static void Find() {
		System.out.println("�˻� ����� �����Ͽ����ϴ�.");
	}

	// 4. ����
	public static void Update(String arr[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ε����� �Է�: ");
		int index_num = sc.nextInt();
		sc.nextLine();

		if (index_num > count) {
			System.out.println("������ �ε����� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("������ ������ �Է�: ");
			String index_str = sc.nextLine();
			arr[index_num] = index_str;
		}
	}

	// 5. ����
	public static void Delete(String arr[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ε����� �Է�: ");
		int index_num = sc.nextInt();
		sc.nextLine();

		if (index_num >= count) {
			System.out.println("������ �ε����� �������� �ʽ��ϴ�.");
		} else {
			for (int i = index_num; i < count; i++) {
				arr[i] = arr[i + 1];
			}
			arr[count]=null;
			count--;
			System.out.println("�����Ǿ����ϴ�.");
		}

	}

	// 6. ����
	public static void End() {
		System.out.println("���α׷� ����");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String select;
		String arr[] = new String[30];

		while (true) {
			System.out.println("1.�߰� 2.��� 3.�˻� 4.���� 5.���� 6.����");
			System.out.print("����: ");
			select = sc.nextLine();

			switch (select) {
			case "1": // �߰�
				Insert(arr);
				break;

			case "2": // ���
				Print(arr);
				break;

			case "3": // �˻�
				Find();
				break;
			case "4": // ����
				Update(arr);
				break;
			case "5": // ����
				Delete(arr);
				break;
			case "6":
				End();
				return;
			}
		}
	}

}
