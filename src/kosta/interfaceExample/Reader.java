package kosta.interfaceExample;

public class Reader extends Man implements Speakable {
	
	Reader(){}

	public Reader(String name) {
		super(name);
	}


	@Override
	public void speak() {
		System.out.println(this.getName()+"�ڹ� ȭ����");
	}

}
