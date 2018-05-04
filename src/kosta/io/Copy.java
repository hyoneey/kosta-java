package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy {

	public static void main(String[] args) {
		//poem2.txt 파일을
		//copy해서 poem3.txt 파일을만듬
		
	
		FileReader reader = null;	
		FileWriter writer = null;	
		char arr[] = new char[50];
		
		try {
			reader = new FileReader("poem2.txt"); 
			reader.read(arr);		
			writer = new FileWriter("poem3.txt");
			writer.write(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();	
				writer.close();
			} catch (Exception e2) {
		
			}
		}
		
	}

}
