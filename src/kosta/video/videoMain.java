package kosta.video;

public class videoMain {

	public static void main(String[] args) {

		Video v1 = new Video(1, "1987", "하정우");
		Video v2 = new Video(2, "신과함께", "차태현");
		
		
		//부모 자식 관계이기 때문에 데이터 타입이 달라도 삽입이 가능 -> SpecialMember
		GeneralMember arr[] = {
				new GeneralMember("aaa", "홍길동", "동탄", v1),
				new SpecialMember("bbb", "김철수", "서울", v2, 100)
		}; 
		
		
		//print()를 하면 GeneralMember은 자신의 클래스의 print()메소드 호출 
		//					SpecialMember은 자신의 클래스의 print()메소드 호출
		for(int i=0; i<arr.length;i++){
			arr[i].Print();
		}
		
		// arr[1].printBonus() ; //호출 불가능 -> 데이터 형이 부모 GeneralMember의 형으로 변경되었기 때문에 자식의 메소드를 사용불가.
		//다시 자식의 타입으로 형변환을 해준뒤 자신의 메소드를 사용 할 수 있다.
		SpecialMember sm = (SpecialMember)arr[1];
		sm.printBonus();
		

/*		GeneralMember gm = new GeneralMember("aaa", "홍길동", "동탄", v1);
		SpecialMember sm = new SpecialMember("bbb", "김철수", "서울", v2, 100);

		gm.Print();
		System.out.println();
		sm.Print();*/

		
	}

}
