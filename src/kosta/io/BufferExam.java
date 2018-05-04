package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		//������ Scanner��ü�� �̿����� �ʰ�
		//System.in => InputStream => InputStreamReader => BufferedReader
		
		//������Ʈ�� -> ��ü������ ������� �����Ҽ�����. 
		/*InputStream in = System.in; //�ܼ� �Է� ��Ʈ��
		InputStreamReader isr = new InputStreamReader(in); //InputStreamReader ���� ��ȯ ���� ��Ʈ��
		BufferedReader br = new BufferedReader(isr);*/
		String str = "";
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
		
			System.out.print("�Է�: ");
			while((str = br.readLine()) != null){ //readLine() �� enterŰ�� �Է��ϱ� ������ �ֿܼ��� �Է��� ��� ���ڿ��� �Ѳ����� ����
				str += "\n";
				bw.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {}
		}
		
		

	}

}










