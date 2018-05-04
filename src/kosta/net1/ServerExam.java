package kosta.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;  //서버소켓 선언
		Socket socket = null; // 클라이언트가 들어올 수 있는 서버소켓
		
		try {
			serverSocket = new ServerSocket(9000); //서버 소켓 생성
			socket =  serverSocket.accept();
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];
			in.read(arr);  //클라이언트 소켓을 읽어들여서 arr에 들어가 있음
			System.out.println("클라이언트에서 보낸 메세지: "+ new String(arr)); //byte 배열을 문자열로 출력할때 new String(byte[])
			
			String message = "Hello Client!!!";
			out.write(message.getBytes()); //String을 byte배열로 바꿔주는 함수 -> .getByte() 를 써줘야 함		
			
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
