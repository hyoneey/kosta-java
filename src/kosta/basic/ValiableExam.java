package kosta.basic;

public class ValiableExam {

	public static void main(String[] args){
		char num5 ='A';
		//System.out.ptinln((int)num5);
		
		boolean num6 = true;
		
		//String => Object Data Type
		//문자열 처리
		String num7 = "홍길동";
		
		System.out.print("안녕하세요.\t");
		System.out.println("이름은 " + num7); //이름은 홍길동
		
		//형 변환 데이터 크기
		//byte < short < int <long < float <double
		int n1 = 10;
		double n2 = 3.14;
		
		double re = n1+n2; //자동 형변환
		int re2 = (int)(n1+n2); // 강제 형변환 - 데이터손실이발생
		System.out.println(re2); 
		
		byte b1 = 2;
		long b2 = 2134;
		long l1 = b1+b2;
		long l2 = (long)(b1+b2);
		System.out.println(l2);
		
		//String <==> 정수형,실수형;
		String n3 = 10+5+"0"; //문자열을 만나면 전체가 문자열이 된다. 문자열 150이 출력
		String n4 = 7 + "4" + 9 ; //749
		System.out.println(n4);
		
		String s = "안녕";
		int n5 = Integer.parseInt(n4); //정수형 749 -문자열을 정수형으로 변환
		int n6 = n5 +1;
		System.out.println(n6);
		
		
		/*		
		int a = 1;
		double b = 3.14;
		double c = a+b;
		
		System.out.println(c); //3.1400000001
		
		if(c==4.14){
			System.out.println("맞다.");
		}
		else{
			System.out.println("틀리다.");
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
		
	//삼항 연산자
	int score = 75;
	char grade = (score > 90)? 'A' : ((score >80)?  'B' : 'C');
			
	System.out.println(score + "점은 "+ grade + "등급");
		
	}
}
