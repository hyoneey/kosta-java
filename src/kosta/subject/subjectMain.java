package kosta.subject;

import java.util.Scanner;

public class subjectMain {

	public static void main(String[] args) {
		
		Student student= new Student(); //��ü����
		
		Scanner sc = new Scanner(System.in);
		
		String menu=null;
		String name;
		String subName;
		int subScore =0;
		
		while(true){
			System.out.println("1.�Է� 2.��� 3.�˻� 4. ���� 5.���");
			menu = sc.nextLine();
			
			switch (menu) {
			case "1": //�Է�
				student.Insert();
				break;
			case "2": //���
				student.All_Print();
				break;
			case "3": //�˻�
				student.Search();
				break;
			case "4": //����
				student.Sorting();
				break;
			case "5": //���
				break;
			default:
				break;
			}
			
		}
		
		
		
		

	}

}
