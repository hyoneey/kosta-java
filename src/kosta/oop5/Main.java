package kosta.oop5;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		
		Object[] obj = { //�ֻ��� ��ü�� Ŭ����
			new Reader("�Ѹ�"),
			new Worker("�浿"),
			new Student("������") 
		};
		
		for(int i=0;i<obj.length;i++){
			if(obj[i] instanceof Speakeable){ // ����ȯ�������� ���� �˻�
				Speakeable speaker = (Speakeable)obj[i]; //ĳ���� - ����ȯ
				System.out.println(speaker.speak());
			}
		}
		//student�� speakable�� implement�� ���ϹǷ� ��µ��� �ʴ´�.
		//�������̽��� ����ȯ �ؾ� �������̽��� ȣ�Ⱑ���ϴ�
		//�������̽��� ����ȯ�� �����ϴ�.

	}

}
