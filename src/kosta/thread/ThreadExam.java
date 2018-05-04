package kosta.thread;

public class ThreadExam { //SmallLetters 을위한 메인 스레드
	public static void main(String args[]) {
		
		//Thread클래스를 이용한 멀티스레드
/*		Thread thread = new DigitThread();
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try { // 대문자와 숫자를 번갈아가면서 동시 실행 출력 -> 동시에 하려면 예외처리
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}*/
		
		//Runnable 인터페이스를 이용한 멀티스레드 - 한글과 영문을 동시 출력
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		
		char arr[] = {'ㄱ', 'ㄴ',  'ㄷ', 'ㄹ', 'ㅂ', 'ㅅ',
							'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };
		
		for(char ch : arr)
			System.out.println(ch);
		
		
		
	}
}
