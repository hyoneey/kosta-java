package kosta.studycafe;

public class ManagerMenu { // ������ �޴� Ŭ����
	String str = null;

	public ManagerMenu() {}

	public void m_function() {
		while (true) {
			System.out.println();
			System.out.println("***** ������ �޴� ȭ��*****");
			System.out.println("1.������ 2.�ֹ����� 3.������� 4.������� 5.���ǰ��� 6.�α׾ƿ�");
			str = DataInput.DataInsert();

			switch (str) {
			case "1": // ������
				CustManage cm = new CustManage();
				cm.CustInfo();
				break;
			case "2": // �ֹ�����
				OrderManage om = new OrderManage();
				om.orderManage();
				break;
			case "3": // �������
				TotalManage.totalManage();
				break;
			case "4": // �������
				ReserveManage rm = new ReserveManage();
				rm.reserveManage();
				break;
			case "5": // ���ǰ���
				Server server = new Server();
				server.serverConnect();
				break;
			case "6": // �α׾ƿ�
				return;
			}
		}
	}
}
