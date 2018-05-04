package kosta.phoneList;

public class PhoneInfo implements Comparable<PhoneInfo>  {

	private String name;
	private String phone;
	private String birth;
	private static int count =0;
	
	public PhoneInfo(){}
	
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phone = phoneNo;
		this.birth = birth;
	}
	
	public void DataInsert() {
		System.out.print("�̸�: ");
		this.name = DataInput.DataInsert();
		System.out.print("�ڵ��� ��ȣ: ");
		this.phone = DataInput.DataInsert();
		System.out.print("�������: ");
		this.birth = DataInput.DataInsert();
	}	
	
	public void PhonePrint(){
		System.out.println();
		System.out.println("�̸�: "+name);
		System.out.println("�ڵ��� ��ȣ: "+phone);
		System.out.println("�������: "+birth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhoneNo(String phoneNo) {
		this.phone = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		PhoneInfo.count = count;
	}

	@Override
	public int compareTo(PhoneInfo p) {
/*		if(phone>p.getPhone())
			return -1;
		else if(phone<p.getPhone())
			return 1;*/
		
		return 0;
	}


	
	
}
