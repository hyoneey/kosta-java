package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

import kosta.studycafe.CalendarInfo;
import kosta.studycafe.DataInput;
import kosta.studycafe.Reservation;
import kosta.studycafe.TimeInfo;

public class ReservationInfo extends JoinInfo {
	static int count = 10; // ���� �ο�
	static List<Reservation> reservationList = new ArrayList<Reservation>();// ��������
																			// ����
	CalendarInfo c = new CalendarInfo(); // ��¥
	List<TimeInfo> timelist = new ArrayList<TimeInfo>(); // �ð����� ����
	String menu = "";

	public ReservationInfo() {
	}

	// ����
	public void Reservation(String phoneNo) {
		while (true) {

			System.out.println();
			System.out.println("***** ����ȭ�� *****");
			System.out.println("���� ���ุ �����մϴ�.(�ִ� 10��)");
			System.out.println();

			if (count == 0) {
				System.out.println("�˼��մϴ�. ������ ������ �� �ִ� �ο��� ����á���ϴ�.");
				System.out.println("������ �̿� ��Ź�帳�ϴ�.");
				break;
			} else {
				System.out.println("���� ���� ������ �ο�: " + count);
				System.out.print("�����Ͻðڽ��ϱ�? (y,n) ");
				String check = DataInput.DataInsert();

				if (check.trim().equalsIgnoreCase("y")) {// ����
					
					//���� ����� ������ �����ϸ� �ߺ� ����
					for(int i=0; i<reservationList.size();i++){ 
						if(phoneNo.equals(reservationList.get(i).getResevationPhone())){
							if(reservationList.get(i).getResevationDate().equals(c.nowDay())){
								System.out.println("���� ����� ������ ���� �մϴ�.");
								return;
							}
						}
					}
					
					count--;
					System.out.println(phoneNo + "���� ������ �Ϸ� �Ǿ����ϴ�. ����  ��¥: " + c.nowDay());
					reservationList.add(new Reservation(c.nowDay(), phoneNo));
					return;

				} else if (check.trim().equalsIgnoreCase("n")) { //���
					return;
				}

			}
		}
	} // Reservation End

	public void Print() {
		for (Reservation s : reservationList)
			System.out.println(s);
//		System.out.println(reservationList.size());
	}
	
	static  List<Reservation> ReservationPrint(){
		return reservationList;
	}

}
