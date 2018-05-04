package kosta.bank;

public class Customer {

	private String id;
	private String name;
	private Account account;
	
	public Customer(){	}
	
	Customer(String id, String name, long balance ){
		this.id = id;
		this.name =name;
		this.account = new Account(id, balance);
	}

	public void setAccount(Account account){
		this.account = account;
	}
	
	public Account getAccount(){
		return account;
	}
	
	public void setID(String id){
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
}
