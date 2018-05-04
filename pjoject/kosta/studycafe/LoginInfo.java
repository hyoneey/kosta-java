package kosta.studycafe;

public class LoginInfo extends JoinInfo {
	Customer cus = new Customer();

	// 로그인
		public void login() {
			System.out.println();
			System.out.println("***** 로그인 화면 *****");
			System.out.print("번호를 입력 하세요.: ");
			String phoneNo = DataInput.DataInsert();

			for (int i = 0; i < list.size(); i++) {
				if (phoneNo.equals(list.get(i).getPhoneNo())) {
					System.out.println("로그인 성공");
					String name = list.get(i).getName();
					cus.c_function(name, phoneNo);
					return;
				}
			}
			System.out.println("핸드폰 번호를 다시 확인하세요.");
			System.out.println("등록되지 않은 회원이거나, 번호를 잘못 입력하셨습니다.");
		}
		
}
