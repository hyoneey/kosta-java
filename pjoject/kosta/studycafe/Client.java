package kosta.studycafe;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

import kosta.studycafe.ClientThread;
import kosta.studycafe.Message;

public class Client {
	public void clientConnect() {
		Scanner sc = new Scanner(System.in);
		try {
			try {
				Socket soc = new Socket("localhost", 8989);		
				System.out.println("연결되었습니다.");

				ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
				
				System.out.println("id를 입력하세요.");
				String id = sc.next();

				System.out.println("채팅을 시작합니다.bye를 입력하면 종료됩니다.");

				Thread t = new Thread(new ClientThread(ois));
				t.start();

				while (true) {

					String message = sc.next();
					Message m = new Message(id, message);
					if(message.equals("bye")){
						return;
					}
					oos.writeObject(m);
					oos.flush();
				}
			} catch (ConnectException e) {
				System.out.println("관리자가 없습니다. 다음에 문의해주세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
