package kosta.api;

import java.util.Random;

public class RandomExam {
	
	public static void main(String[] args){
		
		Random r = new Random();
		
		int num = r.nextInt(9)+1; // 1~9 ��� ->   +1�� ���� ������ 0~8
		
		//ī�����
		String cards[] = {"ī��1", "ī��2" ,"ī��3","ī��4", "ī��5",
									"ī��6","ī��7","ī��8","ī��9"};	
		String temp = "";
	
		for(int i=0; i<100; i++){			 //�ݺ��ϰ� ���� Ƚ��
			int num1 = r.nextInt(9); // 0~8
			int num2 = r.nextInt(9); // 0~8 : ������ swap�Ϸ��� �ΰ��� ������ ������ ����
			
			temp = cards[num1];
			cards[num1] = cards[num2];
			cards[num2] = temp;		
		}
	
		for(String s : cards){ //�迭 cards�� ���
		System.out.print(s+" , ");
		}
		
		
		
		
		
	}

}
