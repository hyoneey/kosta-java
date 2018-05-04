package kosta.phoneList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import kosta.data.Person;
import kosta.phone.DataInput;

public class Manager{

	List<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	String select = null;
	
	

	public Manager() {
	}

	// 입력
	public void Insert() {
		System.out.println("1.기타 , 2.직장 , 3.동창  ");
		select = DataInput.DataInsert();

		if (select.equals("1")) { // 기타
			list.add(new PhoneInfo()); // 객체추가
			list.get(list.size() - 1).DataInsert(); // list.size()-1 이 인덱스번호가
													// 0부터이기때문
		} else if (select.equals("2")) { // 직장
			list.add(new CompanyInfo()); // 객체추가
			list.get(list.size() - 1).DataInsert(); // list.size()-1 이 인덱스번호가
													// 0부터이기때문

		} else if (select.equals("3")) { // 동창
			list.add(new SchoolInfo()); // 객체추가
			list.get(list.size() - 1).DataInsert(); // list.size()-1 이 인덱스번호가
													// 0부터이기때문
		}
		System.out.println();
	}

	// 전체 목록 출력
	public void All_Print() {
		System.out.println("전체 전화번호부 출력");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).PhonePrint();
		}
	}

	// 검색
	public void Search() {
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				index = 1;
				list.get(i).PhonePrint();
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

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				index = 1;
				list.remove(i);
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

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				index = 1;
				System.out.print("전화번호: ");
				String phoneNo = DataInput.DataInsert();
				list.get(i).setPhoneNo(phoneNo);
			}

		}

		if (index == -1) { // 찾을 대상이 없을때
			System.out.println("대상을 찾을 수 없습니다.");
		}
	}

	//정렬
	public void sort() {
		Collections.sort(list, new Comparator<PhoneInfo>() {
			@Override
			public int compare(PhoneInfo p1, PhoneInfo p2) {
				if (p1.getName().compareTo(p2.getName()) < 0)
					return -1;
				else if (p1.getName().compareTo(p2.getName()) > 0)
					return 1;
				return 0;
			}
		});
		System.out.println("***연락처 정렬 ***");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).PhonePrint();
		}
	}


}
