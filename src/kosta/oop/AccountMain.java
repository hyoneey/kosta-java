package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {
		
/*		Account obj1, obj2;
		obj1 = new Account(); // 객체 생성
		obj2 = new Account();
		
		//객체 초기화
		obj1.accountNo ="1111-1111";
		obj1.ownerName = "김영현";
		obj1.balance = 10000;
		obj1.deposit(5000);
		
		
//		obj1.withdraw(600);
		
		obj2.accountNo ="2222-2222";
		obj2.ownerName = "김영현2";
		obj2.balance = 1000000;
		obj2.deposit(30000);
		
		System.out.println(obj1);
		System.out.println();
		System.out.println(obj2);
		
		
		System.out.println("accountNo: "+obj1.accountNo);
		System.out.println("ownerName: "+obj1.ownerName);
		System.out.println("balance: "+obj1.balance);
		System.out.println();
		
		System.out.println("accountNo: "+obj2.accountNo);
		System.out.println("ownerName: "+obj2.ownerName);
		System.out.println("balance: "+obj2.balance);
		System.out.println();
	*/

//배열 객체 생성
		
/*	
		Account arr[] = new Account[2];
		
		arr[0] = new Account();
		arr[1] = new Account();

		
		arr[0].accountNo = "111-111";
		arr[0].ownerName = "영현";
		arr[0].balance = 5000;
		System.out.println(arr[0]);

		arr[1].accountNo = "222-222";
		arr[1].ownerName = "영현2";
		arr[1].balance = 10000;
		System.out.println(arr[1]);
		*/

	//생성자 사용	
		Account obj1,obj2;
		obj1 = new Account("1234","k",10000);
		obj2 = new Account("5678","ㅣ",15000);
	
		System.out.println(obj1);
		System.out.println();
		System.out.println(obj2);
		System.out.println();
		
		Account arr[] = new Account[2];	
		arr[0] = new Account("1111","s",500000);
		arr[1] = new Account("1234567","ff",444444);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}
