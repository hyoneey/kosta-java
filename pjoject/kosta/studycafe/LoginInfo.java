package kosta.studycafe;

public class LoginInfo extends JoinInfo {
	Customer cus = new Customer();

	// �α���
		public void login() {
			System.out.println();
			System.out.println("***** �α��� ȭ�� *****");
			System.out.print("��ȣ�� �Է� �ϼ���.: ");
			String phoneNo = DataInput.DataInsert();

			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					System.out.println("�α��� ����");
					String name = list.get(i).getName();
					cus.c_function(name, phoneNo);
					return;
				}
			}
			System.out.println("�ڵ��� ��ȣ�� �ٽ� Ȯ���ϼ���.");
			System.out.println("��ϵ��� ���� ȸ���̰ų�, ��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}
		
}
