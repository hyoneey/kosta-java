package kosta.net3;

import java.net.Socket;

import kosta.net2.ClientReceive;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null; // 클라이언트는 소켓만 선언
		
		try {
			socket = new Socket("192.168.0.115", 9000); // ip와 포트번호 -> '127.0.0.1'은 자신의 컴퓨터의 IP주소를 가리킴 
			
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
