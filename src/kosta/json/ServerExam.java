package kosta.json;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import net.sf.json.JSONArray;

public class ServerExam {

	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("김보람1", 26, "사가정"));
		list.add(new Member("김보람2", 24, "중랑구"));
		list.add(new Member("김보람3", 25, "면목동"));

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

			serverSocket = new ServerSocket(7000);
			socket = serverSocket.accept(); // 클라이언트 소켓 리턴되어짐

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
