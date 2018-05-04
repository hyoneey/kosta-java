package kosta.net3;

import java.net.ServerSocket;
import java.net.Socket;

import kosta.net2.ServerSender;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;  //서버소켓 선언
		Socket socket = null; // 클라이언트가 들어올 수 있는 서버소켓
		
		try {
			serverSocket = new ServerSocket(9000); //서버 소켓 생성

			while(true){			//여러명을 받기 위해서 while문으로 반복 생성
				socket =  serverSocket.accept(); //소켓 접속
				
				Thread thread = new PerClientThread(socket);	//클라이언트당 하나씩 소켓을 생성	
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
