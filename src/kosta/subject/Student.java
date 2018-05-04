package kosta.subject;

import java.util.Scanner;

public class Student {

	Student student[] = new Student[10]; // 배열생성
	Subject[] subject = new Subject[3]; // 배열생성

	String name;
	int total = 0;
	double avg = 0;
	int studentNum = 0;

	Scanner sc = new Scanner(System.in);

	Student() {
	} // default 생성자

	Student(String name) {
		this.name = name;
	}

	Student(int total) {
		this.total = total;
	}

	// 데이터 추가
	public void Insert() {
		total=0;
		System.out.print("이름 입력: ");
		name = sc.nextLine();
		student[studentNum] = new Student(name); // 객체 생성

		for (int i = 0; i < subject.length; i++) {
			System.out.print("과목 이름 입력: ");
			String subName = sc.nextLine();
			System.out.print("과목 점수 입력: ");
			int subScore = sc.nextInt();
			sc.nextLine();
			student[studentNum].subject[i] = new Subject(subName, subScore); // 객체생성
		}
		sum_Total();
		student[studentNum].total = total;
		sum_Avg();
		student[studentNum].avg = avg;
		studentNum++;
	}

	// 전체 출력
	public void All_Print() {
		for (int i = 0; i < studentNum; i++) {
			System.out.println("이름: " + student[i].name);
			for (int j = 0; j < subject.length; j++) {
				System.out
						.println("과목 이름: " + student[i].subject[j].subName + " 점수: " + student[i].subject[j].subScore);
			}
			System.out.println("총점: " + student[i].total + " 평균: " + student[i].avg);
			System.out.println();
		}
	}

	// 검색
	public void Search() {
		System.out.print("검색할 이름 :");
		String sname = sc.nextLine();
		for (int i = 0; i < studentNum; i++) {
			if (student[i].name.equals(sname)) {
				for (int j = 0; j < subject.length; j++) {
					System.out.println(
							"과목 이름: " + student[i].subject[j].subName + " 점수: " + student[i].subject[j].subScore);
				}
				System.out.println("총점: " + student[i].total + "평균: " + student[i].avg);
			}
		}

	}

	//정렬
	public void Sorting() {
		Student temp[] = new Student[1];

		for (int a = 0; a < studentNum; a++) {
			for (int b = a + 1; b < studentNum; b++) {
				if (student[a].avg < student[a + 1].avg) {
					temp[0] = student[a];
					student[a] = student[a + 1];
					student[a + 1] = temp[0];
				}
			}
		}
		
		for (int i = 0; i < studentNum; i++) {
			System.out.println("이름: " + student[i].name);
			for (int j = 0; j < subject.length; j++) {
				System.out
						.println("과목 이름: " + student[i].subject[j].subName + " 점수: " + student[i].subject[j].subScore);
			}
			System.out.println("총점: " + student[i].total + "평균: " + student[i].avg);
			System.out.println();
		}

	}
	
	public void sum_Avg() {
		avg = total / 3;

	}
	public void sum_Total() {
		for (int i = 0; i < subject.length; i++) {
			total += student[studentNum].subject[i].subScore;
		}

	}
}
