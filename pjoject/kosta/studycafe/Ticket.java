package kosta.studycafe;

import kosta.studycafe.CalendarInfo;

public class Ticket extends JoinInfo {
	static int totalAmount = 0;
	String startDay;
	String endDay;

	public Ticket() {
	}

	// 정기권
	public void seasonTicket(String phoneNo) {
		CalendarInfo c = new CalendarInfo();

		System.out.println("정기권을 선택해주세요.");
		System.out.println("1.일주일 2.이주일 3.한달");
		String seasonTicketNum = DataInput.DataInsert();
		startDay = c.nowDay();

		if (seasonTicketNum.equals("1")) {// 일주일
			endDay = c.oneWeek();
			System.out.println("시작일: " + startDay);
			System.out.println("만료일: " + endDay);
			System.out.println("결제할 금액은  " + 15000 + "원 입니다.");
			totalAmount += 15000;
			
			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					list.get(i).setTypeStart(startDay);
					list.get(i).setTypeEnd(endDay);
				}
			}
		} else if (seasonTicketNum.equals("2")) {// 이주일
			endDay = c.twoWeek();
			System.out.println("시작일: " + startDay);
			System.out.println("만료일: " + endDay);
			System.out.println("결제할 금액은  " + 29000 + "원 입니다.");
			totalAmount += 29000;

			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					list.get(i).setTypeStart(startDay);
					list.get(i).setTypeEnd(endDay);
				}
			}
		} else if (seasonTicketNum.equals("3")) {// 한달
			endDay = c.Month();
			System.out.println("시작일: " + startDay);
			System.out.println("만료일: " + endDay);
			System.out.println("결제할 금액은  " + 55000 + "원 입니다.");
			totalAmount += 55000;

			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					list.get(i).setTypeStart(startDay);
					list.get(i).setTypeEnd(endDay);
				}
			}
		}

	}// 시즌 티켓 end

	// 일반권
	public void oneDayTicket() {
		CalendarInfo c = new CalendarInfo();
		startDay = c.nowDay();
		
		System.out.println("일반권을 구매합니다.");
		System.out.println("결제할 금액은  " + 2000 + "원 입니다.");
		totalAmount += 2000;
		
		for (int i = 0; i < list.size(); i++) {
			if (phoneNo.equals(list.get(i).getPhoneNo())) {
				list.get(i).setTypeStart(startDay);
			}
		}
	}

}
