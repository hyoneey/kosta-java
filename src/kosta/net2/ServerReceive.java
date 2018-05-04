package kosta.net2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReceive extends Thread { //소켓에 있는 데이터를 읽어드림
	Socket socket;
//	ServerSocket serverSocket;

	public ServerReceive(Socket socket) {
	super();
	this.socket = socket;
}

	@Override
	public void run() { //출력해주는 역할 -> 더이상 읽을게 없으면 while문에서 빠져나옴 -> br==null일때 , != sysout찍음
		
		try {
				BufferedReader br = 
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				while( true ){
					String str = br.readLine();
					if( str == null) break;
					
					System.out.println("서버 수신 : "+str);
				}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
