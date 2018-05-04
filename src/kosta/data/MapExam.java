package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		
		
/*		HashMap<String, Integer> hashtable = new HashMap<String,Integer>();
		
		hashtable.put("����", new Integer(50));
		hashtable.put("�ڹ�", new Integer(100));
		hashtable.put("����", new Integer(1));
		
		Integer num = hashtable.get("����");
		System.out.println("�������� ���� ������ "+num);
		System.out.println("����� ����: "+hashtable.size());*/
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("1", "���");
		map.put("2", "�λ�");
		map.put("3", "NC");
		
		System.out.println("����� ����: "+map.size());
		
		if(map.containsValue("�λ�")){
			map.remove("2");
		}
	
		System.out.println("����� ����: "+map.size());
		
		
		//Map ���� => ��ü ���
		//Map => Set => Iterator
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
		Map.Entry<String, String>	 e = (Map.Entry<String, String>) iter.next();
				
		System.out.println("Key: "+e.getKey() + " Value: "+e.getValue());	
		}
		
		
		
	}

}
