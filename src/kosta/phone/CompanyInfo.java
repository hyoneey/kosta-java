package kosta.phone;

public class CompanyInfo extends PhoneInfo  implements phoneInterface {

	private String dept;
	private String position;
	int count ;
	PhoneInfo p[];
	PhoneInfo p2 = new PhoneInfo();
	
	
	public CompanyInfo(){}
	
	public CompanyInfo(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;

	}
	
	// ���� �߰�
	@Override
	public void PhoneInsert() {
		super.PhoneInsert();
		System.out.print("�μ�: ");
		this.dept = DataInput.DataInsert();
		System.out.print("����: ");
		this.position = DataInput.DataInsert();
//		p[p2.getCount()] =new CompanyInfo(name, phoneNo, birth,dept,position);	
	}

	// ���� ���
	@Override
	public void PhonePrint() {
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
