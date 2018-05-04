package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		FileWriter writer = null; //����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�: ");
		String str = "";
		String poem = "";
		
		while(!(str = sc.nextLine()).equals("q")){ //'q'�� �Է� �ޱ� �������� ��� �Է��� �޾ƶ�.
			poem +=str;
			poem += "\n"; // �Է��� �Ҷ����� ���پ� ����
		}
		
		try {
			writer = new FileWriter("poem2.txt",true); //������ poem2�� �����ϸ� ���Ͽ� �����(��, ',true'���ָ� �̾��)
			writer.write(poem);	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
