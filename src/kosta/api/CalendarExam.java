package kosta.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String args[]) {

		// GregorianCalendar gc = new GregorianCalendar();
		// System.out.println(gc); //알수없는값

		Calendar gc = Calendar.getInstance();

		//월은 인덱스 길이를 맞춰주기위해 +1
		String now = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분 ";

		System.out.println("현재 시간 : " + now); 

		// 1000일 후 날짜?
		gc.add(Calendar.DATE, 1000);

		String future = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE)
				+ "일 " + gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분 ";

		System.out.println("1000일 후  : " + future);
			
		//자신의 사귄날 날짜
		gc.set(2017, 11, 15); // 2017,12,15
		gc.add(Calendar.DATE, 1000);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy - MM - dd - hh:mm");
		String str =dateFormat.format(gc.getTime());
		System.out.println(str);
		
		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		
		for(int i=2018; i<2028; i++){
			gc.set(i, 8,13); //9월 13일
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1]; //월의 인데스번호를 위해 -1
			System.out.println(i+"년의 영현이의 생일은 " + c + "요일 입니다.");
		}
		
		

	}

}
