package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class CustManage { // �� ������ ��ȸ ( �̸�, ��ȣ, ȸ���� ����(�����: ���ų�¥, ���ᳯ¥ ,�Ϲݱ�:�̿볯¥)
	List<Member> member_list = new ArrayList<Member>(); //ȸ������

	public CustManage(){}
		
	public void CustListInput(){ //������ ����Ʈ
		member_list =  JoinInfo.memberPrint();
	}

	//�� ���� 
	public void CustInfo(){
		
		CustListInput();
		
		System.out.println();
		System.out.println("****** ȸ�� ���� ��� ȭ�� (������ ���) *****");
		System.out.println();
		
		for(int i=0; i<member_list.size(); i++){	
				System.out.print("�̸�: "+member_list.get(i).getName() + " ��ȣ: "+member_list.get(i).getPhoneNo()
						+" ȸ�� ����: "+member_list.get(i).getType());
				
				if(member_list.get(i).getType().equals("����� ȸ��")) {
					System.out.println(" ����� ������: "+member_list.get(i).getTypeStart()+" ����� ������: "+member_list.get(i).getTypeEnd());
				}
				else if(member_list.get(i).getType().equals("�Ϲݱ� ȸ��")) {
					System.out.println(" �Ϲݱ� �̿볯¥: "+member_list.get(i).getTypeStart());
				}
				
				System.out.println();
			}
	}
	
	
	
}
