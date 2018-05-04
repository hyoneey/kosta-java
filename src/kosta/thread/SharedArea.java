package kosta.thread;

import kosta.thread.Account;

public class SharedArea { //°èÁÂ ¼öÇàÀ» À§ÇÑ °øÀ¯ ½º·¹µå
	Account account1; //ÀÌ¸ù·æ °èÁÂ
	Account account2; //¼ºÃáÇâ °èÁÂ
	
	synchronized void transfer(int amount){
		account1.withdraw(1000000);
		System.out.print("ÀÌ¸ù·æ °èÁÂ , 100¸¸¿ø ÀÎÃâ ");	
		account2.deposit(1000000);
		System.out.println("¼ºÃáÇâ °èÁÂ: 100¸¸¿ø ÀÔ±İ");	
	}
	
	synchronized long getTotal(){
		return account1.balance + account2.balance;
	}

}
