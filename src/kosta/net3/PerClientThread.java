package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread { //하나의 소켓마다 하나의 스레드를 생성 -> 반드시 소켓을 지님
	Socket socket;  
	static List<PrintWriter> list  = 
						Collections.synchronizedList(new ArrayList<PrintWriter>());  //list 한개에 여러개의 printwriter들이 들어감 동기화오류때문 syn씀
	PrintWriter writer;
	
	//생성자
	public PerClientThread(Socket socket) {
		super();
		this.socket = socket;
		
		try {
			writer = new PrintWriter(socket.getOutputStream()); 	//각자의 소켓와 클라이언트를 연결
			list.add(writer); //list에 하나씩 넣어줌
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	//메세지를 모든 pw객체에게 전송
	public void sendAll(String msg){ 
		for(PrintWriter writer : list){ //list에 있는 모든 pw객체를 반복
			writer.println(msg); //출력
			writer.flush(); //혹시 남아있는 거 없는지 확인
		}
	}

	@Override
	public void run() {
		String name = "";
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream())); //입력스트림
			name = br.readLine(); //처음 입력한 것을 이름으로 지정
			sendAll("## "+name+"님 입장 했습니다. ##"); //모든 사람들에게 메세지가 전송됨
			
			while(true){
				String msg = br.readLine();
				if(msg == null) break;
				
				sendAll(msg);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //종료시
			sendAll("## "+name+"님이 퇴장 하셨습니다.");
			list.remove(writer);  //list에서 객체제거
			try {
				socket.close(); //소켓 종료
			} catch (Exception e2) {
			}
		}
		
		
	}

}
