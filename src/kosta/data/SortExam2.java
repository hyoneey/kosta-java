package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("���ڹ�",90));
		list.add(new Person("���ڹ�",65));
		list.add(new Person("ȫ�ڹ�",17));
		list.add(new Person("���ڹ�",26));
		list.add(new Person("���ڹ�",35));
		
		//System.out.println(list); //�Է¼����� ����
		
		//Collections.sort(list); //person��ü�� �������� ���̷� �������� ����
		
		//�̸����� ��������
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				if (p1.getName().compareTo(p2.getName()) > 0) // p1>p2 ex) p1 = a , p2=b
					return 1; // �ڸ�����
				else if (p1.getName().compareTo(p2.getName()) < 0)
					return -1;

				return 0;
			}

		});

		System.out.println(list);
		
		
	}
}
