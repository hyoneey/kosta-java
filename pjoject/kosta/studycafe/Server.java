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
            
            System.out.println("���Ӵ����...");
            Socket soc = ss.accept();
            System.out.println("���ӿϷ�!");
 
            ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
 
            Scanner sc = new Scanner(System.in);
            System.out.println("���̵� �Է��ϼ���."); 
 //id�� �ݺ��� �ۿ��� ����� �ֱ� ������ �����ȴ�.
            String id = sc.next();
            
			System.out.println("ä���� �����մϴ�.bye�� �Է��ϸ� ����˴ϴ�.");
 
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


