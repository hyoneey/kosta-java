package kosta.thread;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	List<String> list = new ArrayList<String>();
	
	public synchronized void push(String threadName, String bread){
		//�������̸� ������ => list ����� 5 �̻�
		//�������̸� ������ ���� => list ����� 5����
		//this.wait(), this.notify()

		if (list.size() >= 5) {
			try {
				System.out.println(threadName + " ������");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			list.add(bread);
			System.out.println(threadName + "	" + bread + " ����");
			this.notify();
		}
	
	}
	
	public synchronized void pop(String threadName){
		//�������̸� ������ => list ����� 0�϶�
		//������ �� ����: 0�
		//�������̸� ������ �簨 => list ����� 1�̻�
		//this.wait(), this.notify()
		//���� ��������� �簡���ϸ� wait�ɾ��� ����Ʈ�� ������ �ε����� �簨
		//�簡�� ���� ������ ����Ƿ� notify / �ݺ��� if�� ���ο� ������6�� ��ŸƮ
		
		if(list.size() == 0){
			try {
				System.out.println(threadName+" ������");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
		
				System.out.println("������ �� ���� : "+list.size());
				String bread = list.remove(list.size()-1);
				System.out.println(threadName+"  "+bread+" �簨");
				this.notify();
		}	
	}

}
