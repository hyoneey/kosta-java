package kosta.thread;

public class SmallLetters implements Runnable {
	//���� �ҹ��ڸ� ����ϴ� �޼ҵ�
	@Override
	public void run() {
		for(char ch = 'a'; ch<='z'; ch++){
			System.out.println(ch);
		}
		
	}

}
