package kosta.studycafe;


import kosta.studycafe.Client;
import kosta.studycafe.DataInput;

public class Customer extends JoinInfo { // 고객 클래스
	String menu = null;
	
	public Customer() {}	

	// 로그인 이후 - 기능 선택 : 1.정보조회 2.예약 3.결제 4.입/퇴실 5.일대일문의
	public void c_function(String name, String phoneNo) {
		while (true) {
			System.out.println();
			System.out.println("***** 회원 고객 화면 *****");
			System.out.println("1.정보조회 2.예약 3.결제 4.입/퇴실 5.일대일문의 6.로그아웃");
			System.out.print("원하시는 기능을 선택하세요. : ");
			menu = DataInput.DataInsert();

			switch (menu) {
			case "1": // 정보조회
				MyInfo m = new MyInfo();
				m.MyInfoPrint(phoneNo);
				break;
			case "2": // 예약
				ReservationInfo r = new ReservationInfo();
				r.Reservation(phoneNo);
				break;
			case "3": // 결제
				Order o = new Order();
				o.buyTicket(phoneNo);
				break;
			case "4": // 입퇴실
				CheckInfo c = new CheckInfo();
				c.checkInOut(name, phoneNo);
				break;
			case "5": // 일대일문의
				Client client=new Client();
				client.clientConnect();
				break;
			case "6": // 로그아웃
				return;
			}
		}
	}

}
