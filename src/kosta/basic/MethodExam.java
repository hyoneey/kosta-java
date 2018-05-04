package kosta.basic;

public class MethodExam {
	
	public static void main(String[] args){
		printCharacter('@', 20);
		System.out.println();
		printCharacter('$', 10);

	}
	
	static void printCharacter(char ch, int num){ //return값을 필요로 하지 않을 때 void
		
		for(int i=1; i<=num;i++){
			System.out.println(ch);
		}
	}
	

}
