package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerialExam {
	Member m;
	
	//객체역직렬화(파일에서 객체 읽기) ObjectInputStream
	public void read(){
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member)ois.readObject(); // 객체타입 변수 = (객체타입) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}	
	
	//객체직렬화(파일에 객체쓰기) ObjectOutputStream
	public void write(){
		m = new Member("홍길동", 20);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
			System.out.println("객체직렬화 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {}
		}
	}
	
	public static void main(String[] args) {
		SerialExam ex = new SerialExam();

		ex.write();
		ex.m = null;
		ex.read();
		
		System.out.println(ex.m);
	}

}







