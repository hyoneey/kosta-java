package kosta.oop5;

public class Worker extends Man implements Speakeable {

	public Worker(String name){
		super(name);
	}
	
	@Override
	public String speak() {		
		return getName() + " ������ ���ؾ� �Ѵ�.";
	}

}
