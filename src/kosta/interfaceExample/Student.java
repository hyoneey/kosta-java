package kosta.interfaceExample;

public class Student extends Man {
	private Speakable speakable;
	
	Student(){}
	
	public Student(String name) {
		super(name);
	}

	void speak(){
		System.out.println(this.getName()+"공부나 열심히 해");
	}

	public Speakable getSpeakable() {
		return speakable;
	}

	public void setSpeakable(Speakable speakable) {
		this.speakable = speakable;
	}




}
