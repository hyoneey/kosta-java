package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		//이름, 점수를 한쌍으로 한 Map 자료구조를 구현하자.
		//김자바 : 90 , 박자바:80
		//총점, 평균, 최대 점수, 최소 점수
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 90);
		map.put("박자바", 80);
		map.put("이자바", 40);
		map.put("한자바", 45);
		map.put("유자바", 30);
		map.put("최자바", 95);
		map.put("조자바", 77);
		
		//key값 추출
		Set<String> set = map.keySet(); // .keySet()은 map에 있는 key값을 가져옴
		System.out.println("시험 명단: "+set);
		
		//value값 추출
		//Map => Collection(value) => Iterator
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total=0;
		while(iter.hasNext()){
			int num = iter.next();
			total += num;
		}
		
		System.out.println("총점: "+total+"	평균: "+total/map.size());
		System.out.println("최고 점수: "+Collections.max(values)+"  최소 점수: "+Collections.min(values));
		
		
		
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
		System.out.println("총점: "+total+"	평균: "+avg);
		System.out.println("최대 점수: "+Max+"  최소 점수: "+Min);*/
		
		

	}

}
