package kosta.phoneList;

import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Manager m = new Manager(); // Manager ��ü ����

		String menu = null;

		while (true) {
			System.out.println(
					"1.����ó ���� , 2.����ó ��ü ��� , 3. ����ó �˻� " + ", 4. ����ó ���� , 5.����ó ����, 6.����ó ����, 7. ���α׷� ����");
			menu = DataInput.DataInsert();

			switch (menu) {
			case "1": // ����ó ����
				m.Insert();
				System.out.println();
				break;
			case "2": // ����ó ��ü���				
				m.All_Print();
				break;
			case "3": // ����ó �˻�
				m.Search();
				System.out.println();
				break;
			case "4": // ����ó ����
				m.Delete();
				System.out.println();
				break;
			case "5": // ����ó ����
				m.Update();
				break;
			case "6": // ����ó ����
				m.sort();
				break;
			case "7": // ���α׷� ����
				return;

			}

	}

	}
}

