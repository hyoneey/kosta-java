package kosta.io;

import java.io.FileReader;

public class FileReaderExam {

	public static void main(String[] args) {
		FileReader reader = null; // 선언 -> 객체는 예외처리 해줘야하기 때문에 나중에 생성
		char arr[] = new char[50];

		try {
			// 1.입력 스트림 생성
			reader = new FileReader("poem.txt");

			// 2. 스트림으로 부터 데이터 읽기
			//배열로 한꺼번에 읽어오기
			reader.read(arr);
			System.out.println(arr);
/*			while (true) {
				int data = reader.read();
				if (data == -1) { // 더이상 읽을 데이터가 존재하지 않을 때
					break;
				}
				char ch = (char) data;
				System.out.print(ch);
			}*/

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
			}
		}

	}

}
