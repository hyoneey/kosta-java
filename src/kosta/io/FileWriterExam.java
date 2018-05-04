package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		FileWriter writer = null; //선언
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String str = "";
		String poem = "";
		
		while(!(str = sc.nextLine()).equals("q")){ //'q'를 입력 받기 전까지는 계속 입력을 받아라.
			poem +=str;
			poem += "\n"; // 입력을 할때마다 한줄씩 개행
		}
		
		try {
			writer = new FileWriter("poem2.txt",true); //기존에 poem2가 존재하면 파일에 덮어쓰기(단, ',true'해주면 이어쓰기)
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
