package kosta.bank;

public class Account {

	String id;
	long balance;
	
	public Account(){}

	public Account(String id, long balance){
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount){
		this.balance += amount;
	}
	
	public boolean withdraw(long amount){

		if(amount> balance){
			return false;
		}else{
			balance -= amount;
			return true;
		}
		
	}
	
	public void setID(String id){
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public long getBalance() {
		return balance;
	}
	
	
	
}
