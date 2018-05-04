package kosta.thread;

import kosta.thread.Account;

public class MultithreadExam { //������ü�� ���� ���� ������

	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("�̸���",20000000);
		area.account2 = new Account("������",10000000);
		
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();

	}

}
