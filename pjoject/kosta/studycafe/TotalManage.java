package kosta.studycafe;

public abstract class TotalManage{

	public static void totalManage() {
		// ����� ���, ���� �̿��ϴ� ȸ����(����ȸ��,�Ϲ�ȸ��)
		System.out.println("���� ���� : " +Ticket.totalAmount);
		 System.out.println("���� ȸ���� : " + (10-ReservationInfo.count));
	}
}
