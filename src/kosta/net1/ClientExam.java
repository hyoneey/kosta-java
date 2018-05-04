package kosta.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null; // Ŭ���̾�Ʈ�� ���ϸ� ����
		
		try {
			socket = new Socket("127.0.0.1", 9000); // ip�� ��Ʈ��ȣ -> '127.0.0.1'�� �ڽ��� ��ǻ���� IP�ּҸ� ����Ŵ 
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String message = "Hello Server!!!";
			out.write(message.getBytes()); //���ڿ��� byte�� ��ȯ
			
			byte arr[] =new byte[100];
			in.read(arr);
			System.out.println("�������� ���� ����: "+new String(arr)); //byte�迭�� ���ڿ��� ��ȯ�Ͽ� ���
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {
			}
		}	
		 
	}
}
