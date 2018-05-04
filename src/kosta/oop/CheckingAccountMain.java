package kosta.oop;

public class CheckingAccountMain {
	
	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount("1111","ȫ�浿",2000,"1111");
		
		ca.deposit(100);
		System.out.println(ca);
		
		
	}
}
