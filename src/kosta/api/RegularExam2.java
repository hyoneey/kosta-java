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
		
		Pattern p = Pattern.compile("[\\D]*"); //c로시작하는 문자열을 뽑아내고 싶을때 "c[a-z]*"
		
		for(int i=0; i<data.length; i++){
			Matcher m = p.matcher(data[i]); //패턴과 data[i]값을 Matcher 클래스에 줌
			if(m.matches()){ //매칭의 조건을 확인 하는 함수  : matches()
				System.out.println(data[i]);
			}
		}*/
		
		
		String source = "abc?def?gh";
		String pattern = "(\\w*)";  //  \\w은 알파벳이나 숫자 , '(*)'은 하나의 문자열로 의미 
		
		Pattern pattern2 = Pattern.compile(pattern);
		Matcher matcher2 = pattern2.matcher(source);
		
		while(matcher2.find()){ //배열이 아니라 하나의 문자열에서 해당하는 문자열을 뽑아내고 싶을때 사용
			System.out.println(matcher2.group()); //그룹으로 묶음
		}
		
		
		//숫자만 출력
		String source2 = "HP : 010-1111-1111, HOME : 02-253-2222";
		String pattern3 = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})"; // \\d는 숫자
		
		Pattern pattern4 = Pattern.compile(pattern3);
		Matcher matcher3 = pattern4.matcher(source2);
		
		while(matcher3.find()){ //배열이 아니라 하나의 문자열에서 해당하는 문자열을 뽑아내고 싶을때 사용
			System.out.println(matcher3.group()); //그룹으로 묶음
		}

		
	}

}
