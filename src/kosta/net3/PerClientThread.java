package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread { //�ϳ��� ���ϸ��� �ϳ��� �����带 ���� -> �ݵ�� ������ ����
	Socket socket;  
	static List<PrintWriter> list  = 
						Collections.synchronizedList(new ArrayList<PrintWriter>());  //list �Ѱ��� �������� printwriter���� �� ����ȭ�������� syn��
	PrintWriter writer;
	
	//������
	public PerClientThread(Socket socket) {
		super();
		this.socket = socket;
		
		try {
			writer = new PrintWriter(socket.getOutputStream()); 	//������ ���Ͽ� Ŭ���̾�Ʈ�� ����
			list.add(writer); //list�� �ϳ��� �־���
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	//�޼����� ��� pw��ü���� ����
	public void sendAll(String msg){ 
		for(PrintWriter writer : list){ //list�� �ִ� ��� pw��ü�� �ݺ�
			writer.println(msg); //���
			writer.flush(); //Ȥ�� �����ִ� �� ������ Ȯ��
		}
	}

	@Override
	public void run() {
		String name = "";
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream())); //�Է½�Ʈ��
			name = br.readLine(); //ó�� �Է��� ���� �̸����� ����
			sendAll("## "+name+"�� ���� �߽��ϴ�. ##"); //��� ����鿡�� �޼����� ���۵�
			
			while(true){
				String msg = br.readLine();
				if(msg == null) break;
				
				sendAll(msg);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //�����
			sendAll("## "+name+"���� ���� �ϼ̽��ϴ�.");
			list.remove(writer);  //list���� ��ü����
			try {
				socket.close(); //���� ����
			} catch (Exception e2) {
			}
		}
		
		
	}

}
