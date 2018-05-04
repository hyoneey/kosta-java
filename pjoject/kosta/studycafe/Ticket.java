package kosta.studycafe;

import kosta.studycafe.CalendarInfo;

public class Ticket extends JoinInfo {
	static int totalAmount = 0;
	String startDay;
	String endDay;

	public Ticket() {
	}

	// �����
	public void seasonTicket(String phoneNo) {
		CalendarInfo c = new CalendarInfo();

		System.out.println("������� �������ּ���.");
		System.out.println("1.������ 2.������ 3.�Ѵ�");
		String seasonTicketNum = DataInput.DataInsert();
		startDay = c.nowDay();

		if (seasonTicketNum.equals("1")) {// ������
			endDay = c.oneWeek();
			System.out.println("������: " + startDay);
			System.out.println("������: " + endDay);
			System.out.println("������ �ݾ���  " + 15000 + "�� �Դϴ�.");
			totalAmount += 15000;
			
			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					list.get(i).setTypeStart(startDay);
					list.get(i).setTypeEnd(endDay);
				}
			}
		} else if (seasonTicketNum.equals("2")) {// ������
			endDay = c.twoWeek();
			System.out.println("������: " + startDay);
			System.out.println("������: " + endDay);
			System.out.println("������ �ݾ���  " + 29000 + "�� �Դϴ�.");
			totalAmount += 29000;

			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					list.get(i).setTypeStart(startDay);
					list.get(i).setTypeEnd(endDay);
				}
			}
		} else if (seasonTicketNum.equals("3")) {// �Ѵ�
			endDay = c.Month();
			System.out.println("������: " + startDay);
			System.out.println("������: " + endDay);
			System.out.println("������ �ݾ���  " + 55000 + "�� �Դϴ�.");
			totalAmount += 55000;

			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					list.get(i).setTypeStart(startDay);
					list.get(i).setTypeEnd(endDay);
				}
			}
		}

	}// ���� Ƽ�� end

	// �Ϲݱ�
	public void oneDayTicket() {
		CalendarInfo c = new CalendarInfo();
		startDay = c.nowDay();
		
		System.out.println("�Ϲݱ��� �����մϴ�.");
		System.out.println("������ �ݾ���  " + 2000 + "�� �Դϴ�.");
		totalAmount += 2000;
		
		for (int i = 0; i < list.size(); i++) {
			if (phoneNo.equals(list.get(i).getPhoneNo())) {
				list.get(i).setTypeStart(startDay);
			}
		}
	}

}
