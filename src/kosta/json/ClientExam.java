package kosta.json;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import kosta.json.Member;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket=null;
		try {
			socket= new Socket("127.0.0.1",7000);
						//127.0.0.1 -> 자신의 IP
	
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));

				String str = br.readLine();
				System.out.println("클라이언트수신: " + str);
				
				//json code=> object
				JSONParser parser = new JSONParser();
				Object re = null;
				
				try {
					re = parser.parse(str);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if(re instanceof JSONArray){
					JSONArray  array = (JSONArray)re;
					Iterator iter = array.iterator();
					
					ArrayList<Member> list2 = new ArrayList<Member>();
					
					while(iter.hasNext()){
						JSONObject jo = (JSONObject)iter.next();
						
						String name = (String)jo.get("name");
						String string = jo.get("age")+"";
						int age = Integer.parseInt(string);
						String address = (String)jo.get("address");
						
						list2.add(new Member(name,age,address));

					}
					System.out.println(list2);	
				}	
				

		} catch (Exception e) {
		e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (Exception e2) {
			
			}
		}
		

	}

}
