package kosta.phoneList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import kosta.data.Person;
import kosta.phone.DataInput;

public class Manager{

	List<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	String select = null;
	
	

	public Manager() {
	}

	// �Է�
	public void Insert() {
		System.out.println("1.��Ÿ , 2.���� , 3.��â  ");
		select = DataInput.DataInsert();

		if (select.equals("1")) { // ��Ÿ
			list.add(new PhoneInfo()); // ��ü�߰�
			list.get(list.size() - 1).DataInsert(); // list.size()-1 �� �ε�����ȣ��
													// 0�����̱⶧��
		} else if (select.equals("2")) { // ����
			list.add(new CompanyInfo()); // ��ü�߰�
			list.get(list.size() - 1).DataInsert(); // list.size()-1 �� �ε�����ȣ��
													// 0�����̱⶧��

		} else if (select.equals("3")) { // ��â
			list.add(new SchoolInfo()); // ��ü�߰�
			list.get(list.size() - 1).DataInsert(); // list.size()-1 �� �ε�����ȣ��
													// 0�����̱⶧��
		}
		System.out.println();
	}

	// ��ü ��� ���
	public void All_Print() {
		System.out.println("��ü ��ȭ��ȣ�� ���");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).PhonePrint();
		}
	}

	// �˻�
	public void Search() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				index = 1;
				list.get(i).PhonePrint();
			}
		}

		if (index == -1) { // ã�� ����� ������
			System.out.println("����� ã�� �� �����ϴ�.");
		}
	}

	// ����
	public void Delete() {
		System.out.print("������ �̸��� �Է��ϼ���: ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				index = 1;
				list.remove(i);
				System.out.println("�����Ǿ����ϴ�.");
			}
		}

		if (index == -1) { // ã�� ����� ������
			System.out.println("����� ã�� �� �����ϴ�.");
		}
	}

	// ����
	public void Update() {
		System.out.print("������ �̸��� �Է��ϼ���: ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				index = 1;
				System.out.print("��ȭ��ȣ: ");
				String phoneNo = DataInput.DataInsert();
				list.get(i).setPhoneNo(phoneNo);
			}

		}

		if (index == -1) { // ã�� ����� ������
			System.out.println("����� ã�� �� �����ϴ�.");
		}
	}

	//����
	public void sort() {
		Collections.sort(list, new Comparator<PhoneInfo>() {
			@Override
			public int compare(PhoneInfo p1, PhoneInfo p2) {
				if (p1.getName().compareTo(p2.getName()) < 0)
					return -1;
				else if (p1.getName().compareTo(p2.getName()) > 0)
					return 1;
				return 0;
			}
		});
		System.out.println("***����ó ���� ***");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).PhonePrint();
		}
	}


}
