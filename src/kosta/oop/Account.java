package kosta.oop;

public class Account {
	// ����� �����ͱ���
	// ���¹�ȣ, ������, �ܾ� => ���� => ������� (�ʵ�)

	String accountNo;
	String ownerName;
	int balance;

	 public Account() {	} // default ������

	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// ����� ��� => �ൿ => ����޼��� (���۷��̼�)
	// �Ա�,���

	public void deposit(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("�ܾ׺���"); // ������ ���� ó���ϴ� ��� throw�� ��� -> throw
											// new �����̸�()
		}

		balance -= amount;
		return amount;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

}
