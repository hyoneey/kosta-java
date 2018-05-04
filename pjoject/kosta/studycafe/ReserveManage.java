package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class ReserveManage {
	List<Member> m_list2 = new ArrayList<Member>(); //ȸ������
	List<TimeInfo> t_list2= new ArrayList<TimeInfo>(); // �ð����� 
	List<Reservation> r_list2 = new ArrayList<Reservation>();// ��������
	
	public ReserveManage(){}
	
	public void ReserveInput(){ //������ ���	
		m_list2 = JoinInfo.memberPrint();
		t_list2 = CheckInfo.timePrint();
		r_list2 = ReservationInfo.ReservationPrint();	
	}
	
	public  void reserveManage() {
		
		ReserveInput();
		
		System.out.println();
		System.out.println("****** ���� ȸ�� ���� ��� ȭ�� (������ ���) *****");
		System.out.println();

		for (int i = 0; i < m_list2.size(); i++) {
			System.out.print("�̸�: " + m_list2.get(i).getName() + " / ��ȣ: " + m_list2.get(i).getPhoneNo() + " / ȸ�� ����: "
					+ m_list2.get(i).getType());

			if (m_list2.get(i).getType().equals("����� ȸ��")) {
				System.out.println(
						" / ����� ������: " + m_list2.get(i).getTypeStart() + " / ����� ������: " + m_list2.get(i).getTypeEnd());
			} else if (m_list2.get(i).getType().equals("�Ϲݱ� ȸ��")) {
				System.out.println(" / �̿볯¥: " + m_list2.get(i).getTypeStart());
			}

			for (int j = 0; j < r_list2.size(); j++) {
				if(m_list2.get(i).getPhoneNo().equals(r_list2.get(j).getResevationPhone())){
				System.out.print("���� ��¥: " + r_list2.get(i).getResevationDate());
				}
			}

			for (int k = 0; k< t_list2.size(); k++) {
				if(m_list2.get(i).getPhoneNo().equals(t_list2.get(k).getPhoneNo())){
					System.out.println(" / üũ�� ��¥: "+t_list2.get(i).checkDay+" / üũ�� �ð�: "+t_list2.get(i).checkIn+" / üũ�ƿ� �ð�: "+t_list2.get(i).checkOut);
				}
			}
			
			System.out.println();
		}
	}
}
