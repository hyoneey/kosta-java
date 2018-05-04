package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		//�̸�, ������ �ѽ����� �� Map �ڷᱸ���� ��������.
		//���ڹ� : 90 , ���ڹ�:80
		//����, ���, �ִ� ����, �ּ� ����
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 40);
		map.put("���ڹ�", 45);
		map.put("���ڹ�", 30);
		map.put("���ڹ�", 95);
		map.put("���ڹ�", 77);
		
		//key�� ����
		Set<String> set = map.keySet(); // .keySet()�� map�� �ִ� key���� ������
		System.out.println("���� ���: "+set);
		
		//value�� ����
		//Map => Collection(value) => Iterator
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total=0;
		while(iter.hasNext()){
			int num = iter.next();
			total += num;
		}
		
		System.out.println("����: "+total+"	���: "+total/map.size());
		System.out.println("�ְ� ����: "+Collections.max(values)+"  �ּ� ����: "+Collections.min(values));
		
		
		
/*		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while (iter.hasNext()) {
			Map.Entry<String, Integer>	 e = (Map.Entry<String, Integer>) iter.next();
			
			total += e.getValue();
			avg = total/map.size();		
			
			if(e.getValue()>=Max){
				Max=e.getValue();
			}
			
			if(e.getValue()<=Min){
				Min = e.getValue();
			}			
		}	
		System.out.println("����: "+total+"	���: "+avg);
		System.out.println("�ִ� ����: "+Max+"  �ּ� ����: "+Min);*/
		
		

	}

}
