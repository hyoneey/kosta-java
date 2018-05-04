package kosta.student;

//import java.util.Scanner;

public class Student {

	//학생 이름,국어,영어,수학,총점,평균
	
	String name;             //멤버변수
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
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
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
