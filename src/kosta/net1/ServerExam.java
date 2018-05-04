package kosta.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;  //�������� ����
		Socket socket = null; // Ŭ���̾�Ʈ�� ���� �� �ִ� ��������
		
		try {
			serverSocket = new ServerSocket(9000); //���� ���� ����
			socket =  serverSocket.accept();
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];
			in.read(arr);  //Ŭ���̾�Ʈ ������ �о�鿩�� arr�� �� ����
			System.out.println("Ŭ���̾�Ʈ���� ���� �޼���: "+ new String(arr)); //byte �迭�� ���ڿ��� ����Ҷ� new String(byte[])
			
			String message = "Hello Client!!!";
			out.write(message.getBytes()); //String�� byte�迭�� �ٲ��ִ� �Լ� -> .getByte() �� ����� ��		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (Exception e2) {
			}
		}
		

		
		
		
	}
}
