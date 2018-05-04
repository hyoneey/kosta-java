package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerialExam {
	Member m;
	
	//��ü������ȭ(���Ͽ��� ��ü �б�) ObjectInputStream
	public void read(){
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member)ois.readObject(); // ��üŸ�� ���� = (��üŸ��) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}	
	
	//��ü����ȭ(���Ͽ� ��ü����) ObjectOutputStream
	public void write(){
		m = new Member("ȫ�浿", 20);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
			System.out.println("��ü����ȭ �Ϸ�");
			
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







