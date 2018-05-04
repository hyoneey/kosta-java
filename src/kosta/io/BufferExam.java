package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		//기존의 Scanner객체를 이용하지 않고
		//System.in => InputStream => InputStreamReader => BufferedReader
		
		//보조스트림 -> 자체적으로 입출력을 수행할수없다. 
		/*InputStream in = System.in; //콘솔 입력 스트림
		InputStreamReader isr = new InputStreamReader(in); //InputStreamReader 문자 변환 보조 스트림
		BufferedReader br = new BufferedReader(isr);*/
		String str = "";
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
		
			System.out.print("입력: ");
			while((str = br.readLine()) != null){ //readLine() 는 enter키를 입력하기 전까지 콘솔에서 입력한 모든 문자열을 한꺼번에 받음
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










