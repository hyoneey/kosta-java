package kosta.mission;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args){
		//Ű����� ���� 1~4�� �Է�
		//1.�߰� 2.��ü��� 3.�˻� 4.���� => �ܼ����
		//1�� Ŭ�� => �߰������ ���� �޼������
		//4�� => return;
		
		Scanner sc = new Scanner(System.in);

		int num;

		while (true) {
			num = sc.nextInt();
			
			switch(num){
			case 1:
				System.out.println("�߰� ����� �����Ͽ����ϴ�.");
				break;
			case 2:
				System.out.println("��ü��� ����� �����Ͽ����ϴ�.");
				break;
			case 3:
				System.out.println("�˻� ����� �����Ͽ����ϴ�.");
				break;
			case 4:
				System.out.println("���α׷� ����");
				return;
			}
		}

	}
	
}
