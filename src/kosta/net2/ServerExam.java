package kosta.net2;

import java.net.ServerSocket;
import java.net.Socket;

import kosta.net2.ServerSender;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;  //�������� ����
		Socket socket = null; // Ŭ���̾�Ʈ�� ���� �� �ִ� ��������
		
		try {
			serverSocket = new ServerSocket(9000); //���� ���� ����
			socket =  serverSocket.accept();
			
			Thread sender = new ServerSender(socket);
			Thread receive = new ServerReceive(socket);
			
			sender.start();
			receive.start();
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
		/*		socket.close();
				serverSocket.close();*/
			} catch (Exception e2) {
			}
		}
		

		
		
		
	}
}
