package kosta.studycafe;

public class Manager { 
	ManagerMenu mm = new ManagerMenu();
	//������ �α���
	public void managerLogin() {
			System.out.println();
			System.out.println("***** ������ �α��� ȭ�� *****");
			System.out.print("������ ��ȣ�� �Է� �ϼ���. : ");
			String phoneNo = DataInput.DataInsert();
			
			if (phoneNo.equals("0000")) {
				System.out.println("������ �α��� ����");
				mm.m_function();
			} else
				System.out.println("�ڵ��� ��ȣ�� �ٽ� Ȯ���ϼ���.");
		}
}
