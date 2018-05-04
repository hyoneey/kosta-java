package kosta.oop;

public class CheckingAccount extends Account {

	private String cardNo;

	public CheckingAccount(){}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); //자식의 생성자 에서 부모생성자를 호출하여 부모에 있는 데이터를 초기화
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return "CheckingAccount [cardNo=" + cardNo + ", accountNo=" + accountNo + ", ownerName=" + ownerName
				+ ", balance=" + balance + "]";
	}
	
	
	
	
}
