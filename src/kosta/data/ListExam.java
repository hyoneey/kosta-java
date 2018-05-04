package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ListExam {

/*	public static void show(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " , ");
		}
		System.out.println();
	}*/
	
	//Iterator 
	public static void show(List<String> list) {
		
		Iterator<String> iterator = list.iterator();		
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" , ");
		}	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>(); // list선언
//		LinkedList<String> list = new LinkedList<String>();

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1": // 추가
				System.out.print("문자열 입력: ");
				String str = sc.nextLine();
				list.add(str);
				show(list);
				break;
				
			case "2": // 수정
				System.out.print("변경할 내용: ");
				String str2 = sc.nextLine();
				int index = list.indexOf(str2); //str2의 위치값을 반환
				if(index != -1){
					System.out.print("수정 내용: ");
					list.set(index, sc.nextLine());
				}
				show(list);
				break;
				
			case "3": // 삭제
				System.out.print("삭제 대상: ");
				String str3 = sc.nextLine();
				int index2 = list.indexOf(str3);
				if(index2 != -1){
					list.remove(index2);
				}
				show(list);
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}

		}

	}

}
