package kosta.thread;

public class TransferThread extends Thread { //계좌이체를 수행하는 스레드 클래스
	SharedArea sharedArea;

	public TransferThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {

		for(int cnt=0; cnt<12; cnt++){
			
				sharedArea.transfer(100);
				
/*			synchronized (sharedArea) {
				sharedArea.account1.withdraw(1000000);
				System.out.print("이몽룡 계좌 , 100만원 인출 ");
				
				sharedArea.account2.deposit(1000000);
				System.out.println("성춘향 계좌: 100만원 입금");	
			}*/
			
		
					
		}
		
	}

	
	
}
