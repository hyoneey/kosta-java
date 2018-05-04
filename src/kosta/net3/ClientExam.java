package kosta.net3;

import java.net.Socket;

import kosta.net2.ClientReceive;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null; // Ŭ���̾�Ʈ�� ���ϸ� ����
		
		try {
			socket = new Socket("192.168.0.115", 9000); // ip�� ��Ʈ��ȣ -> '127.0.0.1'�� �ڽ��� ��ǻ���� IP�ּҸ� ����Ŵ 
			
			Thread sender = new ClientSender(socket);
			Thread receive = new ClientReceive(socket);
			
			sender.start();
			receive.start();
			
		} catch (Exception e) {		
			e.printStackTrace();
		} finally {
			try {
//				socket.close();
			} catch (Exception e2) {
			}
		}	
		 
	}
}
