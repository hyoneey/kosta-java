package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		
		
/*		HashMap<String, Integer> hashtable = new HashMap<String,Integer>();
		
		hashtable.put("영현", new Integer(50));
		hashtable.put("자바", new Integer(100));
		hashtable.put("설날", new Integer(1));
		
		Integer num = hashtable.get("설날");
		System.out.println("설날까지 남은 요일은 "+num);
		System.out.println("요소의 갯수: "+hashtable.size());*/
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("1", "기아");
		map.put("2", "두산");
		map.put("3", "NC");
		
		System.out.println("요소의 갯수: "+map.size());
		
		if(map.containsValue("두산")){
			map.remove("2");
		}
	
		System.out.println("요소의 갯수: "+map.size());
		
		
		//Map 내용 => 전체 출력
		//Map => Set => Iterator
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
		Map.Entry<String, String>	 e = (Map.Entry<String, String>) iter.next();
				
		System.out.println("Key: "+e.getKey() + " Value: "+e.getValue());	
		}
		
		
		
	}

}
