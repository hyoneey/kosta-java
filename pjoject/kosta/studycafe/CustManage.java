package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class CustManage { // 고객 정보를 조회 ( 이름, 번호, 회원권 종류(정기권: 구매날짜, 만료날짜 ,일반권:이용날짜)
	List<Member> member_list = new ArrayList<Member>(); //회원정보

	public CustManage(){}
		
	public void CustListInput(){ //고객정보 리스트
		member_list =  JoinInfo.memberPrint();
	}

	//고객 정보 
	public void CustInfo(){
		
		CustListInput();
		
		System.out.println();
		System.out.println("****** 회원 정보 출력 화면 (관리자 모드) *****");
		System.out.println();
		
		for(int i=0; i<member_list.size(); i++){	
				System.out.print("이름: "+member_list.get(i).getName() + " 번호: "+member_list.get(i).getPhoneNo()
						+" 회원 종류: "+member_list.get(i).getType());
				
				if(member_list.get(i).getType().equals("정기권 회원")) {
					System.out.println(" 정기권 시작일: "+member_list.get(i).getTypeStart()+" 정기권 만료일: "+member_list.get(i).getTypeEnd());
				}
				else if(member_list.get(i).getType().equals("일반권 회원")) {
					System.out.println(" 일반권 이용날짜: "+member_list.get(i).getTypeStart());
				}
				
				System.out.println();
			}
	}
	
	
	
}
