package kosta.oop2;

public class Study implements Role2 {

	@Override
	public void doIt() { //추상메소드가 있어서 오버라이드됨
		
		System.out.println("스터디");
	}

}
