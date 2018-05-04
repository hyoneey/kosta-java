package kosta.studycafe;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import kosta.studycafe.Message;
import kosta.studycafe.ServerThread;
 
public class Server {
 
    public void serverConnect() {
        try {
            
            ServerSocket ss = new ServerSocket(8989);
            
            System.out.println("접속대기중...");
            Socket soc = ss.accept();
            System.out.println("접속완료!");
 
            ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
 
            Scanner sc = new Scanner(System.in);
            System.out.println("아이디를 입력하세요."); 
 //id는 반복문 밖에서 만들어 주기 때문에 고정된다.
            String id = sc.next();
            
			System.out.println("채팅을 시작합니다.bye를 입력하면 종료됩니다.");
 
            Thread t = new Thread(new ServerThread(ois));
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
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


