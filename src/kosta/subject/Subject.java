package kosta.subject;

public class Subject {

	String subName;
	int subScore;
	String subject[] = new String[3];
	int kor,eng,mat;
	
	Subject(String subName, int subScore) {
		super();
		this.subName = subName;
		this.subScore = subScore;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubScore() {
		return subScore;
	}

	public void setSubScore(int subScore) {
		this.subScore = subScore;
	}
	

		
	}



