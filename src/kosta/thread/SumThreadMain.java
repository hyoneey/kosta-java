package kosta.thread;

public class SumThreadMain { //Sum�����带 ���� ���� ������
	
	public static void main(String args[]){
		
	SumThread s1 = new SumThread(1,50);
	SumThread s2 = new SumThread(51,100);
	
	s1.start();
	s2.start();
//	System.out.println("1~100������ �� : "+ (s1.getSum()+s2.getSum())); //1275 �����Ƿ� ����ó�� 
	
	try {
		s1.join(); //s1 �����Ҷ� ������ main ������� ��ٸ��� ��ɾ� 
		s2.join();
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	System.out.println("1~100������ �� : "+ (s1.getSum()+s2.getSum()));

		
	}

}
