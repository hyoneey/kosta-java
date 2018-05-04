package kosta.phone;

public class Manager {

	PhoneInfo p[] = new PhoneInfo[5]; // PhoneInfo Ŭ���� - �迭����
	PhoneInfo pc[] = new CompanyInfo[5];
	PhoneInfo ps[] = new SchoolInfo[5];

	String select = null;
	String name, phone, birth;
	
	static int p_count = 0;
	static int ps_count = 0;
	static int pc_count = 0;

	public Manager() {
	}
		

	// ����ó �߰�
	public void Insert() {
		System.out.println("1.���� , 2.��â , 3.��Ÿ ");
		select = DataInput.DataInsert();

		if (select.equals("1")) { //����
			
			pc[pc_count] =new CompanyInfo();
			pc[pc_count++].PhoneInsert();
				
		} else if (select.equals("2")) { //��â
			
			ps[ps_count] =new SchoolInfo();
			ps[ps_count++].PhoneInsert();
			
		} else if (select.equals("3")) { //��Ÿ
			p[p_count] =new PhoneInfo();
			p[p_count++].PhoneInsert();
		}
		System.out.println();
	}

	// ��ü ��� ���
	public void All_Print() {
		System.out.println("��ü ��ȭ��ȣ�� ���");
		for (int i = 0; i < p_count; i++) {
			p[i].PhonePrint();
		}
		for (int i = 0; i < pc_count; i++) {
			pc[i].PhonePrint();
		}
		for (int i = 0; i < ps_count; i++) {
			ps[i].PhonePrint();
		}
		System.out.println();

	}

	// ����ó �׷캰 ���
	public void Group_Print() {
		System.out.println("1.���� , 2.��â , 3.��Ÿ ");
		select = DataInput.DataInsert();

		if (select.equals("1")) {
			System.out.println("***** ���� ******");
			for (int i = 0; i < pc_count; i++) {
				pc[i].PhonePrint();
			}
		} else if (select.equals("2")) {
			System.out.println("****** ��â ******");
			for (int i = 0; i < ps_count; i++) {
				System.out.println(ps[i]);
			}
		} else if (select.equals("3")) {
			System.out.println("****** ��Ÿ ******");
			for (int i = 0; i < p_count; i++) {
				System.out.println(p[i]);
			}
		}
		System.out.println();
	}

	// �˻�
	public void Search() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String name = DataInput.DataInsert();
		int index = -1;

		for (int i = 0; i < p_count; i++) {
			if (name.equals(p[i].getName())) {
				index = 1;
				p[i].PhonePrint();
			}
		}

		for (int i = 0; i < pc_count; i++) {
			if (name.equals(pc[i].getName())) {
				index = 1;
				pc[i].PhonePrint();
			}
		}

		for (int i = 0; i < ps_count; i++) {
			if (name.equals(ps[i].getName())) {
				index = 1;
				ps[i].PhonePrint();
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

		for (int i = 0; i < p_count; i++) {
			if (name.equals(p[i].getName())) {
				index = 1;
				p[i] = p[i + 1];
				p[p_count] = null;
				p_count--;
				System.out.println("�����Ǿ����ϴ�.");
			}
		}

		for (int i = 0; i < pc_count; i++) {
			if (name.equals(pc[i].getName())) {
				index = 1;
				pc[i] = pc[i + 1];
				pc[pc_count] = null;
				pc_count--;
				System.out.println("�����Ǿ����ϴ�.");
			}
		}

		for (int i = 0; i < ps_count; i++) {
			if (name.equals(ps[i].getName())) {
				index = 1;
				ps[i] = ps[i + 1];
				ps[ps_count] = null;
				ps_count--;
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

		for (int i = 0; i < p_count; i++) {
			if (name.equals(p[i].getName())) {
				index = 1;
				System.out.print("��ȭ��ȣ: ");
				String phoneNo = DataInput.DataInsert();
				p[i].setPhoneNo(phoneNo);
			}

		}
		for (int i = 0; i < pc_count; i++) {
			if (name.equals(pc[i].getName())) {
				index = 1;
				System.out.print("��ȭ��ȣ: ");
				String phoneNo = DataInput.DataInsert();
				pc[i].setPhoneNo(phoneNo);
			}

		}
		for (int i = 0; i < ps_count; i++) {
			if (name.equals(ps[i].getName())) {
				index = 1;
				System.out.print("��ȭ��ȣ: ");
				String phoneNo = DataInput.DataInsert();
				ps[i].setPhoneNo(phoneNo);
			}
		}

		if (index == -1) { // ã�� ����� ������
			System.out.println("����� ã�� �� �����ϴ�.");
		}
	}
		
		
	
	

/*	// private ������ ���� �˻�
	public void Search() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String name = DataInput.DataInsert();
		int index = -1;
		
		for (int i = 0; i < count; i++) {
			if (name.equals(p[i].getName())) {
				index = i;
				System.out.print(name + "���� ã�� �˻� ��� : ");
				System.out.println(" �ڵ��� ��ȣ: " + p[i].getPhoneNo() + " �������: " + p[i].getBirth());
			}
		}
		
		if(index == -1 ){ //ã�� ����� ������
			System.out.println("����� ã�� �� �����ϴ�.");
		}
	}*/


}
