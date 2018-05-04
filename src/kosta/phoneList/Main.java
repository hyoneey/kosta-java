package kosta.phoneList;

import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Manager m = new Manager(); // Manager 객체 생성

		String menu = null;

		while (true) {
			System.out.println(
					"1.연락처 생성 , 2.연락처 전체 출력 , 3. 연락처 검색 " + ", 4. 연락처 삭제 , 5.연락처 수정, 6.연락처 정렬, 7. 프로그램 종료");
			menu = DataInput.DataInsert();

			switch (menu) {
			case "1": // 연락처 생성
				m.Insert();
				System.out.println();
				break;
			case "2": // 연락처 전체출력				
				m.All_Print();
				break;
			case "3": // 연락처 검색
				m.Search();
				System.out.println();
				break;
			case "4": // 연락처 삭제
				m.Delete();
				System.out.println();
				break;
			case "5": // 연락처 수정
				m.Update();
				break;
			case "6": // 연락처 정렬
				m.sort();
				break;
			case "7": // 프로그램 종료
				return;

			}

	}

	}
}

