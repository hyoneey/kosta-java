package kosta.basic;

public class ValiableExam {

	public static void main(String[] args){
		char num5 ='A';
		//System.out.ptinln((int)num5);
		
		boolean num6 = true;
		
		//String => Object Data Type
		//���ڿ� ó��
		String num7 = "ȫ�浿";
		
		System.out.print("�ȳ��ϼ���.\t");
		System.out.println("�̸��� " + num7); //�̸��� ȫ�浿
		
		//�� ��ȯ ������ ũ��
		//byte < short < int <long < float <double
		int n1 = 10;
		double n2 = 3.14;
		
		double re = n1+n2; //�ڵ� ����ȯ
		int re2 = (int)(n1+n2); // ���� ����ȯ - �����ͼս��̹߻�
		System.out.println(re2); 
		
		byte b1 = 2;
		long b2 = 2134;
		long l1 = b1+b2;
		long l2 = (long)(b1+b2);
		System.out.println(l2);
		
		//String <==> ������,�Ǽ���;
		String n3 = 10+5+"0"; //���ڿ��� ������ ��ü�� ���ڿ��� �ȴ�. ���ڿ� 150�� ���
		String n4 = 7 + "4" + 9 ; //749
		System.out.println(n4);
		
		String s = "�ȳ�";
		int n5 = Integer.parseInt(n4); //������ 749 -���ڿ��� ���������� ��ȯ
		int n6 = n5 +1;
		System.out.println(n6);
		
		
		/*		
		int a = 1;
		double b = 3.14;
		double c = a+b;
		
		System.out.println(c); //3.1400000001
		
		if(c==4.14){
			System.out.println("�´�.");
		}
		else{
			System.out.println("Ʋ����.");
		}
*/
		
		int num11=10;
		num11 += 1;
		System.out.println(num11);
		
		for(int i=1; i<=100; i++){
			if(i%2==0 || i%3==0){
				System.out.println(i+" ");
			}
		}
		
	//���� ������
	int score = 75;
	char grade = (score > 90)? 'A' : ((score >80)?  'B' : 'C');
			
	System.out.println(score + "���� "+ grade + "���");
		
	}
}
