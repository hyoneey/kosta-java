package kosta.studycafe;

import kosta.studycafe.Client;

public class NewCustomer{ //ù �湮��
	
	// ��� ���� : 1.ȸ������ 2.��ǰ��ȸ 3.������Ȳ 4.�ϴ��� ����
	public void function() {
		while(true){
		System.out.println();
		System.out.println("***** ù �湮 �� ȭ�� *****");
		System.out.println("1.ȸ������ 2.��ǰ��ȸ 3.������Ȳ 4.�ϴ��� ���� 5. ����ȭ�� �̵�");
		System.out.print("���Ͻô� ����� �����ϼ���. : ");
		String menu = DataInput.DataInsert();
		
		switch (menu) {
		case "1": //ȸ������
			JoinInfo.Join();
			break;
		case "2": //��ǰ��ȸ		
			ProductManager.listProduct();
			break;
		case "3": //������Ȳ
			ReservationInfo r = new ReservationInfo();
			CalendarInfo c = new CalendarInfo();
			System.out.println();
			System.out.println("***** ���� ��Ȳ ȭ�� *****");
			System.out.println(c.nowDay()+" ���� �̿밡���� �ο��� : "+r.count);
			break;
		case "4": //�ϴ��� ����	
			Client client=new Client();
			client.clientConnect();
			break;
		case "5": //����
			return;
		}	
	}
	}
}
