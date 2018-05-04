package kosta.thread;

import kosta.thread.Account;

public class MultithreadExam { //°èÁÂÀÌÃ¼¸¦ À§ÇÑ ¸ŞÀÎ ½º·¹µå

	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("ÀÌ¸ù·æ",20000000);
		area.account2 = new Account("¼ºÃáÇâ",10000000);
		
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();

	}

}
