package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class JoinInfo {
	static List<Member> list = new ArrayList<Member>();
	static String name;
	static String phoneNo;
	
	public JoinInfo(){}

	// 1.회원가입
	static void Join() {
		System.out.println();
		System.out.println("***** 회원가입 화면 *****");
		System.out.print("이름 : ");
		name =DataInput.DataInsert();
		System.out.print("전화번호 ex)010-1234-5678): ");
		phoneNo = DataInput.DataInsert();
	
		checkName(name, phoneNo);
	}
	
	//1.회원가입 - 이름 형식 확인
	static void checkName(String name,String phoneNo){
		if(name.matches("(?i)(^[a-zA-Z]*$)")){ 
			checkStr(name, phoneNo);
		}else{
			System.out.println();
			System.out.println("지원하지 않는 형식입니다.");
			System.out.println("영문자로만 입력 부탁드립니다. (대소문자 구분안함)");
		}
	}
	
	// 1.회원가입 - 폰번호 입력 형식 확인
	static void checkStr(String name,String phoneNo) {
		if(phoneNo.matches("[\\d]{3}+\\-[\\d]{4}+\\-[\\d]{4}")){ //번호 형식으로 입력되었는지 확인
			Check(name, phoneNo); 
		}else{
			System.out.println();
			System.out.println("지원하지 않는 형식입니다.");
			System.out.println("010-1234-5678 형식으로 다시 입력하십시오.");
			Join(); //다시 회원가입 입력화면으로 이동
		}
	}
	

	
	// 1.회원가입 - 중복번호 검사
	public static void Check(String name, String phoneNo) {
		for (int i = 0; i < list.size(); i++) {
			if (phoneNo.trim().equals(list.get(i).getPhoneNo())) {
				System.out.println();
				System.out.println("이미 등록된 회원입니다.");
				return;
			}
		}
		//공백값 확인
		if(phoneNo.equals("")){ //번호 형식으로 입력되었는지 확인
			System.out.println();
			System.out.println("잘못된 번호 형식입니다. 올바르게 입력 부탁드립니다.");
			return;
		}else if(name.equals("")){
			System.out.println();
			System.out.println("잘못된 이름 형식입니다. 올바르게 입력 부탁드립니다.");
			return;
		}
		
		list.add(new Member(name, phoneNo));
		System.out.println("회원가입이 완료 되었습니다.");
	}
	

	static List<Member> memberPrint(){
		return list;
	}
	
}
