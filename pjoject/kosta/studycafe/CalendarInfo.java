package kosta.studycafe;

import java.util.Calendar;

public class CalendarInfo {

	static String day;
	static String time;

	public String nowDay() {  //오늘 날짜
		Calendar gc = Calendar.getInstance();
		 day = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 "
				+ gc.get(Calendar.DATE) + "일 ";
		 return day;
	}
	
	public String nowTime() { //현재시간
		Calendar gc = Calendar.getInstance();
		 time = gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분 ";
		 return time;
	}
	
	public String oneWeek() { //일주일 후 
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE, 7);
		 day = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 "
					+ gc.get(Calendar.DATE) + "일 ";
			 return day;
	}
	public String twoWeek() { //2주일 후
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE, 14);
		 day = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 "
					+ gc.get(Calendar.DATE) + "일 ";
			 return day;
	}
	public String Month() { //한달 후
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE, 30);
		 day = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 "
					+ gc.get(Calendar.DATE) + "일 ";
			 return day;
	}
	
	

}
