package kosta.phoneList;

import kosta.phone.DataInput;

public class CompanyInfo extends PhoneInfo{
	
	private String dept;
	private String position;
	
	public CompanyInfo(){}

	public CompanyInfo(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}
	
	

	@Override
	public void DataInsert() {
		// TODO Auto-generated method stub
		super.DataInsert();
		System.out.print("�μ�: ");
		this.dept = DataInput.DataInsert();
		System.out.print("����: ");
		this.position = DataInput.DataInsert();
	}

	@Override
	public void PhonePrint() {
		// TODO Auto-generated method stub
		super.PhonePrint();
		System.out.println("�μ�: " +dept);
		System.out.println("����: " +position);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	
	

}
