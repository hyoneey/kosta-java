package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

import kosta.studycafe.JoinInfo;

public class CheckInfo extends ReservationInfo {
	static List<TimeInfo> timelist = new ArrayList<TimeInfo>(); // �ð����� ����
	String menu = "";
	CalendarInfo cal = new CalendarInfo();
	String checkDay = "";
	String checkIn = "";
	String checkOut = "";

	// ����� - ������ ������ ������ �����ְ� ������ �����߻�
	public void checkInOut(String name, String phoneNo) {

		System.out.println();
		System.out.println("***** ��/��� ȭ�� *****");

		// ���� ���� ������ ���� ���� ���
		if (reservationList.size() == 0) {
			System.out.println("��/��� : ���� ����� ������ �������� �ʽ��ϴ�. ���� �����ο� :  " + count);
			return;
		}

		for (int i = 0; i < reservationList.size(); i++) {// ���������� ����
			// ���ฮ��Ʈ�� ����ȣ�� �����ϸ�
			if (phoneNo == reservationList.get(i).ResevationPhone) {
				// ������ ����������
				if (JoinInfo.list.get(i).getType().equals("")) {
					System.out.println("������ ���� ���� �ʾҽ��ϴ�.");
					break;
				}

				// ���� ������ ���� �ϰ� ���೯¥�� ���� ��¥�� ������
				if (reservationList.get(i).getResevationDate().equals(cal.nowDay())) {

					System.out.print("1.�Խ� 2.��� : ");
					menu = DataInput.DataInsert();

					if (menu.equals("1")) { // �Խ�
						System.out.println(name + "���� �Խ� �Ͽ����ϴ�.");
						checkDay = c.nowDay();
						checkIn = c.nowTime();
						System.out.println("�Խ� �ð�: " + checkDay + checkIn);
						timelist.add(new TimeInfo(phoneNo, checkDay, checkIn));

					} else if (menu.equals("2")) { // ���
						// �Խ��� null�� �� ����� �߻��ϸ� �����߻�
						try {
							if (timelist.get(i).checkIn.equals("")) {
								System.out.println("�Խ� ó���� ���� �ʾҽ��ϴ�.");
							} else {
								System.out.println(name + "���� ��� �Ͽ����ϴ�.");
								checkDay = c.nowDay();
								checkOut = c.nowTime();
								System.out.println("��� �ð�: " + checkDay + checkOut);
								count++;

								for (int j = 0; j < timelist.size(); j++) {
									if (phoneNo.equals(timelist.get(j).phoneNo)) {
										if (timelist.get(i).checkDay.equals(checkDay)) {
											timelist.get(i).setCheckOut(checkOut);
										}
									}
								}
							} // ��� ����
						} catch (IndexOutOfBoundsException e) {
							System.out.println("�Խ� ó���� ���ּ���.");
						}
					} // if�� end
				} else { // ������ ��¥ ������ �������� ���� ���
					System.out.println(name + " ���� " + cal.nowDay() + " ��¥�� ����� ������ �������� �ʽ��ϴ�.");
				}
			}
		} // for��
	}// chckInOut End

	static List<TimeInfo> timePrint() {
		return timelist;
	}

}
