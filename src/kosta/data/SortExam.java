package kosta.data;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {
	//정렬 기준 재설정 => Comparator -> 기준으로 정렬된것을 다시 기준을 잡아 정렬 / 하나의 클래스를 생성해 인터페이스해서 사용함
	//정렬 기준 설정 => Comparable -> 처음 기준을 잡을것

	public static void main(String[] args) {
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Desending()); 
		//treeSet<>()은 정렬 - 오름차순, desending() 클래스 객체를 생성하면 내림차순
		
		for(int i=0; set.size()<6; i++){
			int num = r.nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set);
		
	}

}
