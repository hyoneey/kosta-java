package kosta.net2;

import java.net.ServerSocket;
import java.net.Socket;

import kosta.net2.ServerSender;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;  //서버소켓 선언
		Socket socket = null; // 클라이언트가 들어올 수 있는 서버소켓
		
		try {
			serverSocket = new ServerSocket(9000); //서버 소켓 생성
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
