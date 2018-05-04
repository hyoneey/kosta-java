package kosta.api;

import java.util.StringTokenizer;

public class StringExam {

	public static void main(String[] args) {
		
		String str = "ABC"; //��ü ����
		String str2 = new String("abc"); //��ü ����
		
		
		//String �Һ��� - ������ �޾ƾ� ���ڿ� ������ �����ϴ�
		String str3 = str.concat("DEF"); //���ڿ� �Ҵ� - ���ڿ� �ڿ� �̾� ���̴� �Լ� concat()�̳� String str3 = �� ������� ������ ���ڿ��� ������ ����
		System.out.println(str3); // ABCDEF
		
		//StringBuffer, StirngBuilder ������ - ���ڿ��� �����ϱ� ���� Ŭ���� 
		StringBuffer sb = new StringBuffer("������");
		sb.append("�󸶹�");
		System.out.println(sb);  // �����ٶ󸶹�
		
		String sql = "select * from board ";
		int num = 10;
		if(num == 10 ){
			sql += "where num = 10"; // select * from board where num = 10
		}
		System.out.println(sql);
		
		//�ش� ���ڿ��� ��ġ�ľ� indexOf() => 0���� ���� , ������ -1
		System.out.println(sql.indexOf("*")); // 7��° �ε���
		System.out.println(sql.indexOf("$")); // -1 
		
		//���ڿ� ���� length()
		System.out.println(sql.length());
		
		
		//���ڿ� �κ� ���� -index�� 0���� ���� 
		System.out.println(sql.substring(0, 12)); // (���� �ε��� , �� �ε���) - ��� select * fro
		
		//sql������ �ִ� ���ڿ��� board ���븸 �����ؼ� �������.
		//��, substring(), indexOf() �޼ҵ常 �̿� - �ε�����ȣ�� ã�� ����	
		System.out.println(sql.substring( sql.indexOf("board"), sql.indexOf("board")+5));
		
		String fileName = "kosta.jpg";
		String head = ""; //kosta
		String patter = ""; //jpg
		
		head = fileName.substring(0,fileName.indexOf("."));
		patter = fileName.substring(fileName.indexOf(".")+1,fileName.length());
		System.out.println(head + " : " + patter);
		
		String id = "kosta ";
		String m_id = "Kosta"; // .equls() -> �ٸ����� ��� id �ڿ� ������ ���� , �� ��ҹ��� ���� �Ұ�
		
		if(id.trim().equals(m_id)){ //.trim()�� �� �� ������ �������ִ� ���� -> ���� ���
			System.out.println("����");
		}else{
			System.out.println("�ٸ�"); 
		}

		if(id.trim().equalsIgnoreCase(m_id)){ //..equalsIgnoreCase()�� ��ҹ��ڸ� �������� �ʾƼ� ������ ���
			System.out.println("����");
		}else{
			System.out.println("�ٸ�"); 
		}
		
		//���ڿ� => �迭 ��ȯ
		String fruits = "���, ��, ����, ����";
		String arr[] = fruits.split(","); //���ڿ��� ','�� �������� ����� �迭�� �־���
		
		for(String name : arr){
			System.out.println(name); //��� �� ���� ����
		}
		
		
		String a = fileName.replace(".", "++"); // kosta++jpg
		String b = fileName.replaceAll("ko", "+");// +sta.jpg
		System.out.println(a);
		System.out.println(b);
		
		
		int n = 100;
		String s = n+""; //����ȯ
		
		//fileName => Ȯ���� gif, jpg => �̹��� ���� �Դϴ�. :endsWith()�̿�
		
		if(fileName.endsWith("gif") || fileName.endsWith("jpg")){
			System.out.println("�̹��� �����Դϴ�.");
		}else{
			System.out.println("�̹��� ������ �ƴմϴ�.");
		}
		
		
		

	}

}
