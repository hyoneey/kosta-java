package kosta.subject;

import java.util.Scanner;

public class Student {

	Student student[] = new Student[10]; // �迭����
	Subject[] subject = new Subject[3]; // �迭����

	String name;
	int total = 0;
	double avg = 0;
	int studentNum = 0;

	Scanner sc = new Scanner(System.in);

	Student() {
	} // default ������

	Student(String name) {
		this.name = name;
	}

	Student(int total) {
		this.total = total;
	}

	// ������ �߰�
	public void Insert() {
		total=0;
		System.out.print("�̸� �Է�: ");
		name = sc.nextLine();
		student[studentNum] = new Student(name); // ��ü ����

		for (int i = 0; i < subject.length; i++) {
			System.out.print("���� �̸� �Է�: ");
			String subName = sc.nextLine();
			System.out.print("���� ���� �Է�: ");
			int subScore = sc.nextInt();
			sc.nextLine();
			student[studentNum].subject[i] = new Subject(subName, subScore); // ��ü����
		}
		sum_Total();
		student[studentNum].total = total;
		sum_Avg();
		student[studentNum].avg = avg;
		studentNum++;
	}

	// ��ü ���
	public void All_Print() {
		for (int i = 0; i < studentNum; i++) {
			System.out.println("�̸�: " + student[i].name);
			for (int j = 0; j < subject.length; j++) {
				System.out
						.println("���� �̸�: " + student[i].subject[j].subName + " ����: " + student[i].subject[j].subScore);
			}
			System.out.println("����: " + student[i].total + " ���: " + student[i].avg);
			System.out.println();
		}
	}

	// �˻�
	public void Search() {
		System.out.print("�˻��� �̸� :");
		String sname = sc.nextLine();
		for (int i = 0; i < studentNum; i++) {
			if (student[i].name.equals(sname)) {
				for (int j = 0; j < subject.length; j++) {
					System.out.println(
							"���� �̸�: " + student[i].subject[j].subName + " ����: " + student[i].subject[j].subScore);
				}
				System.out.println("����: " + student[i].total + "���: " + student[i].avg);
			}
		}

	}

	//����
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
			System.out.println("�̸�: " + student[i].name);
			for (int j = 0; j < subject.length; j++) {
				System.out
						.println("���� �̸�: " + student[i].subject[j].subName + " ����: " + student[i].subject[j].subScore);
			}
			System.out.println("����: " + student[i].total + "���: " + student[i].avg);
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
