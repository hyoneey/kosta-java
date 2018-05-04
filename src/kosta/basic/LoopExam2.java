package kosta.basic;

public class LoopExam2 {

	
	public static void main(String[] args){
		//중첩 for문
	/*	for(int i=1; i<=3; i++){
			for(int j=1; j<=2; j++){
				System.out.println("i="+i+" ,j: "+j);
			}
		}*/
		
		
/*		//4x+5y = 60 	
		int result=0;	
		for(int x=0; x<=20; x++){
			for(int y=0; y<=20; y++){
				result = 4*x + 5*y;
				if(result == 60){
					System.out.println("x: "+x+", y: "+y);
				}
			}
		}*/
		
/*		System.out.println("구구단");
		for(int i=1; i<=9;i++){
			System.out.println("\n ** "+i+"단 **");
			for(int j=1; j<=9; j++){
				System.out.println( i + " * "+ j + " = "+ i*j);
			}
		}*/
		
		
/*		for(int i=1; i<=5;i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
/*		for(int i=5;i>=1;i--){
			for(int j=1;j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
		outerloop:		
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i; j++){
				System.out.print("*");
				if(i==2 )
					break outerloop;
			}
			System.out.print("\n");
		}
		
	}
}
