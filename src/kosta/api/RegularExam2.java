package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam2 {
	
	public static void main(String[] arg){
		
/*		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date","dic","diraaa", "A12S3","1234"
		};
		
		Pattern p = Pattern.compile("[\\D]*"); //c�ν����ϴ� ���ڿ��� �̾Ƴ��� ������ "c[a-z]*"
		
		for(int i=0; i<data.length; i++){
			Matcher m = p.matcher(data[i]); //���ϰ� data[i]���� Matcher Ŭ������ ��
			if(m.matches()){ //��Ī�� ������ Ȯ�� �ϴ� �Լ�  : matches()
				System.out.println(data[i]);
			}
		}*/
		
		
		String source = "abc?def?gh";
		String pattern = "(\\w*)";  //  \\w�� ���ĺ��̳� ���� , '(*)'�� �ϳ��� ���ڿ��� �ǹ� 
		
		Pattern pattern2 = Pattern.compile(pattern);
		Matcher matcher2 = pattern2.matcher(source);
		
		while(matcher2.find()){ //�迭�� �ƴ϶� �ϳ��� ���ڿ����� �ش��ϴ� ���ڿ��� �̾Ƴ��� ������ ���
			System.out.println(matcher2.group()); //�׷����� ����
		}
		
		
		//���ڸ� ���
		String source2 = "HP : 010-1111-1111, HOME : 02-253-2222";
		String pattern3 = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})"; // \\d�� ����
		
		Pattern pattern4 = Pattern.compile(pattern3);
		Matcher matcher3 = pattern4.matcher(source2);
		
		while(matcher3.find()){ //�迭�� �ƴ϶� �ϳ��� ���ڿ����� �ش��ϴ� ���ڿ��� �̾Ƴ��� ������ ���
			System.out.println(matcher3.group()); //�׷����� ����
		}

		
	}

}
