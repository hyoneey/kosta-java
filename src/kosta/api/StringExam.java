package kosta.api;

import java.util.StringTokenizer;

public class StringExam {

	public static void main(String[] args) {
		
		String str = "ABC"; //객체 생성
		String str2 = new String("abc"); //객체 생성
		
		
		//String 불변성 - 리턴을 받아야 문자열 변경이 가능하다
		String str3 = str.concat("DEF"); //문자열 할당 - 문자열 뒤에 이어 붙이는 함수 concat()이나 String str3 = 을 사용하지 않으면 문자열은 변하지 않음
		System.out.println(str3); // ABCDEF
		
		//StringBuffer, StirngBuilder 가변성 - 문자열을 변경하기 위한 클래스 
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb);  // 가나다라마바
		
		String sql = "select * from board ";
		int num = 10;
		if(num == 10 ){
			sql += "where num = 10"; // select * from board where num = 10
		}
		System.out.println(sql);
		
		//해당 문자열의 위치파악 indexOf() => 0부터 시작 , 없으면 -1
		System.out.println(sql.indexOf("*")); // 7번째 인덱스
		System.out.println(sql.indexOf("$")); // -1 
		
		//문자열 길이 length()
		System.out.println(sql.length());
		
		
		//문자열 부분 추출 -index는 0부터 시작 
		System.out.println(sql.substring(0, 12)); // (시작 인덱스 , 끝 인덱스) - 출력 select * fro
		
		//sql변수에 있는 문자열에 board 내용만 추출해서 출력하자.
		//단, substring(), indexOf() 메소드만 이용 - 인덱스번호로 찾기 금지	
		System.out.println(sql.substring( sql.indexOf("board"), sql.indexOf("board")+5));
		
		String fileName = "kosta.jpg";
		String head = ""; //kosta
		String patter = ""; //jpg
		
		head = fileName.substring(0,fileName.indexOf("."));
		patter = fileName.substring(fileName.indexOf(".")+1,fileName.length());
		System.out.println(head + " : " + patter);
		
		String id = "kosta ";
		String m_id = "Kosta"; // .equls() -> 다름으로 출력 id 뒤에 공백이 존재 , 단 대소문자 구별 불가
		
		if(id.trim().equals(m_id)){ //.trim()은 앞 뒤 공백을 제거해주는 역할 -> 같음 출력
			System.out.println("같음");
		}else{
			System.out.println("다름"); 
		}

		if(id.trim().equalsIgnoreCase(m_id)){ //..equalsIgnoreCase()은 대소문자를 구별하지 않아서 같음이 출력
			System.out.println("같음");
		}else{
			System.out.println("다름"); 
		}
		
		//문자열 => 배열 변환
		String fruits = "사과, 배, 포도, 수박";
		String arr[] = fruits.split(","); //문자열을 ','를 기준으로 나누어서 배열에 넣어줌
		
		for(String name : arr){
			System.out.println(name); //사과 배 포도 수박
		}
		
		
		String a = fileName.replace(".", "++"); // kosta++jpg
		String b = fileName.replaceAll("ko", "+");// +sta.jpg
		System.out.println(a);
		System.out.println(b);
		
		
		int n = 100;
		String s = n+""; //형변환
		
		//fileName => 확장자 gif, jpg => 이미지 파일 입니다. :endsWith()이요
		
		if(fileName.endsWith("gif") || fileName.endsWith("jpg")){
			System.out.println("이미지 파일입니다.");
		}else{
			System.out.println("이미지 파일이 아닙니다.");
		}
		
		
		

	}

}
