package kosta.mission;

import java.util.Scanner;

public class Mission6 {

	public static void main(String[] args){

		int kor,eng,mat,total,avg;
		String arr1[]={"국어","영어","수학","총점","평균"};
		int arr2[] = new int[5];		
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++){
			System.out.print(arr1[i] + " 입력: ");
			arr2[i]=sc.nextInt();
			arr2[3]+=arr2[i];
		}
		arr2[4]=arr2[3]/3;



		for(String s: arr1){
			System.out.print(s + "\t");
		}
		System.out.println();

		for(int j=0; j<arr1.length; j++){
			System.out.print(arr2[j]+"\t");
		}	

	}
}
