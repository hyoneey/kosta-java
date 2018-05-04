package kosta.studycafe;

public class Member {
	private String name;
	private String phoneNo;
	private String type=""; //����� ����
	private String typeStart=""; //����� ������
	private String typeEnd=""; // ����� ������
	
	public Member(){}

	public Member(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeStart() {
		return typeStart;
	}

	public void setTypeStart(String typeStart) {
		this.typeStart = typeStart;
	}

	public String getTypeEnd() {
		return typeEnd;
	}

	public void setTypeEnd(String typeEnd) {
		this.typeEnd = typeEnd;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", phoneNo=" + phoneNo + ", type=" + type + ", typeStart=" + typeStart
				+ ", typeEnd=" + typeEnd + "]";
	}



}
