package kosta.studycafe;


import kosta.studycafe.Client;
import kosta.studycafe.DataInput;

public class Customer extends JoinInfo { // �� Ŭ����
	String menu = null;
	
	public Customer() {}	

	// �α��� ���� - ��� ���� : 1.������ȸ 2.���� 3.���� 4.��/��� 5.�ϴ��Ϲ���
	public void c_function(String name, String phoneNo) {
		while (true) {
			System.out.println();
			System.out.println("***** ȸ�� �� ȭ�� *****");
			System.out.println("1.������ȸ 2.���� 3.���� 4.��/��� 5.�ϴ��Ϲ��� 6.�α׾ƿ�");
			System.out.print("���Ͻô� ����� �����ϼ���. : ");
			menu = DataInput.DataInsert();

			switch (menu) {
			case "1": // ������ȸ
				MyInfo m = new MyInfo();
				m.MyInfoPrint(phoneNo);
				break;
			case "2": // ����
				ReservationInfo r = new ReservationInfo();
				r.Reservation(phoneNo);
				break;
			case "3": // ����
				Order o = new Order();
				o.buyTicket(phoneNo);
				break;
			case "4": // �����
				CheckInfo c = new CheckInfo();
				c.checkInOut(name, phoneNo);
				break;
			case "5": // �ϴ��Ϲ���
				Client client=new Client();
				client.clientConnect();
				break;
			case "6": // �α׾ƿ�
				return;
			}
		}
	}

}
