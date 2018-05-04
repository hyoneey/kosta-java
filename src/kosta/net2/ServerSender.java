package kosta.net2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSender extends Thread {
	Socket socket;
	
	public ServerSender(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {  //쓰는 작업
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream()); // br에 있는내용을 writer가 씀
			
			while(true){
				String str = br.readLine();
				if(str.equals("bye")){
					break;
				}
				
				writer.println(str);
				writer.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
