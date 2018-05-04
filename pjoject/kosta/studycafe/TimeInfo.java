package kosta.studycafe;


public class TimeInfo {
	String phoneNo = "";
	String checkDay = "";
	String checkIn = "";
	String checkOut = "";
	
	TimeInfo(){}
	
	public TimeInfo(String phoneNo, String checkDay, String checkIn, String checkOut) {
		super();
		this.phoneNo = phoneNo;
		this.checkDay = checkDay;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public TimeInfo(String phoneNo, String checkDay, String checkIn) {
		super();
		this.phoneNo = phoneNo;
		this.checkDay = checkDay;
		this.checkIn = checkIn;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public String getCheckDay() {
		return checkDay;
	}

	public void setCheckDay(String checkDay) {
		this.checkDay = checkDay;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "TimeInfo [phoneNo=" + phoneNo + ", checkDay=" + checkDay + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + "]";
	}
	
	
}
