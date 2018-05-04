package kosta.basic;

public class LoopExam {

	public static void main(String[] args){
		//while : 초기식 -> 조건식 -> 명령문-> 증감식 : 수직 방향

		/*		int i=1;
		int sum=0;

		while(i<=10){
			sum += i;
			i++;
		}

		System.out.println("1에서 10까지의 합: " + sum);*/

		
		//구구단 7단		
		/*		int i=1;

		while(i<=9){
			System.out.println("7 * "+ i + " = " + 7*i);			
			i++;
		}*/

		
		//do ~ while문 : 먼저 명령문을 실행하고 조건을 비교 => 적어도 1번은 실행
		//난수 : 임의의 숫자		
		/*		int num1,num2,num3 =0; //1~9

		num1=(int)(Math.random()*9)+1; //난수생성 0.0~0.9까지의 숫자가 생성

		do{
			num2=(int)(Math.random()*9)+1; 
		}while(num2 == num1);

		do{
			num3=(int)(Math.random()*9)+1; 
		}while((num3==num2 ) || (num3==num1));

		System.out.println(num1 + " : " + num2 + " : "+ num3);*/

		
		/*		int sum=0;
		for(int i=1; i<=10; i++){
			sum+=i;
		}
		System.out.println(sum);

		for(int i=1; i<=9; i++){
			System.out.println("7 * "+ i + " = " + 7*i);
		}
		 */

		//continue를 사용하여 1~100사이에서 2의배수와 3의 배수가 아닌 값을 출력		
		for(int i=1; i<=100; i++){
			if(i%2==0 || i%3==0)
				continue;
			System.out.println(i);
		}



	}
}
