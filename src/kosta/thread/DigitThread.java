package kosta.thread;

public class DigitThread extends Thread { 

	public void run() {
		{
			for (int i = 0; i < 10; i++) {
				System.out.println(i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
