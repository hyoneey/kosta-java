package kosta.video;

public class videoMain {

	public static void main(String[] args) {

		Video v1 = new Video(1, "1987", "������");
		Video v2 = new Video(2, "�Ű��Բ�", "������");
		
		
		//�θ� �ڽ� �����̱� ������ ������ Ÿ���� �޶� ������ ���� -> SpecialMember
		GeneralMember arr[] = {
				new GeneralMember("aaa", "ȫ�浿", "��ź", v1),
				new SpecialMember("bbb", "��ö��", "����", v2, 100)
		}; 
		
		
		//print()�� �ϸ� GeneralMember�� �ڽ��� Ŭ������ print()�޼ҵ� ȣ�� 
		//					SpecialMember�� �ڽ��� Ŭ������ print()�޼ҵ� ȣ��
		for(int i=0; i<arr.length;i++){
			arr[i].Print();
		}
		
		// arr[1].printBonus() ; //ȣ�� �Ұ��� -> ������ ���� �θ� GeneralMember�� ������ ����Ǿ��� ������ �ڽ��� �޼ҵ带 ���Ұ�.
		//�ٽ� �ڽ��� Ÿ������ ����ȯ�� ���ص� �ڽ��� �޼ҵ带 ��� �� �� �ִ�.
		SpecialMember sm = (SpecialMember)arr[1];
		sm.printBonus();
		

/*		GeneralMember gm = new GeneralMember("aaa", "ȫ�浿", "��ź", v1);
		SpecialMember sm = new SpecialMember("bbb", "��ö��", "����", v2, 100);

		gm.Print();
		System.out.println();
		sm.Print();*/

		
	}

}
