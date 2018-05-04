package kosta.thread;

public class Baker extends Thread {
	private String threadName;
	private Manager m;
	
	public Baker(){}
	
	public Baker(String threadName, Manager m) {
		super();
		this.threadName = threadName;
		this.m = m;
	}

	@Override
	public void run() {
		for(int i=0; i<20; i++){
			m.push(threadName, getBread());
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}

	public String getBread(){
		String bread = "";
		int num = (int) ( Math.random() * 3 ); //0~2 ���� ����

		switch (num) {
		case 0:
			bread = "��ũ����";
			break;
		case 1:
			bread = "�Һ��λ�";
			break;
		case 2:
			bread = "���ڻ�";
			break;
		}
		
		return bread;
	}
	
}
