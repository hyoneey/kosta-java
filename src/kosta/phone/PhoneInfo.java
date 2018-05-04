package kosta.phone;

public class PhoneInfo implements phoneInterface {
	private String name;
	private String phoneNo;
	private String birth;
	private static int count =0;
	private PhoneInfo[] p =new PhoneInfo[10];

	PhoneInfo() {
	} // ������

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	// ����ó �߰�
	public void PhoneInsert() {
		System.out.print("�̸�: ");
		name = DataInput.DataInsert();
		System.out.print("�ڵ��� ��ȣ: ");
		phoneNo = DataInput.DataInsert();
		System.out.print("�������: ");
		birth = DataInput.DataInsert();
	}	
	
	//����ó ���
	public void PhonePrint(){
		System.out.println();
		System.out.println("�̸�: "+name);
		System.out.println("�ڵ��� ��ȣ: "+phoneNo);
		System.out.println("�������: "+birth);
	}
	
	
	// ����ϴ� �޼ҵ�
	public void Print() {
		System.out.println("�̸�: " + name + " �ڵ��� ��ȣ: " + phoneNo + " �������: " + birth);
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
