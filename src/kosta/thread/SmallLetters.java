package kosta.thread;

public class SmallLetters implements Runnable {
	//염문 소문자를 출력하는 메소드
	@Override
	public void run() {
		for(char ch = 'a'; ch<='z'; ch++){
			System.out.println(ch);
		}
		
	}

}
