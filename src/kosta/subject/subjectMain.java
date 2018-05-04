package kosta.subject;

import java.util.Scanner;

public class subjectMain {

	public static void main(String[] args) {
		
		Student student= new Student(); //객체생성
		
		Scanner sc = new Scanner(System.in);
		
		String menu=null;
		String name;
		String subName;
		int subScore =0;
		
		while(true){
			System.out.println("1.입력 2.출력 3.검색 4. 정렬 5.등수");
			menu = sc.nextLine();
			
			switch (menu) {
			case "1": //입력
				student.Insert();
				break;
			case "2": //출력
				student.All_Print();
				break;
			case "3": //검색
				student.Search();
				break;
			case "4": //정렬
				student.Sorting();
				break;
			case "5": //등수
				break;
			default:
				break;
			}
			
		}
		
		
		
		

	}

}
