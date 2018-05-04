package kosta.studycafe;

public abstract class TotalManage{

	public static void totalManage() {
		// 매출및 통계, 현재 이용하는 회원수(정기회원,일반회원)
		System.out.println("현재 매출 : " +Ticket.totalAmount);
		 System.out.println("현재 회원수 : " + (10-ReservationInfo.count));
	}
}
