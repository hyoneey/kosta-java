package kosta.data;

import java.util.Comparator;

public class Desending implements Comparator<Integer> {  //정렬을 재정렬하는 함수 Comparator

	@Override
	public int compare(Integer o1, Integer o2) {
		
		//내림차순 대한 정렬기준 정의
		if(o1 < o2){
			return 1; // o2가 크면 자리를 변경해라
		}else if( o1 > o2){
			return -1; // 자리를 변경하지 말아라
		}
		
		return 0;
	}

}
