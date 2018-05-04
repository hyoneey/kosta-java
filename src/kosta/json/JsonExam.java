package kosta.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExam {
	
	//{"name": "ȫ�浿", "address" : "���굿", "age" : 20 }
	//Java Object(JSON Object) => json code
	public JSONObject createJsonObject(){
		JSONObject obj = new JSONObject();
		obj.put("name", "ȫ�浿");
		obj.put("address", "���굿");
		obj.put("age", 20);
		
		return obj;		
	}
	
	//{"name": "�ڱ浿", "address" : "����", "age" : 40 }
	//Java Object(Hash Map) => json code
	public HashMap getMapObject(){
		HashMap map = new HashMap();
		map.put("name", "�ڱ浿");
		map.put("address", "����");
		map.put("age", "40");
		
		return map;
	}
	

	public static void main(String[] args) {
		JsonExam exam = new JsonExam();
		
		JSONObject obj = exam.createJsonObject();
		//System.out.println("result1: "+obj.toJSONString()); //�ڹ� ->���̽�
		
		HashMap map = exam.getMapObject();
		//System.out.println("result2: "+JSONObject.toJSONString(map)); // �� -> ���̽�
		
		JSONArray ja = new JSONArray();
		ja.add(obj);
		ja.add(map);
		
		//System.out.println(ja.toJSONString());
		
		//List��ü => Json code ��ȯ
		//[{},{}]
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("ȫ�浿",20,"���굿"));
		list.add(new Member("�ڱ浿", 40, "����"));
		
		//System.out.println(JSONArray.toJSONString(list).toString());
		System.out.println(net.sf.json.JSONArray.fromObject(list).toString());
		
		//json code ==> Java Object
		//[{"address":"���굿","age":20,"name":"ȫ�浿"},{"address":"����","age":40,"name":"�ڱ浿"}]
		String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();
		
		JSONParser parser = new JSONParser();
		Object re = null;
		
		try {
			re = parser.parse(jsonCode);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(re instanceof JSONArray){
			JSONArray array = (JSONArray)re;
			Iterator iter = array.iterator();
			
			while(iter.hasNext()){
				JSONObject jo = (JSONObject)iter.next();
				
				String name = (String)jo.get("name");
				String address = (String)jo.get("address");
				String str = jo.get("age")+"";
				int age = Integer.parseInt(str);
						
				System.out.println("�̸�: "+name);
				System.out.println("�ּ�: "+address);
				System.out.println("����: "+age);
				System.out.println();
			}
		}
		
		

	}

}
