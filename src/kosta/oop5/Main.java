package kosta.oop5;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		
		Object[] obj = { //최상위 객체의 클래스
			new Reader("둘리"),
			new Worker("길동"),
			new Student("마이콜") 
		};
		
		for(int i=0;i<obj.length;i++){
			if(obj[i] instanceof Speakeable){ // 형변환가능한지 조건 검사
				Speakeable speaker = (Speakeable)obj[i]; //캐스팅 - 형변환
				System.out.println(speaker.speak());
			}
		}
		//student는 speakable을 implement를 안하므로 출력되지 않는다.
		//인터페이스로 형변환 해야 인터페이스로 호출가능하다
		//인터페이스로 형변환이 가능하다.

	}

}
