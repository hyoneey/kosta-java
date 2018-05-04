package kosta.net2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReceive extends Thread { //���Ͽ� �ִ� �����͸� �о�帲
	Socket socket;
//	ServerSocket serverSocket;

	public ServerReceive(Socket socket) {
	super();
	this.socket = socket;
}

	@Override
	public void run() { //������ִ� ���� -> ���̻� ������ ������ while������ �������� -> br==null�϶� , != sysout����
		
		try {
				BufferedReader br = 
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				while( true ){
					String str = br.readLine();
					if( str == null) break;
					
					System.out.println("���� ���� : "+str);
				}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
