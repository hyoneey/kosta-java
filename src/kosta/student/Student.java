package kosta.student;

//import java.util.Scanner;

public class Student {

	//�л� �̸�,����,����,����,����,���
	
	String name;             //�������
	int kor,eng,mat = 0;
	int total,avg = 0;
	
	Student(){}
	
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}


/*	public void Insert(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		mat = sc.nextInt();
	}*/
	
	public void Sum_Total(){
		total = kor+eng+mat;
	}
	
	public void Sum_Avg(){
		avg = total/3;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", total=" + total
				+ ", avg=" + avg + "]";
	}
	
	
}
