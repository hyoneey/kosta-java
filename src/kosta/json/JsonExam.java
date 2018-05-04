package kosta.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExam {
	
	//{"name": "홍길동", "address" : "가산동", "age" : 20 }
	//Java Object(JSON Object) => json code
	public JSONObject createJsonObject(){
		JSONObject obj = new JSONObject();
		obj.put("name", "홍길동");
		obj.put("address", "가산동");
		obj.put("age", 20);
		
		return obj;		
	}
	
	//{"name": "박길동", "address" : "강남", "age" : 40 }
	//Java Object(Hash Map) => json code
	public HashMap getMapObject(){
		HashMap map = new HashMap();
		map.put("name", "박길동");
		map.put("address", "강남");
		map.put("age", "40");
		
		return map;
	}
	

	public static void main(String[] args) {
		JsonExam exam = new JsonExam();
		
		JSONObject obj = exam.createJsonObject();
		//System.out.println("result1: "+obj.toJSONString()); //자바 ->제이슨
		
		HashMap map = exam.getMapObject();
		//System.out.println("result2: "+JSONObject.toJSONString(map)); // 맵 -> 제이슨
		
		JSONArray ja = new JSONArray();
		ja.add(obj);
		ja.add(map);
		
		//System.out.println(ja.toJSONString());
		
		//List객체 => Json code 변환
		//[{},{}]
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("홍길동",20,"가산동"));
		list.add(new Member("박길동", 40, "강남"));
		
		//System.out.println(JSONArray.toJSONString(list).toString());
		System.out.println(net.sf.json.JSONArray.fromObject(list).toString());
		
		//json code ==> Java Object
		//[{"address":"가산동","age":20,"name":"홍길동"},{"address":"강남","age":40,"name":"박길동"}]
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
						
				System.out.println("이름: "+name);
				System.out.println("주소: "+address);
				System.out.println("나이: "+age);
				System.out.println();
			}
		}
		
		

	}

}
