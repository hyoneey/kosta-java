package kosta.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] arg){
		String m_id = "kosta";
		String m_pass = "1234";
		
		//키보드로부터 id와 pass 입력 받아서
		//성공(id,pass) 일치 => 로그인 성공
		//실패 => id 불일치 => 해당 id가 존재하지 않습니다.
		//실패 => pass 불일치 => 비밀번호가 일치하지 않습니다.
		
		//문자열 비교 .equals(대상) 
		
		String id, pass;

		Scanner sc = new Scanner(System.in);

		// System.out.println("아이디와 패스워드를 입력해주세요.\n");

		System.out.println("아이디: ");
		id = sc.nextLine();

		System.out.println("패스워드: ");
		pass = sc.nextLine();

		if (id.equals(m_id) && pass.equals(m_pass)) {
			System.out.println("로그인 성공\n");
		} else {
			if (!pass.equals(m_pass)) {
				System.out.println("비밀번호가 일치하지 않습니다.\n");
			} else {
				System.out.println("아이디가 존재하지 않습니다.\n");
			}
		}
		

/*		String id = "kosta";
		if(id.equals(m_id)){
			System.out.println("아이디일치");
		}*/
	}
}
