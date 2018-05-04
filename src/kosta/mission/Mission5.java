package kosta.mission;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args){
		//키보드로 부터 1~4를 입력
		//1.추가 2.전체출력 3.검색 4.종료 => 콘솔출력
		//1번 클릭 => 추가기능을 선택 메세지출력
		//4번 => return;
		
		Scanner sc = new Scanner(System.in);

		int num;

		while (true) {
			num = sc.nextInt();
			
			switch(num){
			case 1:
				System.out.println("추가 기능을 선택하였습니다.");
				break;
			case 2:
				System.out.println("전체출력 기능을 선택하였습니다.");
				break;
			case 3:
				System.out.println("검색 기능을 선택하였습니다.");
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			}
		}

	}
	
}
