package kosta.studycafe;

import java.util.Calendar;

public class CalendarInfo {

	static String day;
	static String time;

	public String nowDay() {  //���� ��¥
		Calendar gc = Calendar.getInstance();
		 day = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� "
				+ gc.get(Calendar.DATE) + "�� ";
		 return day;
	}
	
	public String nowTime() { //����ð�
		Calendar gc = Calendar.getInstance();
		 time = gc.get(Calendar.HOUR) + "�� " + gc.get(Calendar.MINUTE) + "�� ";
		 return time;
	}
	
	public String oneWeek() { //������ �� 
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE, 7);
		 day = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� "
					+ gc.get(Calendar.DATE) + "�� ";
			 return day;
	}
	public String twoWeek() { //2���� ��
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE, 14);
		 day = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� "
					+ gc.get(Calendar.DATE) + "�� ";
			 return day;
	}
	public String Month() { //�Ѵ� ��
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE, 30);
		 day = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� "
					+ gc.get(Calendar.DATE) + "�� ";
			 return day;
	}
	
	

}
