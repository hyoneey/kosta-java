package kosta.api;

import java.util.Random;

public class RandomExam {
	
	public static void main(String[] args){
		
		Random r = new Random();
		
		int num = r.nextInt(9)+1; // 1~9 출력 ->   +1을 하지 않으면 0~8
		
		//카드게임
		String cards[] = {"카드1", "카드2" ,"카드3","카드4", "카드5",
									"카드6","카드7","카드8","카드9"};	
		String temp = "";
	
		for(int i=0; i<100; i++){			 //반복하고 싶은 횟수
			int num1 = r.nextInt(9); // 0~8
			int num2 = r.nextInt(9); // 0~8 : 난수를 swap하려면 두개를 임의의 값으로 받음
			
			temp = cards[num1];
			cards[num1] = cards[num2];
			cards[num2] = temp;		
		}
	
		for(String s : cards){ //배열 cards를 출력
		System.out.print(s+" , ");
		}
		
		
		
		
		
	}

}
