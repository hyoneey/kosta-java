package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class OrderManage {

	List<Member> m_list3 = new ArrayList<Member>(); // ȸ������

	public OrderManage() {
	}

	public void OrderListInput() {
		m_list3 = JoinInfo.memberPrint();
	}

	public void orderManage() {
		OrderListInput();

		System.out.println();
		System.out.println("****** ȸ�� ���� ��� ȭ�� (������ ���) *****");
		System.out.println();

		// �����, �Ϲݱ� ,���� �ֹ�Ȯ��(�̸�,�ڸ�,��������)

		for (int i = 0; i < m_list3.size(); i++) {
			System.out.println();
			if (m_list3.get(i).getType().equals("����� ȸ��")) {
				System.out.println("***** ����� ȸ�� ��� *****");
				System.out.println("�̸� : " + m_list3.get(i).getName() + "��ȣ : " + m_list3.get(i).getPhoneNo()
						+ "����� ������: " + m_list3.get(i).getTypeStart() + " ����� ������: " + m_list3.get(i).getTypeEnd());
			}
		}

		for (int i = 0; i < m_list3.size(); i++) {
			if (m_list3.get(i).getType().equals("�Ϲݱ� ȸ��")) {
				System.out.println();
				System.out.println("***** �Ϲݱ� ȸ�� ��� *****");
				System.out.println("�̸� : " + m_list3.get(i).getName() + "��ȣ : " + m_list3.get(i).getPhoneNo()
						+ " �̿볯¥: " + m_list3.get(i).getTypeStart());
			}
		}

		System.out.println();
		System.out.println("***** ���� �ֹ�  ��� *****");
		System.out.println("�ֹ��� ���� : " + Order.buyDrinks);
	}

}