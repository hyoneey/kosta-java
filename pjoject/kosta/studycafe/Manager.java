package kosta.studycafe;

public class Manager { 
	ManagerMenu mm = new ManagerMenu();
	//관리자 로그인
	public void managerLogin() {
			System.out.println();
			System.out.println("***** 관리자 로그인 화면 *****");
			System.out.print("관리자 번호를 입력 하세요. : ");
			String phoneNo = DataInput.DataInsert();
			
			if (phoneNo.equals("0000")) {
				System.out.println("관리자 로그인 성공");
				mm.m_function();
			} else
				System.out.println("핸드폰 번호를 다시 확인하세요.");
		}
}
