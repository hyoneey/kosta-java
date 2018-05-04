package kosta.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {

	public static void main(String[] args) {
		// 2018년 2월 캘린더 만듥;
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE);
		System.out.println(n);

		// 입력 : 2
		// <2018년 2월>
		// 일 월 화 수 목 금 토
		// 1 2 3 //시작 요일 기준으로 -빈공간 -> 그 합한 값까지 7을 넘으면 개행
		// 4 5 6 7 8 9 10

		Scanner sc = new Scanner(System.in);
		System.out.print("Month 입력: ");
		int month = sc.nextInt();
		int count =0;
		
		gc.set(2018,month,1);
		int c = gc.get(Calendar.DAY_OF_WEEK) - 1;
//		System.out.println(c);

		System.out.println("<2018년 " + month + "월>");
		System.out.println("일	월	화	수	목	금	토");
		
		for(int j=1; j<=c; j++){
			System.out.print("	");
			count += 1;
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "	");
			count +=1;

			if (count%7 ==0) {
				System.out.println();
			}
		}

	}

}
