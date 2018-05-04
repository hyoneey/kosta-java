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
		System.out.print("何辑: ");
		this.dept = DataInput.DataInsert();
		System.out.print("流困: ");
		this.position = DataInput.DataInsert();
	}

	@Override
	public void PhonePrint() {
		// TODO Auto-generated method stub
		super.PhonePrint();
		System.out.println("何辑: " +dept);
		System.out.println("流困: " +position);
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
