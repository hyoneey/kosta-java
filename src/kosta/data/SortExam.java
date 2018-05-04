package kosta.data;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {
	//���� ���� �缳�� => Comparator -> �������� ���ĵȰ��� �ٽ� ������ ��� ���� / �ϳ��� Ŭ������ ������ �������̽��ؼ� �����
	//���� ���� ���� => Comparable -> ó�� ������ ������

	public static void main(String[] args) {
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Desending()); 
		//treeSet<>()�� ���� - ��������, desending() Ŭ���� ��ü�� �����ϸ� ��������
		
		for(int i=0; set.size()<6; i++){
			int num = r.nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set);
		
	}

}
