package kosta.api;

public class BaseBallMain {

	public static void main(String[] args) {

		int num[] = new int[3];
		int input[] = new int[3];
		int count = 0;
		BaseBall baseball = new BaseBall();

		// ���� 3�ڸ� ����
		for (int i = 0; i < num.length; i++) {
			num[i] = baseball.makeNum();
		}

		// ���� 3�ڸ� �����
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// �Է� ���� �� ����
		do {
			System.out.println("���ڸ� �Է��ϼ��� (1~9) : ");
			for (int j = 0; j < input.length; j++) {
				input[j] = baseball.DataInsert();
			}

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < input.length; j++) {
					BaseBall.Play(num, input); // ���ӽ���
				}
			}
			count += 1;

			BaseBall.print();

			if (BaseBall.getResult() == 3) {
				System.out.println("�����Դϴ�.");
				System.out.println(count + "��° ����");
			}
		} while (BaseBall.getResult() != 3);

	}

}
