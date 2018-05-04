package kosta.phoneList;

import kosta.phone.DataInput;

public class SchoolInfo extends PhoneInfo{
	
	private String major;
	private String schoolNo;

	public SchoolInfo(){}

	public SchoolInfo(String name, String phoneNo, String birth, String major, String schoolNo) {
		super(name, phoneNo, birth);
		this.major = major;
		this.schoolNo = schoolNo;
	}
	
	

	@Override
	public void DataInsert() {
		// TODO Auto-generated method stub
		super.DataInsert();
		System.out.print("전공: ");
		this.major = DataInput.DataInsert();
		System.out.print("학번: ");
		this.schoolNo = DataInput.DataInsert();	
	}
	
	
	

	@Override
	public void PhonePrint() {
		// TODO Auto-generated method stub
		super.PhonePrint();
		System.out.println("전공: " +major);
		System.out.println("학번: " +schoolNo);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSchoolNo() {
		return schoolNo;
	}

	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}
	

	
	
	

}
