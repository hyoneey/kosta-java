package kosta.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] arg){
		String m_id = "kosta";
		String m_pass = "1234";
		
		//Ű����κ��� id�� pass �Է� �޾Ƽ�
		//����(id,pass) ��ġ => �α��� ����
		//���� => id ����ġ => �ش� id�� �������� �ʽ��ϴ�.
		//���� => pass ����ġ => ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		
		//���ڿ� �� .equals(���) 
		
		String id, pass;

		Scanner sc = new Scanner(System.in);

		// System.out.println("���̵�� �н����带 �Է����ּ���.\n");

		System.out.println("���̵�: ");
		id = sc.nextLine();

		System.out.println("�н�����: ");
		pass = sc.nextLine();

		if (id.equals(m_id) && pass.equals(m_pass)) {
			System.out.println("�α��� ����\n");
		} else {
			if (!pass.equals(m_pass)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.\n");
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.\n");
			}
		}
		

/*		String id = "kosta";
		if(id.equals(m_id)){
			System.out.println("���̵���ġ");
		}*/
	}
}
