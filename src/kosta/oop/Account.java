package kosta.oop;

public class Account {
	// 공통된 데이터구조
	// 계좌번호, 계좌주, 잔액 => 상태 => 멤버변수 (필드)

	String accountNo;
	String ownerName;
	int balance;

	 public Account() {	} // default 생성자

	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// 공통된 기능 => 행동 => 멤버메서드 (오퍼레이션)
	// 입금,출금

	public void deposit(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액부족"); // 강제로 예외 처리하는 경우 throw를 사용 -> throw
											// new 변수이름()
		}

		balance -= amount;
		return amount;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

}
