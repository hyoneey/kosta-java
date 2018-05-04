package kosta.interfaceExample;

public class Student extends Man {
	private Speakable speakable;
	
	Student(){}
	
	public Student(String name) {
		super(name);
	}

	void speak(){
		System.out.println(this.getName()+"���γ� ������ ��");
	}

	public Speakable getSpeakable() {
		return speakable;
	}

	public void setSpeakable(Speakable speakable) {
		this.speakable = speakable;
	}




}
