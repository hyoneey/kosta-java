package kosta.oop;

public class CheckingAccount extends Account {

	private String cardNo;

	public CheckingAccount(){}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); //�ڽ��� ������ ���� �θ�����ڸ� ȣ���Ͽ� �θ� �ִ� �����͸� �ʱ�ȭ
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return "CheckingAccount [cardNo=" + cardNo + ", accountNo=" + accountNo + ", ownerName=" + ownerName
				+ ", balance=" + balance + "]";
	}
	
	
	
	
}
