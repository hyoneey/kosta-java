package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class OrderManage {

	List<Member> m_list3 = new ArrayList<Member>(); // 회원정보

	public OrderManage() {
	}

	public void OrderListInput() {
		m_list3 = JoinInfo.memberPrint();
	}

	public void orderManage() {
		OrderListInput();

		System.out.println();
		System.out.println("****** 회원 정보 출력 화면 (관리자 모드) *****");
		System.out.println();

		// 정기권, 일반권 ,음료 주문확인(이름,자리,음료정보)

		for (int i = 0; i < m_list3.size(); i++) {
			System.out.println();
			if (m_list3.get(i).getType().equals("정기권 회원")) {
				System.out.println("***** 정기권 회원 목록 *****");
				System.out.println("이름 : " + m_list3.get(i).getName() + "번호 : " + m_list3.get(i).getPhoneNo()
						+ "정기권 시작일: " + m_list3.get(i).getTypeStart() + " 정기권 만료일: " + m_list3.get(i).getTypeEnd());
			}
		}

		for (int i = 0; i < m_list3.size(); i++) {
			if (m_list3.get(i).getType().equals("일반권 회원")) {
				System.out.println();
				System.out.println("***** 일반권 회원 목록 *****");
				System.out.println("이름 : " + m_list3.get(i).getName() + "번호 : " + m_list3.get(i).getPhoneNo()
						+ " 이용날짜: " + m_list3.get(i).getTypeStart());
			}
		}

		System.out.println();
		System.out.println("***** 음료 주문  목록 *****");
		System.out.println("주문한 음료 : " + Order.buyDrinks);
	}

}