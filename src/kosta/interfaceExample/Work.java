package kosta.interfaceExample;

public class Work extends Man implements Speakable {

	
	public Work(){
	}	
	
	public Work(String name){
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println(this.getName()+"������ ���ؾ� �Ѵ�.");

	}

}
