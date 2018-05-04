package kosta.phone;

public class SchoolInfo extends PhoneInfo  implements phoneInterface {

	private String major;
	private String schoolNo;
	PhoneInfo p[];
	PhoneInfo p2 = new PhoneInfo();
	
	public SchoolInfo(){}
	
	public SchoolInfo(String name, String phoneNo, String birth, String major, String schoolNo) {
		super(name, phoneNo, birth);
		this.major = major;
		this.schoolNo = schoolNo;

	}

	@Override
	public void PhoneInsert() {
		super.PhoneInsert();
		System.out.print("전공: ");
		this.major = DataInput.DataInsert();
		System.out.print("학번: ");
		this.schoolNo = DataInput.DataInsert();	
		//	p[p2.getCount()] =new CompanyInfo(name, phoneNo, birth,major,schoolNo);
	}

	@Override
	public void PhonePrint() {
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
