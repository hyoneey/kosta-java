package kosta.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListMission {

	public static void main(String[] args) {

		// �迭�� �̿��Ͽ� �ζ� 6��(1~45) �ߺ� ������� �ʰ� ����Ͻÿ�.
		int arr[] = new int[6];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1; // 1~45

			for (int j = 0; j < i; j++) { // �ߺ� ����
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		/*
		  System.out.print("�迭 �ζ� ��ȣ : "); for (int i = 0; i < arr.length; i++)
		  { System.out.print(arr[i] + "  "); }
		
		System.out.println(); 
		*/

		// List�ڷᱸ���� �̿��� �ζ� 6��(1~45) �ߺ� ������� �ʰ� ����Ͻÿ�.
		// contains()
		List<Integer> list = new ArrayList<Integer>();

		while (true) {
			int n = r.nextInt(45) + 1;
			if (list.contains(n)) { // n�� �����ϴ��� �ߺ� üũ
				continue;
			} else {
				list.add(n); // n�� �ڵ� boxing
			}

			if (list.size() == 6)
				break;
		}
		/*
		  System.out.print("list �ζ� ��ȣ : "); for (int i = 0; i < list.size();
		  i++) { System.out.print(list.get(i) + "  "); }
		 */
		
		
		// Set �ڷᱸ�� => ������ ������, �ߺ��� ������� ����
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; set.size() < 6; i++) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		System.out.println(set);
		
		
		
	}
}
