package kosta.thread;

import kosta.thread.Account;

public class SharedArea { //���� ������ ���� ���� ������
	Account account1; //�̸��� ����
	Account account2; //������ ����
	
	synchronized void transfer(int amount){
		account1.withdraw(1000000);
		System.out.print("�̸��� ���� , 100���� ���� ");	
		account2.deposit(1000000);
		System.out.println("������ ����: 100���� �Ա�");	
	}
	
	synchronized long getTotal(){
		return account1.balance + account2.balance;
	}

}
