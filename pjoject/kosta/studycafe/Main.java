package kosta.studycafe;

import kosta.studycafe.Manager;

public class Main {
	public static void main(String[] args) {
		NewCustomer c1 = new NewCustomer(); //첫 방문고객
		LoginInfo l = new LoginInfo(); // 회원
		Manager m = new Manager();
		String menu = null;
		System.out.println("@***** Study Cafe Reservation Program *****@");

		while (true) {
			System.out.println();
			System.out.println("***** 메인 화면 *****");
			System.out.println("1.첫 방문고객 2.회원 3.관리자 ");
			System.out.print("원하시는 기능을 선택해주세요. : ");	
					menu = DataInput.DataInsert();
					
					switch (menu) {
					case "1": // 1.첫 방문고객
						c1.function();
						System.out.println();
						break;
					case "2": //2.회원
						l.login();
						System.out.println();
						break;
					case "3": //3.관리자
						m.managerLogin();
						System.out.println();
						break;
					}	

		}

	}
}
