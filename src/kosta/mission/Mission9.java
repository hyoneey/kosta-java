package kosta.mission;

import java.util.Scanner;

public class Mission9 {
	static int count = 0;

	// 1. 추가
	public static void Insert(String arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가 : ");
		arr[count++] = sc.nextLine();
	}

	// 2. 출력
	public static void Print(String arr[]) {
		for (int i = 0; i < count; i++) {
			System.out.print(i + " 번째: " + arr[i] + "\t");
		}
		System.out.println();
	}

	// 3. 검색
	public static void Find() {
		System.out.println("검색 기능을 선택하였습니다.");
	}

	// 4. 수정
	public static void Update(String arr[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수정할 인덱스를 입력: ");
		int index_num = sc.nextInt();
		sc.nextLine();

		if (index_num > count) {
			System.out.println("수정할 인덱스가 존재하지 않습니다.");
		} else {
			System.out.print("수정할 내용을 입력: ");
			String index_str = sc.nextLine();
			arr[index_num] = index_str;
		}
	}

	// 5. 삭제
	public static void Delete(String arr[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("삭제할 인덱스를 입력: ");
		int index_num = sc.nextInt();
		sc.nextLine();

		if (index_num >= count) {
			System.out.println("삭제할 인덱스가 존재하지 않습니다.");
		} else {
			for (int i = index_num; i < count; i++) {
				arr[i] = arr[i + 1];
			}
			arr[count]=null;
			count--;
			System.out.println("삭제되었습니다.");
		}

	}

	// 6. 종료
	public static void End() {
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String select;
		String arr[] = new String[30];

		while (true) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.print("선택: ");
			select = sc.nextLine();

			switch (select) {
			case "1": // 추가
				Insert(arr);
				break;

			case "2": // 출력
				Print(arr);
				break;

			case "3": // 검색
				Find();
				break;
			case "4": // 수정
				Update(arr);
				break;
			case "5": // 삭제
				Delete(arr);
				break;
			case "6":
				End();
				return;
			}
		}
	}

}
