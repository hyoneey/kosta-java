package kosta.net3;

import java.net.ServerSocket;
import java.net.Socket;

import kosta.net2.ServerSender;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;  //�������� ����
		Socket socket = null; // Ŭ���̾�Ʈ�� ���� �� �ִ� ��������
		
		try {
			serverSocket = new ServerSocket(9000); //���� ���� ����

			while(true){			//�������� �ޱ� ���ؼ� while������ �ݺ� ����
				socket =  serverSocket.accept(); //���� ����
				
				Thread thread = new PerClientThread(socket);	//Ŭ���̾�Ʈ�� �ϳ��� ������ ����	
				thread.start(); 					
			}					
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
