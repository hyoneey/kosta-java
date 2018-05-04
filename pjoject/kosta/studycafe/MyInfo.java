package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class MyInfo {
	static List<Member> m_list = new ArrayList<Member>(); //회원정보
	static List<TimeInfo> t_list = new ArrayList<TimeInfo>(); // 시간정보 
	static List<Reservation> r_list = new ArrayList<Reservation>();// 예약정보
	
	public MyInfo(){}
	
	public void MyInfoInput(){ //내정보 출력	
		m_list = JoinInfo.memberPrint();
		t_list = CheckInfo.timePrint();
		r_list = ReservationInfo.ReservationPrint();	
	}
	
	
	public void MyInfoPrint(String phoneNo){
		MyInfoInput();
		
		for(int i=0; i<m_list.size(); i++){
			System.out.println();
			if(phoneNo.equals(m_list.get(i).getPhoneNo())){
				System.out.print("이름: "+m_list.get(i).getName() + " / 번호: "+m_list.get(i).getPhoneNo()
						+" / 회원 종류: "+m_list.get(i).getType());
				
				if(m_list.get(i).getType().equals("정기권 회원")) {
					System.out.println(" / 정기권 시작일: "+m_list.get(i).getTypeStart()+" / 정기권 만료일: "+m_list.get(i).getTypeEnd());
				}
				else if(m_list.get(i).getType().equals("일반권 회원")) {
					System.out.println(" / 이용날짜: "+m_list.get(i).getTypeStart());
				}
				
			}
		}
		for (int i = 0; i < r_list.size(); i++) {
			if (phoneNo.equals(r_list.get(i).getResevationPhone())) {
				System.out.print("예약 날짜: " + r_list.get(i).getResevationDate());
			}
		}
		for (int i = 0; i < t_list.size(); i++) {
			if (phoneNo.equals(t_list.get(i).getPhoneNo())) {
				System.out.println(" / 체크인 날짜: " + t_list.get(i).checkDay + " / 체크인 시간: " + t_list.get(i).checkIn
						+ " / 체크아웃 시간: " + t_list.get(i).checkOut);
			}
		}
		System.out.println();
	}//My End

	

}
