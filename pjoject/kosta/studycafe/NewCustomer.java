package kosta.studycafe;

import kosta.studycafe.Client;

public class NewCustomer{ //첫 방문고객
	
	// 기능 선택 : 1.회원가입 2.상품조회 3.예약현황 4.일대일 문의
	public void function() {
		while(true){
		System.out.println();
		System.out.println("***** 첫 방문 고객 화면 *****");
		System.out.println("1.회원가입 2.상품조회 3.예약현황 4.일대일 문의 5. 메인화면 이동");
		System.out.print("원하시는 기능을 선택하세요. : ");
		String menu = DataInput.DataInsert();
		
		switch (menu) {
		case "1": //회원가입
			JoinInfo.Join();
			break;
		case "2": //상품조회		
			ProductManager.listProduct();
			break;
		case "3": //예약현황
			ReservationInfo r = new ReservationInfo();
			CalendarInfo c = new CalendarInfo();
			System.out.println();
			System.out.println("***** 예약 현황 화면 *****");
			System.out.println(c.nowDay()+" 현재 이용가능한 인원수 : "+r.count);
			break;
		case "4": //일대일 문의	
			Client client=new Client();
			client.clientConnect();
			break;
		case "5": //종료
			return;
		}	
	}
	}
}
