package kosta.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null; // 클라이언트는 소켓만 선언
		
		try {
			socket = new Socket("127.0.0.1", 9000); // ip와 포트번호 -> '127.0.0.1'은 자신의 컴퓨터의 IP주소를 가리킴 
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String message = "Hello Server!!!";
			out.write(message.getBytes()); //문자열을 byte로 변환
			
			byte arr[] =new byte[100];
			in.read(arr);
			System.out.println("서버에서 보낸 내용: "+new String(arr)); //byte배열을 문자열로 변환하여 출력
			
			
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
