package kosta.basic;

public class MethodExam {
	
	public static void main(String[] args){
		printCharacter('@', 20);
		System.out.println();
		printCharacter('$', 10);

	}
	
	static void printCharacter(char ch, int num){ //return���� �ʿ�� ���� ���� �� void
		
		for(int i=1; i<=num;i++){
			System.out.println(ch);
		}
	}
	

}
