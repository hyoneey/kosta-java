package kosta.thread;

public class TransferThread extends Thread { //������ü�� �����ϴ� ������ Ŭ����
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
				System.out.print("�̸��� ���� , 100���� ���� ");
				
				sharedArea.account2.deposit(1000000);
				System.out.println("������ ����: 100���� �Ա�");	
			}*/
			
		
					
		}
		
	}

	
	
}
