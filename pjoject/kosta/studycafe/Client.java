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
				System.out.println("����Ǿ����ϴ�.");

				ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
				
				System.out.println("id�� �Է��ϼ���.");
				String id = sc.next();

				System.out.println("ä���� �����մϴ�.bye�� �Է��ϸ� ����˴ϴ�.");

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
				System.out.println("�����ڰ� �����ϴ�. ������ �������ּ���.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
