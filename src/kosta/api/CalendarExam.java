package kosta.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String args[]) {

		// GregorianCalendar gc = new GregorianCalendar();
		// System.out.println(gc); //�˼����°�

		Calendar gc = Calendar.getInstance();

		//���� �ε��� ���̸� �����ֱ����� +1
		String now = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� " + gc.get(Calendar.DATE) + "�� "
				+ gc.get(Calendar.HOUR) + "�� " + gc.get(Calendar.MINUTE) + "�� ";

		System.out.println("���� �ð� : " + now); 

		// 1000�� �� ��¥?
		gc.add(Calendar.DATE, 1000);

		String future = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� " + gc.get(Calendar.DATE)
				+ "�� " + gc.get(Calendar.HOUR) + "�� " + gc.get(Calendar.MINUTE) + "�� ";

		System.out.println("1000�� ��  : " + future);
			
		//�ڽ��� ��ϳ� ��¥
		gc.set(2017, 11, 15); // 2017,12,15
		gc.add(Calendar.DATE, 1000);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy - MM - dd - hh:mm");
		String str =dateFormat.format(gc.getTime());
		System.out.println(str);
		
		char[] week = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		
		for(int i=2018; i<2028; i++){
			gc.set(i, 8,13); //9�� 13��
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1]; //���� �ε�����ȣ�� ���� -1
			System.out.println(i+"���� �������� ������ " + c + "���� �Դϴ�.");
		}
		
		

	}

}
