package kosta.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListMission {

	public static void main(String[] args) {

		// 배열을 이용하여 로또 6개(1~45) 중복 허용하지 않고 출력하시오.
		int arr[] = new int[6];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1; // 1~45

			for (int j = 0; j < i; j++) { // 중복 제거
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		/*
		  System.out.print("배열 로또 번호 : "); for (int i = 0; i < arr.length; i++)
		  { System.out.print(arr[i] + "  "); }
		
		System.out.println(); 
		*/

		// List자료구조를 이용한 로또 6개(1~45) 중복 허용하지 않고 출력하시오.
		// contains()
		List<Integer> list = new ArrayList<Integer>();

		while (true) {
			int n = r.nextInt(45) + 1;
			if (list.contains(n)) { // n을 포함하는지 중복 체크
				continue;
			} else {
				list.add(n); // n이 자동 boxing
			}

			if (list.size() == 6)
				break;
		}
		/*
		  System.out.print("list 로또 번호 : "); for (int i = 0; i < list.size();
		  i++) { System.out.print(list.get(i) + "  "); }
		 */
		
		
		// Set 자료구조 => 순서가 없으며, 중복을 허용하지 않음
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; set.size() < 6; i++) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		System.out.println(set);
		
		
		
	}
}
