package kosta.thread;

public class ThreadExam { //SmallLetters ������ ���� ������
	public static void main(String args[]) {
		
		//ThreadŬ������ �̿��� ��Ƽ������
/*		Thread thread = new DigitThread();
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try { // �빮�ڿ� ���ڸ� �����ư��鼭 ���� ���� ��� -> ���ÿ� �Ϸ��� ����ó��
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}*/
		
		//Runnable �������̽��� �̿��� ��Ƽ������ - �ѱ۰� ������ ���� ���
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		
		char arr[] = {'��', '��',  '��', '��', '��', '��',
							'��', '��', '��', '��', '��', '��', '��' };
		
		for(char ch : arr)
			System.out.println(ch);
		
		
		
	}
}
