package kosta.phone;

public class Manager {

	PhoneInfo p[] = new PhoneInfo[5]; // PhoneInfo 클래스 - 배열선언
	PhoneInfo pc[] = new CompanyInfo[5];
	PhoneInfo ps[] = new SchoolInfo[5];

	String select = null;
	String name, phone, birth;
	
	static int p_count = 0;
	static int ps_count = 0;
	static int pc_count = 0;

	public Manager() {
	}
		

	// 연락처 추가
	public void Insert() {
		System.out.println("1.직장 , 2.동창 , 3.기타 ");
		select = DataInput.DataInsert();

		if (select.equals("1")) { //직장
			
			pc[pc_count] =new CompanyInfo();
			pc[pc_count++].PhoneInsert();
				
		} else if (select.equals("2")) { //동창
			
			ps[ps_count] =new SchoolInfo();
			ps[ps_count++].PhoneInsert();
			
		} else if (select.equals("3")) { //기타
			p[p_count] =new PhoneInfo();
			p[p_count++].PhoneInsert();
		}
		System.out.println();
	}

	// 전체 목록 출력
	public void All_Print() {
		System.out.println("전체 전화번호부 출력");
		for (int i = 0; i < p_count; i++) {
			p[i].PhonePrint();
		}
		for (int i = 0; i < pc_count; i++) {
			pc[i].PhonePrint();
		}
		for (int i = 0; i < ps_count; i++) {
			ps[i].PhonePrint();
		}
		System.out.println();

	}

	// 연락처 그룹별 출력
	public void Group_Print() {
		System.out.println("1.직장 , 2.동창 , 3.기타 ");
		select = DataInput.DataInsert();

		if (select.equals("1")) {
			System.out.println("***** 직장 ******");
			for (int i = 0; i < pc_count; i++) {
				pc[i].PhonePrint();
			}
		} else if (select.equals("2")) {
			System.out.println("****** 동창 ******");
			for (int i = 0; i < ps_count; i++) {
				System.out.println(ps[i]);
			}
		} else if (select.equals("3")) {
			System.out.println("****** 기타 ******");
			for (int i = 0; i < p_count; i++) {
				System.out.println(p[i]);
			}
		}
		System.out.println();
	}

	// 검색
	public void Search() {
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < p_count; i++) {
			if (name.equals(p[i].getName())) {
				index = 1;
				p[i].PhonePrint();
			}
		}

		for (int i = 0; i < pc_count; i++) {
			if (name.equals(pc[i].getName())) {
				index = 1;
				pc[i].PhonePrint();
			}
		}

		for (int i = 0; i < ps_count; i++) {
			if (name.equals(ps[i].getName())) {
				index = 1;
				ps[i].PhonePrint();
			}
		}

		if (index == -1) { // 찾을 대상이 없을때
			System.out.println("대상을 찾을 수 없습니다.");
		}
	}

	// 삭제
	public void Delete() {
		System.out.print("삭제할 이름을 입력하세요: ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < p_count; i++) {
			if (name.equals(p[i].getName())) {
				index = 1;
				p[i] = p[i + 1];
				p[p_count] = null;
				p_count--;
				System.out.println("삭제되었습니다.");
			}
		}

		for (int i = 0; i < pc_count; i++) {
			if (name.equals(pc[i].getName())) {
				index = 1;
				pc[i] = pc[i + 1];
				pc[pc_count] = null;
				pc_count--;
				System.out.println("삭제되었습니다.");
			}
		}

		for (int i = 0; i < ps_count; i++) {
			if (name.equals(ps[i].getName())) {
				index = 1;
				ps[i] = ps[i + 1];
				ps[ps_count] = null;
				ps_count--;
				System.out.println("삭제되었습니다.");
			}
		}

		if (index == -1) { // 찾을 대상이 없을때
			System.out.println("대상을 찾을 수 없습니다.");
		}
	}
		
	// 수정
	public void Update() {
		System.out.print("수정할 이름을 입력하세요: ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < p_count; i++) {
			if (name.equals(p[i].getName())) {
				index = 1;
				System.out.print("전화번호: ");
				String phoneNo = DataInput.DataInsert();
				p[i].setPhoneNo(phoneNo);
			}

		}
		for (int i = 0; i < pc_count; i++) {
			if (name.equals(pc[i].getName())) {
				index = 1;
				System.out.print("전화번호: ");
				String phoneNo = DataInput.DataInsert();
				pc[i].setPhoneNo(phoneNo);
			}

		}
		for (int i = 0; i < ps_count; i++) {
			if (name.equals(ps[i].getName())) {
				index = 1;
				System.out.print("전화번호: ");
				String phoneNo = DataInput.DataInsert();
				ps[i].setPhoneNo(phoneNo);
			}
		}

		if (index == -1) { // 찾을 대상이 없을때
			System.out.println("대상을 찾을 수 없습니다.");
		}
	}
		
		
	
	

/*	// private 변수에 대한 검색
	public void Search() {
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = DataInput.DataInsert();
		int index = -1;
		
		for (int i = 0; i < count; i++) {
			if (name.equals(p[i].getName())) {
				index = i;
				System.out.print(name + "으로 찾은 검색 결과 : ");
				System.out.println(" 핸드폰 번호: " + p[i].getPhoneNo() + " 생년월일: " + p[i].getBirth());
			}
		}
		
		if(index == -1 ){ //찾을 대상이 없을때
			System.out.println("대상을 찾을 수 없습니다.");
		}
	}*/


}
