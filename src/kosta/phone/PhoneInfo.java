package kosta.phone;

public class PhoneInfo implements phoneInterface {
	private String name;
	private String phoneNo;
	private String birth;
	private static int count =0;
	private PhoneInfo[] p =new PhoneInfo[10];

	PhoneInfo() {
	} // 생성자

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	// 연락처 추가
	public void PhoneInsert() {
		System.out.print("이름: ");
		name = DataInput.DataInsert();
		System.out.print("핸드폰 번호: ");
		phoneNo = DataInput.DataInsert();
		System.out.print("생년월일: ");
		birth = DataInput.DataInsert();
	}	
	
	//연락처 출력
	public void PhonePrint(){
		System.out.println();
		System.out.println("이름: "+name);
		System.out.println("핸드폰 번호: "+phoneNo);
		System.out.println("생년월일: "+birth);
	}
	
	
	// 출력하는 메소드
	public void Print() {
		System.out.println("이름: " + name + " 핸드폰 번호: " + phoneNo + " 생년월일: " + birth);
	}

	@Override
	public String toString() {
		return "PhoneInfo [Name=" + name + ", phoneNo=" + phoneNo + ", birth=" + birth + "]";
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public static void setCount(int count) {
		PhoneInfo.count = count;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}



	
	
}
