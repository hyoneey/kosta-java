package kosta.studycafe;

public class ManagerMenu { // 관리자 메뉴 클래스
	String str = null;

	public ManagerMenu() {}

	public void m_function() {
		while (true) {
			System.out.println();
			System.out.println("***** 관리자 메뉴 화면*****");
			System.out.println("1.고객관리 2.주문관리 3.매장관리 4.예약관리 5.문의관리 6.로그아웃");
			str = DataInput.DataInsert();

			switch (str) {
			case "1": // 고객관리
				CustManage cm = new CustManage();
				cm.CustInfo();
				break;
			case "2": // 주문관리
				OrderManage om = new OrderManage();
				om.orderManage();
				break;
			case "3": // 매장관리
				TotalManage.totalManage();
				break;
			case "4": // 예약관리
				ReserveManage rm = new ReserveManage();
				rm.reserveManage();
				break;
			case "5": // 문의관리
				Server server = new Server();
				server.serverConnect();
				break;
			case "6": // 로그아웃
				return;
			}
		}
	}
}
