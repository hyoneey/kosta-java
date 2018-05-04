package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ListExam {

/*	public static void show(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " , ");
		}
		System.out.println();
	}*/
	
	//Iterator 
	public static void show(List<String> list) {
		
		Iterator<String> iterator = list.iterator();		
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" , ");
		}	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>(); // list����
//		LinkedList<String> list = new LinkedList<String>();

		while (true) {
			System.out.println("1.�߰� 2.���� 3.���� 4.����");
			System.out.print("����: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1": // �߰�
				System.out.print("���ڿ� �Է�: ");
				String str = sc.nextLine();
				list.add(str);
				show(list);
				break;
				
			case "2": // ����
				System.out.print("������ ����: ");
				String str2 = sc.nextLine();
				int index = list.indexOf(str2); //str2�� ��ġ���� ��ȯ
				if(index != -1){
					System.out.print("���� ����: ");
					list.set(index, sc.nextLine());
				}
				show(list);
				break;
				
			case "3": // ����
				System.out.print("���� ���: ");
				String str3 = sc.nextLine();
				int index2 = list.indexOf(str3);
				if(index2 != -1){
					list.remove(index2);
				}
				show(list);
				break;
			case "4":
				System.out.println("���α׷� ����");
				return;
			}

		}

	}

}
