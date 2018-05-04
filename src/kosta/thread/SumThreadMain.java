package kosta.thread;

public class SumThreadMain { //Sum스레드를 위한 메인 스레드
	
	public static void main(String args[]){
		
	SumThread s1 = new SumThread(1,50);
	SumThread s2 = new SumThread(51,100);
	
	s1.start();
	s2.start();
//	System.out.println("1~100까지의 합 : "+ (s1.getSum()+s2.getSum())); //1275 나오므로 예외처리 
	
	try {
		s1.join(); //s1 실행할때 까지는 main 스레드는 기다리는 명령어 
		s2.join();
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	System.out.println("1~100까지의 합 : "+ (s1.getSum()+s2.getSum()));

		
	}

}
