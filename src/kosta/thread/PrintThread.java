package kosta.thread;

public class PrintThread extends Thread { //°èÁÂ Ãâ·ÂÀ» ¼öÇàÇÏ´Â ½º·¹µå 
	SharedArea sharedArea;

	public PrintThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {

		for (int cnt = 0; cnt < 3; cnt++) {
			long sum = sharedArea.getTotal();
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: "+sum);
			
		/*	synchronized (sharedArea) {
				long sum = sharedArea.account1.balance + sharedArea.account2.balance;
				System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: " + sum);
			}*/

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}
	
	

}
