package kosta.basic;

public class LoopExam {

	public static void main(String[] args){
		//while : �ʱ�� -> ���ǽ� -> ��ɹ�-> ������ : ���� ����

		/*		int i=1;
		int sum=0;

		while(i<=10){
			sum += i;
			i++;
		}

		System.out.println("1���� 10������ ��: " + sum);*/

		
		//������ 7��		
		/*		int i=1;

		while(i<=9){
			System.out.println("7 * "+ i + " = " + 7*i);			
			i++;
		}*/

		
		//do ~ while�� : ���� ��ɹ��� �����ϰ� ������ �� => ��� 1���� ����
		//���� : ������ ����		
		/*		int num1,num2,num3 =0; //1~9

		num1=(int)(Math.random()*9)+1; //�������� 0.0~0.9������ ���ڰ� ����

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

		//continue�� ����Ͽ� 1~100���̿��� 2�ǹ���� 3�� ����� �ƴ� ���� ���		
		for(int i=1; i<=100; i++){
			if(i%2==0 || i%3==0)
				continue;
			System.out.println(i);
		}



	}
}
