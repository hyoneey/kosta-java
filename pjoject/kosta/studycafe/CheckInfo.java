package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

import kosta.studycafe.JoinInfo;

public class CheckInfo extends ReservationInfo {
	static List<TimeInfo> timelist = new ArrayList<TimeInfo>(); // 시간정보 저장
	String menu = "";
	CalendarInfo cal = new CalendarInfo();
	String checkDay = "";
	String checkIn = "";
	String checkOut = "";

	// 입퇴실 - 예약한 정보를 가져와 보여주고 없으면 오류발생
	public void checkInOut(String name, String phoneNo) {

		System.out.println();
		System.out.println("***** 입/퇴실 화면 *****");

		// 오늘 전혀 예약이 되지 않은 경우
		if (reservationList.size() == 0) {
			System.out.println("입/퇴실 : 오늘 예약된 정보가 존재하지 않습니다. 예약 가능인원 :  " + count);
			return;
		}

		for (int i = 0; i < reservationList.size(); i++) {// 예약정보가 존재
			// 예약리스트에 폰번호가 존재하면
			if (phoneNo == reservationList.get(i).ResevationPhone) {
				// 결제가 되지않을때
				if (JoinInfo.list.get(i).getType().equals("")) {
					System.out.println("결제가 진행 되지 않았습니다.");
					break;
				}

				// 예약 정보가 존재 하고 예약날짜가 오늘 날짜와 같으면
				if (reservationList.get(i).getResevationDate().equals(cal.nowDay())) {

					System.out.print("1.입실 2.퇴실 : ");
					menu = DataInput.DataInsert();

					if (menu.equals("1")) { // 입실
						System.out.println(name + "님이 입실 하였습니다.");
						checkDay = c.nowDay();
						checkIn = c.nowTime();
						System.out.println("입실 시간: " + checkDay + checkIn);
						timelist.add(new TimeInfo(phoneNo, checkDay, checkIn));

					} else if (menu.equals("2")) { // 퇴실
						// 입실이 null일 때 퇴실이 발생하면 오류발생
						try {
							if (timelist.get(i).checkIn.equals("")) {
								System.out.println("입실 처리가 되지 않았습니다.");
							} else {
								System.out.println(name + "님이 퇴실 하였습니다.");
								checkDay = c.nowDay();
								checkOut = c.nowTime();
								System.out.println("퇴실 시간: " + checkDay + checkOut);
								count++;

								for (int j = 0; j < timelist.size(); j++) {
									if (phoneNo.equals(timelist.get(j).phoneNo)) {
										if (timelist.get(i).checkDay.equals(checkDay)) {
											timelist.get(i).setCheckOut(checkOut);
										}
									}
								}
							} // 퇴실 조건
						} catch (IndexOutOfBoundsException e) {
							System.out.println("입실 처리를 해주세요.");
						}
					} // if문 end
				} else { // 동일한 날짜 예약이 존재하지 않은 경우
					System.out.println(name + " 님의 " + cal.nowDay() + " 날짜로 예약된 정보가 존재하지 않습니다.");
				}
			}
		} // for문
	}// chckInOut End

	static List<TimeInfo> timePrint() {
		return timelist;
	}

}
