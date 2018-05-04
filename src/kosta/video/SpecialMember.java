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
		System.out.println("ȸ���� ���ʽ� ������ ���� : " + bonus);
	}
	
	
//super.�� �̿��� �θ�Ŭ������ �޼ҵ带 �����ͼ� ��� -> �޼ҵ� �������̵�
	@Override
	public void Print() {
		super.Print();
		System.out.println("ȸ���� ���ʽ� ������ ���� : " + bonus);
		
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
