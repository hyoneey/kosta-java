package kosta.io;

import java.io.FileReader;

public class FileReaderExam {

	public static void main(String[] args) {
		FileReader reader = null; // ���� -> ��ü�� ����ó�� ������ϱ� ������ ���߿� ����
		char arr[] = new char[50];

		try {
			// 1.�Է� ��Ʈ�� ����
			reader = new FileReader("poem.txt");

			// 2. ��Ʈ������ ���� ������ �б�
			//�迭�� �Ѳ����� �о����
			reader.read(arr);
			System.out.println(arr);
/*			while (true) {
				int data = reader.read();
				if (data == -1) { // ���̻� ���� �����Ͱ� �������� ���� ��
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
