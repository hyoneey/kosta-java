package kosta.studycafe;

import kosta.studycafe.Manager;

public class Main {
	public static void main(String[] args) {
		NewCustomer c1 = new NewCustomer(); //ù �湮��
		LoginInfo l = new LoginInfo(); // ȸ��
		Manager m = new Manager();
		String menu = null;
		System.out.println("@***** Study Cafe Reservation Program *****@");

		while (true) {
			System.out.println();
			System.out.println("***** ���� ȭ�� *****");
			System.out.println("1.ù �湮�� 2.ȸ�� 3.������ ");
			System.out.print("���Ͻô� ����� �������ּ���. : ");	
					menu = DataInput.DataInsert();
					
					switch (menu) {
					case "1": // 1.ù �湮��
						c1.function();
						System.out.println();
						break;
					case "2": //2.ȸ��
						l.login();
						System.out.println();
						break;
					case "3": //3.������
						m.managerLogin();
						System.out.println();
						break;
					}	

		}

	}
}
