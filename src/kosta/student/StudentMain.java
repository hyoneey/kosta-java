package kosta.student;

import kosta.oop.Account;

public class StudentMain {

	public static void main(String[] args){
		
		Student st1,st2;
		st1 = new Student("k",80,40,90);
		st2 = new Student("s",70,60,30);
		
/*		st1.name = "±è¿µÇö";
		st1.kor = 80;
		st1.eng = 70;
		st1.mat= 60;*/
//		st1.Insert();
		st1.Sum_Total();
		st1.Sum_Avg();
		
/*		st2.name = "±è¿µÇö2";
		st2.kor = 50;
		st2.eng = 22;
		st2.mat= 99;*/
//		st2.Insert();
		st2.Sum_Total();
		st2.Sum_Avg();
		
		
		System.out.println(st1);
		System.out.println();
		System.out.println(st2);
	}
	
}
