package kosta.data;

import java.util.Comparator;

public class Desending implements Comparator<Integer> {  //������ �������ϴ� �Լ� Comparator

	@Override
	public int compare(Integer o1, Integer o2) {
		
		//�������� ���� ���ı��� ����
		if(o1 < o2){
			return 1; // o2�� ũ�� �ڸ��� �����ض�
		}else if( o1 > o2){
			return -1; // �ڸ��� �������� ���ƶ�
		}
		
		return 0;
	}

}
