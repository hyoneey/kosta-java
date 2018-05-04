package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("조자바",90));
		list.add(new Person("한자바",65));
		list.add(new Person("홍자바",17));
		list.add(new Person("김자바",26));
		list.add(new Person("박자바",35));
		
		//System.out.println(list); //입력순으로 들어옴
		
		//Collections.sort(list); //person객체를 기준으로 나이로 오름차순 정렬
		
		//이름으로 오름차순
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				if (p1.getName().compareTo(p2.getName()) > 0) // p1>p2 ex) p1 = a , p2=b
					return 1; // 자리변경
				else if (p1.getName().compareTo(p2.getName()) < 0)
					return -1;

				return 0;
			}

		});

		System.out.println(list);
		
		
	}
}
