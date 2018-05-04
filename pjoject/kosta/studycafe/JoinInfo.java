package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class JoinInfo {
	static List<Member> list = new ArrayList<Member>();
	static String name;
	static String phoneNo;
	
	public JoinInfo(){}

	// 1.ȸ������
	static void Join() {
		System.out.println();
		System.out.println("***** ȸ������ ȭ�� *****");
		System.out.print("�̸� : ");
		name =DataInput.DataInsert();
		System.out.print("��ȭ��ȣ ex)010-1234-5678): ");
		phoneNo = DataInput.DataInsert();
	
		checkName(name, phoneNo);
	}
	
	//1.ȸ������ - �̸� ���� Ȯ��
	static void checkName(String name,String phoneNo){
		if(name.matches("(?i)(^[a-zA-Z]*$)")){ 
			checkStr(name, phoneNo);
		}else{
			System.out.println();
			System.out.println("�������� �ʴ� �����Դϴ�.");
			System.out.println("�����ڷθ� �Է� ��Ź�帳�ϴ�. (��ҹ��� ���о���)");
		}
	}
	
	// 1.ȸ������ - ����ȣ �Է� ���� Ȯ��
	static void checkStr(String name,String phoneNo) {
		if(phoneNo.matches("[\\d]{3}+\\-[\\d]{4}+\\-[\\d]{4}")){ //��ȣ �������� �ԷµǾ����� Ȯ��
			Check(name, phoneNo); 
		}else{
			System.out.println();
			System.out.println("�������� �ʴ� �����Դϴ�.");
			System.out.println("010-1234-5678 �������� �ٽ� �Է��Ͻʽÿ�.");
			Join(); //�ٽ� ȸ������ �Է�ȭ������ �̵�
		}
	}
	

	
	// 1.ȸ������ - �ߺ���ȣ �˻�
	public static void Check(String name, String phoneNo) {
		for (int i = 0; i < list.size(); i++) {
			if (phoneNo.trim().equals(list.get(i).getPhoneNo())) {
				System.out.println();
				System.out.println("�̹� ��ϵ� ȸ���Դϴ�.");
				return;
			}
		}
		//���鰪 Ȯ��
		if(phoneNo.equals("")){ //��ȣ �������� �ԷµǾ����� Ȯ��
			System.out.println();
			System.out.println("�߸��� ��ȣ �����Դϴ�. �ùٸ��� �Է� ��Ź�帳�ϴ�.");
			return;
		}else if(name.equals("")){
			System.out.println();
			System.out.println("�߸��� �̸� �����Դϴ�. �ùٸ��� �Է� ��Ź�帳�ϴ�.");
			return;
		}
		
		list.add(new Member(name, phoneNo));
		System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
	}
	

	static List<Member> memberPrint(){
		return list;
	}
	
}
