package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

import kosta.studycafe.CalendarInfo;
import kosta.studycafe.DataInput;
import kosta.studycafe.Reservation;
import kosta.studycafe.TimeInfo;

public class ReservationInfo extends JoinInfo {
	static int count = 10; // 수용 인원
	static List<Reservation> reservationList = new ArrayList<Reservation>();// 예약정보
																			// 저장
	CalendarInfo c = new CalendarInfo(); // 날짜
	List<TimeInfo> timelist = new ArrayList<TimeInfo>(); // 시간정보 저장
	String menu = "";

	public ReservationInfo() {
	}

	// 예약
	public void Reservation(String phoneNo) {
		while (true) {

			System.out.println();
			System.out.println("***** 예약화면 *****");
			System.out.println("당일 예약만 가능합니다.(최대 10명)");
			System.out.println();

			if (count == 0) {
				System.out.println("죄송합니다. 오늘은 예약할 수 있는 인원이 가득찼습니다.");
				System.out.println("다음에 이용 부탁드립니다.");
				break;
			} else {
				System.out.println("오늘 예약 가능한 인원: " + count);
				System.out.print("예약하시겠습니까? (y,n) ");
				String check = DataInput.DataInsert();

				if (check.trim().equalsIgnoreCase("y")) {// 예약
					
					//오늘 예약된 정보가 존재하면 중복 방지
					for(int i=0; i<reservationList.size();i++){ 
						if(phoneNo.equals(reservationList.get(i).getResevationPhone())){
							if(reservationList.get(i).getResevationDate().equals(c.nowDay())){
								System.out.println("오늘 예약된 정보가 존재 합니다.");
								return;
							}
						}
					}
					
					count--;
					System.out.println(phoneNo + "님의 예약이 완료 되었습니다. 예약  날짜: " + c.nowDay());
					reservationList.add(new Reservation(c.nowDay(), phoneNo));
					return;

				} else if (check.trim().equalsIgnoreCase("n")) { //취소
					return;
				}

			}
		}
	} // Reservation End

	public void Print() {
		for (Reservation s : reservationList)
			System.out.println(s);
//		System.out.println(reservationList.size());
	}
	
	static  List<Reservation> ReservationPrint(){
		return reservationList;
	}

}
