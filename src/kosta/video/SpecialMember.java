package kosta.video;

public class SpecialMember extends GeneralMember {

	private int bonus;

	public SpecialMember() {
	}

	public SpecialMember(String id, String name, String addr, Video video, int bonus) {
		super(id, name, addr, video);
		this.bonus = bonus;
	}

	public void printBonus() {
		System.out.println("회원의 보너스 포린터 적립 : " + bonus);
	}
	
	
//super.을 이용해 부모클래스의 메소드를 가져와서 출력 -> 메소드 오버라이딩
	@Override
	public void Print() {
		super.Print();
		System.out.println("회원의 보너스 포린터 적립 : " + bonus);
		
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
