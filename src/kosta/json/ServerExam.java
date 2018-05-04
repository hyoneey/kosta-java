package kosta.json;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import net.sf.json.JSONArray;

public class ServerExam {

	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("�躸��1", 26, "�簡��"));
		list.add(new Member("�躸��2", 24, "�߶���"));
		list.add(new Member("�躸��3", 25, "���"));

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

			serverSocket = new ServerSocket(7000);
			socket = serverSocket.accept(); // Ŭ���̾�Ʈ ���� ���ϵǾ���

			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//list -> JSonCode
			String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();

			writer.println(jsonCode);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
