package kosta.mission;

public class Mission4 {
	public static void main(String args[]) {
		// �������� ���ؼ� ��ü ¦��, Ȧ���� ������ ������(5�ڸ�)
		// ���׿����ڸ� �̿��Ͽ� ������.
		int num = 52482;
		int even = 0;
		int odd = 0;

		even += (num / 10000 % 2 == 0) ? 1 : 0;
		even += (num / 1000 % 2 == 0) ? 1 : 0;
		even += (num / 100 % 2 == 0) ? 1 : 0;
		even += (num / 10 % 2 == 0) ? 1 : 0;
		even += (num % 2 == 0) ? 1 : 0;

/*		odd += (num / 10000 % 2 != 0) ? 1 : 0;
		odd += (num / 1000 % 2 != 0) ? 1 : 0;
		odd += (num / 100 % 2 != 0) ? 1 : 0;
		odd += (num / 10 % 2 != 0) ? 1 : 0;
		odd += (num % 2 != 0) ? 1 : 0;*/

		odd = 5- even;
		
		System.out.println("¦�� ����: " + even + " Ȧ�� ����: " + odd);

	}
}
