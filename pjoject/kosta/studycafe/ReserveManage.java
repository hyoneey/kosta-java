package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class ReserveManage {
	List<Member> m_list2 = new ArrayList<Member>(); //회원정보
	List<TimeInfo> t_list2= new ArrayList<TimeInfo>(); // 시간정보 
	List<Reservation> r_list2 = new ArrayList<Reservation>();// 예약정보
	
	public ReserveManage(){}
	
	public void ReserveInput(){ //내정보 출력	
		m_list2 = JoinInfo.memberPrint();
		t_list2 = CheckInfo.timePrint();
		r_list2 = ReservationInfo.ReservationPrint();	
	}
	
	public  void reserveManage() {
		
		ReserveInput();
		
		System.out.println();
		System.out.println("****** 예약 회원 정보 출력 화면 (관리자 모드) *****");
		System.out.println();

		for (int i = 0; i < m_list2.size(); i++) {
			System.out.print("이름: " + m_list2.get(i).getName() + " / 번호: " + m_list2.get(i).getPhoneNo() + " / 회원 종류: "
					+ m_list2.get(i).getType());

			if (m_list2.get(i).getType().equals("정기권 회원")) {
				System.out.println(
						" / 정기권 시작일: " + m_list2.get(i).getTypeStart() + " / 정기권 만료일: " + m_list2.get(i).getTypeEnd());
			} else if (m_list2.get(i).getType().equals("일반권 회원")) {
				System.out.println(" / 이용날짜: " + m_list2.get(i).getTypeStart());
			}

			for (int j = 0; j < r_list2.size(); j++) {
				if(m_list2.get(i).getPhoneNo().equals(r_list2.get(j).getResevationPhone())){
				System.out.print("예약 날짜: " + r_list2.get(i).getResevationDate());
				}
			}

			for (int k = 0; k< t_list2.size(); k++) {
				if(m_list2.get(i).getPhoneNo().equals(t_list2.get(k).getPhoneNo())){
					System.out.println(" / 체크인 날짜: "+t_list2.get(i).checkDay+" / 체크인 시간: "+t_list2.get(i).checkIn+" / 체크아웃 시간: "+t_list2.get(i).checkOut);
				}
			}
			
			System.out.println();
		}
	}
}
