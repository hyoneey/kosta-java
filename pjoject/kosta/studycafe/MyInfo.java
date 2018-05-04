package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class MyInfo {
	static List<Member> m_list = new ArrayList<Member>(); //ȸ������
	static List<TimeInfo> t_list = new ArrayList<TimeInfo>(); // �ð����� 
	static List<Reservation> r_list = new ArrayList<Reservation>();// ��������
	
	public MyInfo(){}
	
	public void MyInfoInput(){ //������ ���	
		m_list = JoinInfo.memberPrint();
		t_list = CheckInfo.timePrint();
		r_list = ReservationInfo.ReservationPrint();	
	}
	
	
	public void MyInfoPrint(String phoneNo){
		MyInfoInput();
		
		for(int i=0; i<m_list.size(); i++){
			System.out.println();
			if(phoneNo.equals(m_list.get(i).getPhoneNo())){
				System.out.print("�̸�: "+m_list.get(i).getName() + " / ��ȣ: "+m_list.get(i).getPhoneNo()
						+" / ȸ�� ����: "+m_list.get(i).getType());
				
				if(m_list.get(i).getType().equals("����� ȸ��")) {
					System.out.println(" / ����� ������: "+m_list.get(i).getTypeStart()+" / ����� ������: "+m_list.get(i).getTypeEnd());
				}
				else if(m_list.get(i).getType().equals("�Ϲݱ� ȸ��")) {
					System.out.println(" / �̿볯¥: "+m_list.get(i).getTypeStart());
				}
				
			}
		}
		for (int i = 0; i < r_list.size(); i++) {
			if (phoneNo.equals(r_list.get(i).getResevationPhone())) {
				System.out.print("���� ��¥: " + r_list.get(i).getResevationDate());
			}
		}
		for (int i = 0; i < t_list.size(); i++) {
			if (phoneNo.equals(t_list.get(i).getPhoneNo())) {
				System.out.println(" / üũ�� ��¥: " + t_list.get(i).checkDay + " / üũ�� �ð�: " + t_list.get(i).checkIn
						+ " / üũ�ƿ� �ð�: " + t_list.get(i).checkOut);
			}
		}
		System.out.println();
	}//My End

	

}
